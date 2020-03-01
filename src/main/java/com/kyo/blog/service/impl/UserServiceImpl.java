package com.kyo.blog.service.impl;

import com.kyo.blog.dao.UserRepository;
import com.kyo.blog.po.User;
import com.kyo.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User checkUser(String username, String password) {

        User user = userRepository.findByUsernameAndPassword(username, password);
        return user;
    }
}
