package com.example.social.business;

import com.example.social.dbCollection.UserCollection;
import com.example.social.dbRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserBusiness {
    @Autowired
    public UserRepository userRepository;

    public Optional<UserCollection> findUser(String name){
        return userRepository.findById(name);
    }

    public void insertUser(UserCollection user){
        userRepository.save(user);
    }
}
