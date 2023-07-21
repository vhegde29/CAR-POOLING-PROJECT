package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.User;
import com.dxc.service.impl.UserService;
;

@RestController
@RequestMapping("/newuser")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/allusers")
	public List<User> getAllUsers(){
		return userService.findAll();
		
	}
	@GetMapping(value="/{fname}")
	public User getByFname(@PathVariable String fname ) {
		return userService.findByFname(fname);
	}
	
	@PostMapping("/details")
	public ResponseEntity<?> saveUser(@RequestBody User user){
		userService.saveOrUpdateUser(user);
		return new ResponseEntity("User Registered successfully", HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{uid}")
	public ResponseEntity<?> deleteUser(@PathVariable Integer uid) {
		userService.deleteUser(uid);
		return new ResponseEntity("User deleted successfully", HttpStatus.OK);
	}
	
}
