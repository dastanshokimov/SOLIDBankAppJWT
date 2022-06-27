package com.jusan.SOLIDBankAppJWT.account.accountTypes.accountSubtypes;

import com.jusan.SOLIDBankAppJWT.account.accountTypes.AccountDeposit;

public class FixedAccount extends AccountDeposit {
    public FixedAccount(String accountType, String id, int clientID, double balance) {
        super(accountType, id, clientID, balance);
    }
}
