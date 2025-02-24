package com.restapicall.RESTApiCall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApiController {

    //uc1 : Base GET Request
    @GetMapping
    public String hello(){
        return "Hello from BridgeLabz";
    }
}
