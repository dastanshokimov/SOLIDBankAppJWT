package com.jusan.SOLIDBankAppJWT.businessProcessInterfaces;

import com.jusan.SOLIDBankAppJWT.account.Account;

public interface AccountDepositService {
    void deposit(double amount, Account account);
}
