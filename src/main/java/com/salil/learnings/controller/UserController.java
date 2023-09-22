package com.salil.learnings.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.salil.learnings.model.Product;
import com.salil.learnings.model.User;
import com.salil.learnings.user.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(value = "/users")
	public List<Map<String, Object>> getUsers() {
		List<Map<String, Object>> users = userService.findAll();
		return users;
	}
	
	@PostMapping(value="/users")
	public String addUser(@RequestBody User user) throws Exception {
		userService.addUser(user);

		return "User added";
	}

}
