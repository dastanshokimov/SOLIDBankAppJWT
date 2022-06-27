package com.jusan.SOLIDBankAppJWT.cli;

import com.jusan.SOLIDBankAppJWT.account.Account;
import com.jusan.SOLIDBankAppJWT.businessProcessInterfaces.AccountListingService;
import com.jusan.SOLIDBankAppJWT.BankCore;
import com.jusan.SOLIDBankAppJWT.ui.CreateAccountOperationUI;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class AccountBasicCLI {
    private CreateAccountOperationUI createAccountOperationUI;
    private BankCore bankCore;
    private AccountListingService accountListing;

    public void createAccountRequest(int clientID) {
        String accountType = createAccountOperationUI.requestAccountType();
        if (accountType == null) {
            return;
        }
        bankCore.createNewAccount(accountType, clientID);
    }

    public void getAccounts(int clientID) {
        List<Account> clientAccounts = accountListing.getClientAccounts(clientID);
        System.out.print("[");
        System.out.print(clientAccounts.stream().
                map(Object::toString).
                collect(Collectors.joining(", ")));
        System.out.println(']');
    }
}
