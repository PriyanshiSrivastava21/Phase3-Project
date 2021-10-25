package com.simplilearn.webservices.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.webservices.entity.User;
import com.simplilearn.webservices.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	
	@Autowired
	
	UserRepository uRepo;
	
	//list product
		@GetMapping("/users")
		public List<User> getUsers(){
			return uRepo.findAll();
			
		}
		//get one product
		@GetMapping("/users/{id}")
		public User getUsers(@PathVariable("id") long id){
			
			
			return uRepo.findById(id).get();
			
		}
		
		//add product
		@PostMapping("/users")
		public User addUser(@RequestBody User userObj){
			
			 return uRepo.save(userObj);
			
		}
		
		//update product
		
		@PutMapping("/users")
		public User updateUser(@RequestBody User userObj) {
			
		User fetchedUser=uRepo.findById(userObj.getId()).get();
		if(fetchedUser!=null) {
			fetchedUser.setName(userObj.getName());
			fetchedUser.setRole(userObj.getRole());
			
			return uRepo.save(fetchedUser);
		}
		return null;
			
		}
		
		//delete product
		@DeleteMapping("/users/{id}")
		public User deleteUser(@PathVariable("id") long id) {
			
			User fetchedUser =uRepo.findById(id).get();
			if(fetchedUser != null) {
				uRepo.delete(fetchedUser);
					
			}
			
		
			return null;
			
		}
	
	

	
}
