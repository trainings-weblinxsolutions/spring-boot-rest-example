package com.salil.learnings.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salil.learnings.dao.ProductDAO;
import com.salil.learnings.model.Product;

@Service
public class ProductService implements IProductService {
	
	

	@Autowired
	ProductDAO productDAO;
	
	
	ArrayList<Product> products = new ArrayList<Product>();

	
	@Override
	public List<Map<String, Object>> findAll() {
		
		
		
		return productDAO.findAll();
	}

	@Override
	public void addProduct(Product product) throws Exception{
		System.out.println("In add product"
				+ "");
		productDAO.add(product);

	}

	@Override
	public void putProduct(Product product) throws Exception {
		
		System.out.println("In put product"
				+ "");
		productDAO.put(product);
	}

	@Override
	public void deleteProduct(int id) throws Exception {
		System.out.println("In delete product"
				+ "");
		productDAO.delete(id);
		
	}
}
