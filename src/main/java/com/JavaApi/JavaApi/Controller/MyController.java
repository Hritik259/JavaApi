package com.JavaApi.JavaApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaApi.JavaApi.entities.User;
import com.JavaApi.JavaApi.services.UserService;

@RestController
public class MyController {
	@Autowired
	private UserService UserService;
	
	//get the user
	@GetMapping("/Users")
	public List<User> getUsers()
	{
		return this.UserService.getUsers();
		
	}
	
	@GetMapping("Users/{userId}")
	public User getUser(@PathVariable String userId) 
	{
		return this.UserService.getUser(Long.parseLong(userId));
	}
	
	@PostMapping("/Users")
	public User addUser(@RequestBody User user) {
		return this.UserService.addUser(user);
	}
	@PutMapping("/Users")
	public User updateUser(@RequestBody User user) {
		return this.UserService.updateUser(user);
		
	}
	@DeleteMapping("Users/{userId}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userId){
		try {
			this.UserService.deleteUser(Long.parseLong(userId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
		
}
