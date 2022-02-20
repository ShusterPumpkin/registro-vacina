package com.pumpkin.vacina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pumpkin.vacina.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
 
}
