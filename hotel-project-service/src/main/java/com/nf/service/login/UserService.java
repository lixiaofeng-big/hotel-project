package com.nf.service.login;

import com.nf.entity.login.User;

public interface UserService {
    User loginVerify(String username, String password);
}
