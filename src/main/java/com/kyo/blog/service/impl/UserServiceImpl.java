package com.kyo.blog.service.impl;

import com.kyo.blog.dao.UserRepository;
import com.kyo.blog.po.User;
import com.kyo.blog.service.UserService;
import com.sun.xml.bind.api.impl.NameConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User checkUser(String username, String password) {

        User user = userRepository.findByUsernameAndPassword(username, DigestUtils.md5DigestAsHex(password.getBytes(StandardCharsets.UTF_8)));
        return user;
    }
}
