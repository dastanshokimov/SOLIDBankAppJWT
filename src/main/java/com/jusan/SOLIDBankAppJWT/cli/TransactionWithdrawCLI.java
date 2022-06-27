package com.jusan.SOLIDBankAppJWT.cli;

import com.jusan.SOLIDBankAppJWT.account.accountTypes.AccountWithdraw;
import com.jusan.SOLIDBankAppJWT.businessProcessInterfaces.AccountListingService;
import com.jusan.SOLIDBankAppJWT.transaction.TransactionWithdraw;
import com.jusan.SOLIDBankAppJWT.ui.WithdrawDepositOperationCLIUI;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TransactionWithdrawCLI {
    private TransactionWithdraw transactionWithdraw;
    private WithdrawDepositOperationCLIUI withdrawDepositOperationCLIUI;
    private AccountListingService accountListing;

    public void withdrawMoney(int clientID) {
        double amount = withdrawDepositOperationCLIUI.requestClientAmount();
        String accountID = withdrawDepositOperationCLIUI.requestClientAccountID();
        AccountWithdraw account = accountListing.getClientWithdrawAccount(clientID, accountID);
        if (account == null) {
            System.out.println("Error, there was not Withdraw Account found by this ID");
            return;
        }
        try { //todo handle
            transactionWithdraw.execute(account, amount);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
