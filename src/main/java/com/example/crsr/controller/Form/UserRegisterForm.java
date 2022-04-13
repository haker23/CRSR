package com.example.crsr.controller.Form;

import lombok.Data;

@Data
public class UserRegisterForm {
    private Integer userId;

    private String name;

    private Integer phone;

    private String email;

    private String password;
}
