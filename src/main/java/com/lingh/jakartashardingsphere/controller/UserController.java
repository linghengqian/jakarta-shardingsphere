package com.lingh.jakartashardingsphere.controller;

import com.lingh.jakartashardingsphere.entity.User;
import com.lingh.jakartashardingsphere.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private static final Random RANDOM = new Random();
    private final UserService userService;

    @GetMapping("master")
    public List<User> master() {
        return userService.selectUsersFromMaster();
    }

    @GetMapping("sharding_sphere")
    public List<User> shardingSlave() {
        return userService.selectUsersFromShardingSlave();
    }

    @PostMapping("sharding_sphere")
    public User addUser() {
        User user = new User();
        user.setName("测试用户" + RANDOM.nextInt());
        user.setAge(RANDOM.nextInt(100));
        userService.addUser(user);
        return user;
    }

    @DeleteMapping("sharding_sphere/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return "成功删除用户" + id;
    }
}
