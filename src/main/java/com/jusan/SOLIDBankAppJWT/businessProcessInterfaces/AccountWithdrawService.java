package com.jusan.SOLIDBankAppJWT.businessProcessInterfaces;

import com.jusan.SOLIDBankAppJWT.account.accountTypes.AccountWithdraw;

public interface AccountWithdrawService {
    void withdraw(double amount, AccountWithdraw account);
}
