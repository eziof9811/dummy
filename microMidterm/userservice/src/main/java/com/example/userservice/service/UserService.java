package com.example.userservice.service;

import com.example.userservice.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(String email, User user);
}
