package com.pragra.firstride.controller;

import com.pragra.firstride.UserEntity;
import com.pragra.firstride.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("add")
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user){
         return userService.createUser(user);
    }
}
