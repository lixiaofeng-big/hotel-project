package com.nf.service.login.impl;

import com.nf.dao.login.UserDao;
import com.nf.entity.login.User;
import com.nf.service.login.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: hotel-project-parent
 * @description:
 * @author: admin
 * @create: 2019-12-02 11:13
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User loginVerify(String username, String password) {
        return userDao.loginVerify(username, password);
    }
}
