package com.salil.learnings.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.salil.learnings.model.Product;
import com.salil.learnings.service.IProductService;

@RestController
public class ProductController {
	@Autowired
	private IProductService productService;

	@GetMapping(value = "/products")
	public List<Map<String, Object>> getProduct() {
		List<Map<String, Object>> products = productService.findAll();
		return products;
	}

	@PostMapping(value = "/products")
	public String addProduct(@RequestBody Product product) throws Exception {

		productService.addProduct(product);

		return "Product added";
	}
	
	@PutMapping(value = "/products")
	public String putProduct(@RequestBody Product product) throws Exception {

		productService.putProduct(product);

		return "Product updated if existed or created";
	}
	
	@DeleteMapping(value = "/products/{id}")
	public String deleteProduct(@PathVariable Integer id ) throws Exception {
		System.out.println("Id : "+id);

		productService.deleteProduct(id);

		return "Deleted Product";
	}

}
