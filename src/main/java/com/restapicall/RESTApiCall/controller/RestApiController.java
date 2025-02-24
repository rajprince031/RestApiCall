package com.restapicall.RESTApiCall.controller;

import com.restapicall.RESTApiCall.dto.UserDTO;
import com.restapicall.RESTApiCall.entity.UserEntity;
import com.restapicall.RESTApiCall.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestApiController {

    private final UserService userService;

    public RestApiController(UserService userService) {
        this.userService = userService;
    }

    //uc1 : Base GET Request
    @GetMapping("/")
    public String hello(){
        return "Hello from BridgeLabz";
    }

    //uc2 : Using Path PathParam
    @GetMapping("/name")
    public String callingName(@PathParam("name") String name){
        return "Hello "+name;
    }

    //uc3 : Using Path  to show Message
    @GetMapping("/hello")
    public String helloName(@PathParam("name") String name){
        return "Hello "+name + " from BridgeLabz";
    }



    //uc4 : Post Method
    @PostMapping("/user")
    public UserEntity user(@RequestBody UserDTO userDTO){
        return userService.createUser(userDTO);
    }

    //uc5 : Put method

    @PutMapping("/user/{firstName}")
    public String user(@PathVariable("firstName") String firstName,@PathParam("lastName") String lastName){
        return "My Name is "+firstName+" "+lastName;
    }
}
