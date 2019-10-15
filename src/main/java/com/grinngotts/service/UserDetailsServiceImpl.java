package com.grinngotts.service;

import java.util.HashSet;
import java.util.Set;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.grinngotts.dao.IUserDAO;
import com.grinngotts.dto.ApiDTOBuilder;
import com.grinngotts.dto.UserDTO;
import com.grinngotts.entities.Segment;

/**
* /service/ApiDTOBuilder.java
**/
@Component
public class UserDetailsServiceImpl implements IUserService {
@Autowired
 private IUserDAO userDAO;
 
 @Override
 public UserDTO getUserByUsername(String username) {
  User user = (User) userDAO.getUser(username); 
  if (user == null) throw new UsernameNotFoundException(username);

  Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
  for (Segment segment : user.getSegment()){
      grantedAuthorities.add(new SimpleGrantedAuthority(segment.getName()));
  }
  
  return ApiDTOBuilder.userToUserDTO((com.grinngotts.entities.User) user);
 }
}