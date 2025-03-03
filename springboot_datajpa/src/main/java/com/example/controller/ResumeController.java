package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Resume;

@RestController
@RequestMapping("/re")
public class ResumeController {

	@Autowired
	private resumeService resumeService;
	
	@PostMapping("/{id}/resume")
	public ResponseEntity<Resume>addresume(@PathVariable int id, @RequestBody Resume resume){
		return ResponseEntity.ok(resumeService.addResume(id,resume));
	}
}
