package com.example.userservice.vo;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestUser {
    @NotNull(message = "email can't be null")
    @Size(min = 2, message = "email not be less than two characters")
    @Email
    private String email;

    @NotNull(message = "name can't be null")
    @Size(min = 2, message = "name not be less than two characters")
    private String name;

    @NotNull(message = "password can't be null")
    @Size(min = 2, message = "password must be equal or greater than eight characters")
    private String pwd;
}
