package com.example.crsr.controller;


import com.example.crsr.controller.Form.UserRegisterForm;
import com.example.crsr.result.R;
import com.example.crsr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2022-04-09
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/signUp")
    public R userSignUp(UserRegisterForm userRegisterForm) {
        return userService.register(userRegisterForm);
    }

}

