package com.jusan.SOLIDBankAppJWT.businessProcessInterfaceImpl;

import com.jusan.SOLIDBankAppJWT.businessProcessInterfaces.AccountCreationService;
import com.jusan.SOLIDBankAppJWT.account.Account;
import com.jusan.SOLIDBankAppJWT.account.AccountRepository;
import com.jusan.SOLIDBankAppJWT.account.accountTypes.accountSubtypes.CheckingAccount;
import com.jusan.SOLIDBankAppJWT.account.accountTypes.accountSubtypes.FixedAccount;
import com.jusan.SOLIDBankAppJWT.account.accountTypes.accountSubtypes.SavingAccount;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountCreationServiceImpl implements AccountCreationService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void create(String accountType, long bankID, int clientID, String accountID) {
        Account account = switch (accountType) {
            case "SAVING" -> new SavingAccount(accountType, accountID, clientID, 0);
            case "CHECKING" -> new CheckingAccount(accountType, accountID, clientID, 0);
            case "FIXED" -> new FixedAccount(accountType, accountID, clientID, 0);
            default -> throw new IllegalStateException("Unexpected value");
        };
        accountRepository.createNewAccount(account.getId(), account.getAccountType(), account.getClientID(),
                account.getBalance(), account.isWithdrawAllowed());
    }
}
