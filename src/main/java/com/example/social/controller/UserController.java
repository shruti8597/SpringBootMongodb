package com.example.social.controller;

import com.example.social.business.UserBusiness;
import com.example.social.dbCollection.UserCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserBusiness userBusiness;

    @GetMapping("/{userId}")
    public Optional<UserCollection> findUser(@PathVariable String userId){
        return userBusiness.findUser(userId);
    }

    @PostMapping
    public void insert(@RequestBody UserCollection user) {
        userBusiness.insertUser(user);
    }

}
