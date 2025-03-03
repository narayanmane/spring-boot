package com.example.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.Entity.User;

public interface UserPadingandsortingrepo  extends PagingAndSortingRepository<User, Integer>{

}
