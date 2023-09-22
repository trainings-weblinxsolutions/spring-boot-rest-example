package com.salil.learnings.service;

import java.util.List;
import java.util.Map;

import com.salil.learnings.model.Product;

public interface IProductService {
	List<Map<String, Object>> findAll();

	void addProduct(Product product) throws Exception;

	void putProduct(Product product) throws Exception;

	void deleteProduct(int id) throws Exception;
}
