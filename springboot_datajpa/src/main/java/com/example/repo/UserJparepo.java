package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Entity.User;

public interface UserJparepo  extends JpaRepository<User, Integer>{
   // query merhod 
	List<User> findByStatus(String status);
	List<User> findByNameAndStatus(String name,String status);
	// find the sstatus and order by name 
	List<User> findByStatusOrderByNameAsc(String status);
	
	
	// Query annoation 
	
	//@Query("select a drom User a where a.name LIKE%:name:%")
//	List<User> findUserBypartialName(@Param("name") String name);	
}
