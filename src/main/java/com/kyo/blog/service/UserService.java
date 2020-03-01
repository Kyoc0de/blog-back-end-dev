package com.kyo.blog.service;

import com.kyo.blog.po.User;

public interface UserService {

    User checkUser(String username, String password);

}
