package com.example.crsr.controller;


import com.example.crsr.controller.Form.UserRegisterForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2022-04-09
 */
@Controller
public class UserController {

    @GetMapping("signUp")//页面的url地址
    public String getindex(Model model)//对应函数
    {
        UserRegisterForm user1 = new UserRegisterForm(123,"ddd",123,"232","123");
        model.addAttribute("user",user1);//储存javabean
        model.addAttribute("name","bigsai");
        return "signUp";//与templates中index.html对应
    }

}

