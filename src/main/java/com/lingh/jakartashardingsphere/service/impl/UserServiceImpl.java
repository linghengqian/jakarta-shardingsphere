package com.lingh.jakartashardingsphere.service.impl;

import com.lingh.jakartashardingsphere.entity.User;
import com.lingh.jakartashardingsphere.mapper.UserMapper;
import com.lingh.jakartashardingsphere.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectUsersFromMaster() {
        return userMapper.selectUsers();
    }

    @Override

    public List<User> selectUsersFromShardingSlave() {
        return userMapper.selectUsers();
    }


    @Override
    public void addUser(User user) {
        userMapper.addUser(user.getName(), user.getAge());
    }


    @Override
    public void deleteUserById(Long id) {
        userMapper.deleteUserById(id);
    }
}
