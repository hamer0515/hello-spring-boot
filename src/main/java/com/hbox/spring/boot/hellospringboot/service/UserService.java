package com.hbox.spring.boot.hellospringboot.service;

import com.hbox.spring.boot.hellospringboot.dao.UserDao;
import com.hbox.spring.boot.hellospringboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userRepository;

    public User findUserByName(String username) {
        return userRepository.findByUsername(username);
    }
}
