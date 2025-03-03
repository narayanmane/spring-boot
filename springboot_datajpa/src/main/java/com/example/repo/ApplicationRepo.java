package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Appliaction;

public interface ApplicationRepo  extends JpaRepository<Appliaction, Integer>{

}
