package com.jusan.SOLIDBankAppJWT;

import com.jusan.SOLIDBankAppJWT.businessProcessInterfaceImpl.AccountCreationServiceImpl;
import com.jusan.SOLIDBankAppJWT.businessProcessInterfaceImpl.AccountDepositServiceImpl;
import com.jusan.SOLIDBankAppJWT.businessProcessInterfaceImpl.AccountListingServiceImpl;
import com.jusan.SOLIDBankAppJWT.businessProcessInterfaceImpl.AccountWithdrawServiceImpl;
import com.jusan.SOLIDBankAppJWT.businessProcessInterfaces.AccountCreationService;
import com.jusan.SOLIDBankAppJWT.businessProcessInterfaces.AccountDepositService;
import com.jusan.SOLIDBankAppJWT.businessProcessInterfaces.AccountListingService;
import com.jusan.SOLIDBankAppJWT.businessProcessInterfaces.AccountWithdrawService;
import com.jusan.SOLIDBankAppJWT.cli.AccountBasicCLI;
import com.jusan.SOLIDBankAppJWT.cli.TransactionDepositCLI;
import com.jusan.SOLIDBankAppJWT.cli.TransactionWithdrawCLI;
import com.jusan.SOLIDBankAppJWT.transaction.TransactionDeposit;
import com.jusan.SOLIDBankAppJWT.transaction.TransactionWithdraw;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MyCLI myCLI() {
        return new MyCLI();
    }

    @Bean
    public AccountCreationService accountCreation() {
        return new AccountCreationServiceImpl();
    }

    @Bean
    public AccountListingService accountListing() {
        return new AccountListingServiceImpl();
    }

    @Bean
    public AccountWithdrawService accountWithdrawService() {
        return new AccountWithdrawServiceImpl();
    }

    @Bean
    public AccountDepositService accountDepositService() {
        return new AccountDepositServiceImpl();
    }

    @Bean
    public BankCore bankCore() {
        return new BankCore(accountCreation());
    }

    @Bean
    public AccountBasicCLI accountBasicCLI() {
        return new AccountBasicCLI(myCLI(), bankCore(), accountListing());
    }


    @Bean
    public TransactionWithdraw transactionWithdraw() {
        return new TransactionWithdraw(accountWithdrawService());
    }

    @Bean
    public TransactionWithdrawCLI transactionWithdrawCLI() {
        return new TransactionWithdrawCLI(transactionWithdraw(), myCLI(), accountListing());
    }

    @Bean
    public TransactionDeposit transactionDeposit() {
        return new TransactionDeposit(accountDepositService());
    }

    @Bean
    public TransactionDepositCLI transactionDepositCLI() {
        return new TransactionDepositCLI(transactionDeposit(), myCLI(), accountListing());
    }

}
