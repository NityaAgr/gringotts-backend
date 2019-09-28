package com.grinngotts.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.grinngotts.dao.IUserDAO;
import com.grinngotts.dto.ApiDTOBuilder;
import com.grinngotts.dto.UserDTO;

/**
* /service/ApiDTOBuilder.java
**/
@Component
public class UserService implements IUserService {
@Autowired
 private IUserDAO userDAO;
 
 @Override
 public UserDTO getUserByUsername(String username) {
  User user = (User) userDAO.getUser(username); 
  return ApiDTOBuilder.userToUserDTO((com.grinngotts.entities.User) user);
 }
}