package com.smp.web.service.common;

import com.smp.web.entity.common.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
