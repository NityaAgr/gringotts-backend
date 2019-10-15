package com.grinngotts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.grinngotts.dao.IUserDAO;
import com.grinngotts.dto.ApiDTOBuilder;
import com.grinngotts.dto.UserDTO;
import com.grinngotts.entities.User;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private IUserDAO userRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    

    @Override
    public void save(User user) {
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        user.setRoles(new HashSet<>(roleRepository.findAll()));
//        userRepository.save(user);
    }

    @Override
    public UserDTO findByUsername(String username) {
        return ApiDTOBuilder.userToUserDTO(userRepository.getUser(username));
    }
    
    @Override
    public UserDTO findUserById(Integer userid) {
        return ApiDTOBuilder.userToUserDTO(userRepository.getUser(Integer.toString(userid)));
    }
}
