package com.restapicall.RESTApiCall.service;

import com.restapicall.RESTApiCall.dto.UserDTO;
import com.restapicall.RESTApiCall.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserEntity createUser(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity(userDTO.getFirstName(), userDTO.getLastName());
        return userEntity;
    }
}
