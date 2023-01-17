package com.muzikapp.bimuzik.accountservice.repository;

import com.muzikapp.bimuzik.accountservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String email);

}
