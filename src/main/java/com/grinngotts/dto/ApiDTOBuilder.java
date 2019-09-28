package com.grinngotts.dto;

import com.grinngotts.entities.User;

/**
* /dto/ApiDTOBuilder.java
**/
public class ApiDTOBuilder {
 public static UserDTO userToUserDTO(User user) {
  return new UserDTO(user.getUsername(), "", user.getUserType(), 
    user.getEmail(), user.getName(), user.getLastName(), 
    user.getTel(), user.getBornDate());
 }
}
