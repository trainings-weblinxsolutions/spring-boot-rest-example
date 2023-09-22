package com.salil.learnings.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salil.learnings.dao.ProductDAO;
import com.salil.learnings.dao.UserDAO;
import com.salil.learnings.model.Product;
import com.salil.learnings.model.User;

@Service
public class UserService implements IUserService {
	
	

	@Autowired
	UserDAO userDAO;
	
	
	ArrayList<User> users = new ArrayList<User>();

	
	@Override
	public List<Map<String, Object>> findAll() {
		
		
		
		return userDAO.findAll();
	}

	@Override
	public void addUser(User user) throws Exception{
		System.out.println("In add user"
				+ "");
		userDAO.add(user);

	}

	
}
