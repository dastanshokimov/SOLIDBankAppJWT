package com.jusan.SOLIDBankAppJWT.businessProcessInterfaceImpl;

import com.jusan.SOLIDBankAppJWT.account.AccountRepository;
import com.jusan.SOLIDBankAppJWT.account.accountTypes.AccountWithdraw;
import com.jusan.SOLIDBankAppJWT.businessProcessInterfaces.AccountWithdrawService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountWithdrawServiceImpl implements AccountWithdrawService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void withdraw(double amount, AccountWithdraw account) {
        accountRepository.updateAccount(account.getId(), account.getBalance()-amount);
    }
}
