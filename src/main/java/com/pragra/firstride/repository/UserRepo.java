package com.pragra.firstride.repository;

import com.pragra.firstride.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepo extends JpaRepository<UserEntity, Integer> {

}
