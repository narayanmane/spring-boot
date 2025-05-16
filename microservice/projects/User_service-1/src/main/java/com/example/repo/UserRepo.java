package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.User;

public interface UserRepo extends JpaRepository<User, String> {

}
