package com.jusan.SOLIDBankAppJWT.account.accountTypes;

import com.jusan.SOLIDBankAppJWT.account.Account;

public class AccountWithdraw extends Account {
    public AccountWithdraw(String accountType, String id, int clientID, double balance) {
        super(accountType, id, clientID, balance, true);
    }
}
