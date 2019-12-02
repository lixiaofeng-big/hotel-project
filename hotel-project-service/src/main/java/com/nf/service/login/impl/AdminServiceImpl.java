package com.nf.service.login.impl;

import com.nf.dao.login.AdminDao;
import com.nf.entity.login.User;
import com.nf.service.login.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: hotel-project-parent
 * @description:
 * @author: admin
 * @create: 2019-12-02 11:29
 **/
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public User loginVerify(String username, String password) {
        return adminDao.loginVerify(username, password);
    }
}
