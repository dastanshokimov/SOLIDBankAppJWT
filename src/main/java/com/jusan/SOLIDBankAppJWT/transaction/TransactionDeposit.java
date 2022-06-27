package com.jusan.SOLIDBankAppJWT.transaction;

import com.jusan.SOLIDBankAppJWT.businessProcessInterfaces.AccountDepositService;
import com.jusan.SOLIDBankAppJWT.account.Account;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

public class TransactionDeposit {
    private AccountDepositService accountDepositService;
    @Autowired
    private TransactionRepository transactionRepository;

    public TransactionDeposit(AccountDepositService accountDepositService) {
        this.accountDepositService =accountDepositService;
    }

    public void execute(Account account, double amount) {
        accountDepositService.deposit(amount, account);
        transactionRepository.addTransaction(account.getId(), amount, "deposit");
//        System.out.println(transactionDAO.getTransactions().get(transactionDAO.getTransactions().size() - 1).transaction);
    }
}
