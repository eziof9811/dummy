package com.example.userservice.service;

import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
    @Override
    public void updateUser(String email, User user) {
        userRepository.save(user);
    }
}
