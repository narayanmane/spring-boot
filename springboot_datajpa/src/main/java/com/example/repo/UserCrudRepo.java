package com.example.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.Entity.User;

public interface UserCrudRepo  extends CrudRepository<User, Integer>{

}
