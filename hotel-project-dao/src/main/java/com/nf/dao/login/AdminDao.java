package com.nf.dao.login;

import com.nf.entity.login.User;

/**
 * @program: hotel-project-parent
 * @description: 登录dao
 * @author: admin
 * @create: 2019-12-02 10:54
 **/

public interface AdminDao {
    User loginVerify(String username, String password);
}
