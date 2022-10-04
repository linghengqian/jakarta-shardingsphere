package com.lingh.jakartashardingsphere.service;


import com.lingh.jakartashardingsphere.entity.User;

import java.util.List;

public interface UserService {
    List<User> selectUsersFromMaster();

    List<User> selectUsersFromShardingSlave();

    void addUser(User user);

    void deleteUserById(Long id);
}
