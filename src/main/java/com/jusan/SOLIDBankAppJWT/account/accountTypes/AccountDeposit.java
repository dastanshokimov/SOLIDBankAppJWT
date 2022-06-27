package com.jusan.SOLIDBankAppJWT.account.accountTypes;

import com.jusan.SOLIDBankAppJWT.account.Account;

public class AccountDeposit extends Account {
    public AccountDeposit(String accountType, String id, int clientID, double balance) {
        super(accountType, id, clientID, balance, false);
    }
}
