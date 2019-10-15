package com.grinngotts.service;

import com.grinngotts.dto.UserDTO;
import com.grinngotts.entities.User;

public interface UserService {
    void save(User user);

    UserDTO findByUsername(String username);
}
