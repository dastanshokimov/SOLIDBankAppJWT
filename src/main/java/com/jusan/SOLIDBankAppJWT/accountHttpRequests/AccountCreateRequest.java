package com.jusan.SOLIDBankAppJWT.accountHttpRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountCreateRequest {
    private String accountType;
}
