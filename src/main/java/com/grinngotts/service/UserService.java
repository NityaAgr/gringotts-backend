package com.grinngotts.service;

import com.grinngotts.entities.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
