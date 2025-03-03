package com.example.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Resume {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String conetent;
	
	@OneToOne
	@JoinColumn(name = "userId",nullable = false)
	@JsonIgnore
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConetent() {
		return conetent;
	}

	public void setConetent(String conetent) {
		this.conetent = conetent;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Resume(int id, String conetent, User user) {
		super();
		this.id = id;
		this.conetent = conetent;
		this.user = user;
	}

	public Resume() {
	
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Resume [id=" + id + ", conetent=" + conetent + ", user=" + user + "]";
	}

}
