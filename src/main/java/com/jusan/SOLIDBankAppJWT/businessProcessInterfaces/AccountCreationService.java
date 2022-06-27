package com.jusan.SOLIDBankAppJWT.businessProcessInterfaces;

public interface AccountCreationService {
    void create(String accountType, long bankID, int clientID, String accountID);
}
