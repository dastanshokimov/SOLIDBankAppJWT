package com.jusan.SOLIDBankAppJWT.businessProcessInterfaceImpl;

import com.jusan.SOLIDBankAppJWT.account.Account;

import com.jusan.SOLIDBankAppJWT.account.AccountRepository;
import com.jusan.SOLIDBankAppJWT.businessProcessInterfaces.AccountDepositService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountDepositServiceImpl implements AccountDepositService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void deposit(double amount, Account account) {
        accountRepository.updateAccount(account.getId(), account.getBalance()+amount);
    }
}
