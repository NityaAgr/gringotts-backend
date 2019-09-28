package com.grinngotts.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.grinngotts.entities.User;

/**
* /dao/UserDAO.java
**/
@Repository
public class UserDAO implements IUserDAO {
 @PersistenceContext
 EntityManager em;
//Returns the User whose username is the parameter 'username'.
 @Override
 public User getUser(String username) {
  // The find's method search a record using the primary key.
  return em.find(User.class, username);
 }
}

