package com.nf.service.login;

import com.nf.entity.login.User;

public interface AdminService {
    User loginVerify(String username, String password);
}
