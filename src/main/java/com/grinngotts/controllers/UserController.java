package com.grinngotts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grinngotts.dto.UserDTO;
import com.grinngotts.service.UserService;
import com.grinngotts.service.UserServiceImpl;

/**
* /controllers/UserController.java
**/
@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {

//@Autowired
 UserService service = new UserServiceImpl();
 
 @RequestMapping(value="{username}/login", method=RequestMethod.GET, produces="application/json" )
 public ResponseEntity<UserDTO> logIn(@PathVariable String username) {
  UserDTO user = service.findByUsername(username);
  return new ResponseEntity<>(user, HttpStatus.OK);
 }
 
 @RequestMapping(value="{userid}", method=RequestMethod.GET, produces="application/json" )
 public ResponseEntity<UserDTO> findUser(@PathVariable Integer userid) {
  UserDTO user = service.findUserById(userid);
  return new ResponseEntity<>(user, HttpStatus.OK);
 }
 
}
