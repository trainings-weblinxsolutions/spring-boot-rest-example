package com.salil.learnings.user.service;

import java.util.List;
import java.util.Map;

import com.salil.learnings.model.Product;
import com.salil.learnings.model.User;

public interface IUserService {
	List<Map<String, Object>> findAll();
	void addUser(User user) throws Exception;

}
