package com.jusan.SOLIDBankAppJWT.transaction;

import com.jusan.SOLIDBankAppJWT.businessProcessInterfaces.AccountWithdrawService;
import com.jusan.SOLIDBankAppJWT.account.accountTypes.AccountWithdraw;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

public class TransactionWithdraw {
    private AccountWithdrawService accountWithdrawService;
    @Autowired
    private TransactionRepository transactionRepository;

    public TransactionWithdraw(AccountWithdrawService accountWithdrawService) {
        this.accountWithdrawService = accountWithdrawService;
    }

    public void execute(AccountWithdraw account, double amount) throws Exception {
        if (account.getBalance() > amount) {
            accountWithdrawService.withdraw(amount, account);
            transactionRepository.addTransaction(account.getId(), amount, "withdraw");
        } else {
            throw new Exception("You do not have sufficient funds for this operation");
        }

    }
}
