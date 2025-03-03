package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Appliaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String status;
    private String position;
    
    @ManyToOne
    @JoinColumn(name = "userId",nullable = false)
    private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Appliaction(int id, String status, String position, User user) {
		super();
		this.id = id;
		this.status = status;
		this.position = position;
		this.user = user;
	}

	public Appliaction() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
