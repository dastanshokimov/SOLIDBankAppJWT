package com.jusan.SOLIDBankAppJWT.businessProcessInterfaces;

import com.jusan.SOLIDBankAppJWT.account.Account;
import com.jusan.SOLIDBankAppJWT.account.accountTypes.AccountWithdraw;

import java.util.List;

public interface AccountListingService {
    Account getClientAccount(int clientID, String accountID);
    AccountWithdraw getClientWithdrawAccount(int clientID, String accountID);
    List<Account> getClientAccounts(int clientID);
    List<Account> getClientAccountsByType(int clientID, String accountType);
    Account getAccount(String accountID);

}
