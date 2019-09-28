package com.grinngotts.service;

import com.grinngotts.dto.UserDTO;

/**
* /service/IUserService.java
**/
public interface IUserService {
 public UserDTO getUserByUsername(String username);
}