package com.example.crsr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.crsr.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2022-04-09
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
