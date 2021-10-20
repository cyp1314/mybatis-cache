package com.example.mybatiscache.service.impl;

import com.example.mybatiscache.entity.User;
import com.example.mybatiscache.mapper.UserMapper;
import com.example.mybatiscache.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author 陈永鹏
 * @since 2021-10-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
