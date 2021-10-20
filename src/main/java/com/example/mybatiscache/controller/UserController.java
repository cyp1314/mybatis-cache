package com.example.mybatiscache.controller;


import com.example.mybatiscache.entity.User;
import com.example.mybatiscache.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户信息 前端控制器
 * </p>
 *
 * @author 陈永鹏
 * @since 2021-10-20
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @GetMapping("/list")
    public Object list(){

        redisTemplate.opsForValue().set("tt", "tt");

        List<User> list = userService.list();
        return list;
    }
}
