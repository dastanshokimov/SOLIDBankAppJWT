package com.jusan.SOLIDBankAppJWT.user;

import lombok.Data;
import jakarta.validation.constraints.NotEmpty;

@Data
public class SignUpRequest {
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
}