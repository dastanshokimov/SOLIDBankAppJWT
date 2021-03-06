package com.jusan.SOLIDBankAppJWT.businessProcessInterfaceImpl;

import com.jusan.SOLIDBankAppJWT.account.Account;
import com.jusan.SOLIDBankAppJWT.account.AccountRepository;
import com.jusan.SOLIDBankAppJWT.account.accountTypes.AccountWithdraw;
import com.jusan.SOLIDBankAppJWT.businessProcessInterfaces.AccountListingService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountListingServiceImpl implements AccountListingService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account getClientAccount(int clientID, String accountID) {
        return accountRepository.getClientAccount(clientID, accountID);
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(int clientID, String accountID) {
        return accountRepository.getClientWithdrawAccount(clientID, accountID);
    }

    @Override
    public List<Account> getClientAccounts(int clientID) {
        return accountRepository.getClientAccounts(clientID);
    }

    @Override
    public List<Account> getClientAccountsByType(int clientID, String accountType) {
        return accountRepository.getClientAccountsByType(clientID, accountType);
    }

    @Override
    public Account getAccount(String accountID) {
        return accountRepository.getAccount(accountID);
    }
}
