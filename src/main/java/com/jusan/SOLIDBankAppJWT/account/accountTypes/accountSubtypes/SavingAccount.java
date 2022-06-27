package com.jusan.SOLIDBankAppJWT.account.accountTypes.accountSubtypes;

import com.jusan.SOLIDBankAppJWT.account.accountTypes.AccountWithdraw;

public class SavingAccount extends AccountWithdraw {
    public SavingAccount(String accountType, String id, int clientID, double balance) {
        super(accountType, id, clientID, balance);
    }
}
