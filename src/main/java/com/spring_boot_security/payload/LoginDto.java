package com.spring_boot_security.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDto {
    private String usernameOrEmail;
    private String password;
}