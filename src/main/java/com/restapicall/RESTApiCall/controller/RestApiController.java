package com.restapicall.RESTApiCall.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

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

}
