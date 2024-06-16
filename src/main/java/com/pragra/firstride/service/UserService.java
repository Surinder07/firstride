package com.pragra.firstride.service;

import com.pragra.firstride.UserEntity;
import com.pragra.firstride.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    /**
     * we are saving new user to the userdb
     * @param user
     * @return user saved in db returned with a response entity
     */
    public ResponseEntity<UserEntity> createUser(UserEntity user){
        UserEntity savedUserEntity = userRepo.save(user);
        return ResponseEntity.ok(savedUserEntity);

    }

}
