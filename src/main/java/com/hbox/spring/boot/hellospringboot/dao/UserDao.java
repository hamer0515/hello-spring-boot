package com.hbox.spring.boot.hellospringboot.dao;

import com.hbox.spring.boot.hellospringboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
