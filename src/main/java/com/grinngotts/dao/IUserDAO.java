package com.grinngotts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grinngotts.entities.User;

/**
* /dao/IUserDAO.java
*/
public interface IUserDAO  extends JpaRepository<User, Long>{
 public User getUser(String username);
}
