package com.example.mybatis_demo.service;

import com.example.mybatis_demo.mapper.UserMapper;
import com.example.mybatis_demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired(required=false)
    public UserMapper userMapper;

    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }

    public List<User> findUserByUserId(int userid){
        return userMapper.findUserByUserId(userid);
    }
}
