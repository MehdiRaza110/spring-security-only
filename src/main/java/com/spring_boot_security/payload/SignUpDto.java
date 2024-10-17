package com.spring_boot_security.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpDto {
    private String name;
    private String username;
    private String email;
    private String password;
}
