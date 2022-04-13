package com.example.crsr.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.crsr.entity.User;
import com.example.crsr.result.R;
import com.example.crsr.controller.Form.UserRegisterForm;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2022-04-09
 */
public interface UserService extends IService<User> {

    R register(UserRegisterForm userRegisterForm);
}
