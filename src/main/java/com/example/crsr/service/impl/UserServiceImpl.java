package com.example.crsr.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.crsr.controller.Form.UserRegisterForm;
import com.example.crsr.entity.User;
import com.example.crsr.mapper.UserMapper;
import com.example.crsr.result.R;
import com.example.crsr.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2022-04-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    public R register(UserRegisterForm userRegisterForm) {

        return new R(true, "注册成功");
    }

}
