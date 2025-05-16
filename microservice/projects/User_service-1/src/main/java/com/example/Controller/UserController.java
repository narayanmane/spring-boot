package com.example.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.User;
import com.example.service.UserService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<User> createuser(@RequestBody User user){
		  user.setUserid(UUID.randomUUID().toString());
		 User us= userService.saveuser(user);
		return  ResponseEntity.ok(us);
		 
	}
	
	
	@GetMapping
	public ResponseEntity<List<User>> getAllusers(){
		return ResponseEntity.ok(userService.getAllUser());
	}
	 int count=1;
	@GetMapping("/{id}")
	//@CircuitBreaker(name="ratinghotelbreaker" ,fallbackMethod = "ratinghotelfollow")
	//@Retry(name="ratinghotelretry" ,fallbackMethod = "ratinghotelfollow")
	@RateLimiter(name="ratinghotelRL" ,fallbackMethod = "ratinghotelfollow")
	public ResponseEntity<User> getsingleuser(@PathVariable String id){
		System.out.println("retry count -->"+count);
		count++;
		return ResponseEntity.ok(userService.getSingleUser(id));
	}
	
	
	// cicurit breaker  follow back method in R4J
	
	public ResponseEntity<User> ratinghotelfollow(String id,Exception ex){
		System.out.println("some server is down"+ex.getMessage());
		User us= new User();
		us.setEmail("dummy@mail.com");
		us.setName("dummy");
		us.setAbout("if service is down then getting dummy object");
		
		return new ResponseEntity<>(us,HttpStatus.OK);
	}
}
