package com.example.mybatis_demo.mapper;

import com.example.mybatis_demo.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> findAllUser();
    public List<User> findUserByUserId(int userid);
}