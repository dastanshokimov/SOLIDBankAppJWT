package com.jusan.SOLIDBankAppJWT.cli;

import com.jusan.SOLIDBankAppJWT.account.Account;
import com.jusan.SOLIDBankAppJWT.businessProcessInterfaces.AccountListingService;
import com.jusan.SOLIDBankAppJWT.transaction.TransactionDeposit;
import com.jusan.SOLIDBankAppJWT.ui.WithdrawDepositOperationCLIUI;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TransactionDepositCLI {
    TransactionDeposit transactionDeposit;
    WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    AccountListingService accountListing;

    public void depositMoney(int clientID) {
        double amount = withdrawDepositOperationCLIUI.requestClientAmount();
        String accountID = withdrawDepositOperationCLIUI.requestClientAccountID();
        Account account = accountListing.getClientAccount(clientID, accountID);
        if (account == null) {
            System.out.println("Error, you entered wrong account number");
            return;
        }
        transactionDeposit.execute(account, amount);
    }
}
