package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String> {

}
