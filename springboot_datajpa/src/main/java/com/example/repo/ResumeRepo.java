package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Resume;

public interface ResumeRepo extends JpaRepository<Resume, Integer> {

}
