package com.example.crsr.controller.Form;

import lombok.Data;

@Data
public class UserRegisterForm {
    private Integer userId;

    private String name;

    public UserRegisterForm() {
    }

    public UserRegisterForm(Integer userId, String name, Integer phone, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    private Integer phone;

    private String email;

    private String password;
}
