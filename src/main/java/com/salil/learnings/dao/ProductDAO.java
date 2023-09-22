package com.salil.learnings.dao;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.salil.learnings.model.Product;

@Repository
public class ProductDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Map<String, Object>>  findAll() {
		
		String query = "select * from products";
		
		List<Map<String, Object>> rows=jdbcTemplate.queryForList(query);
		
		
		
		return rows;
	}

	public void add(Product product) throws Exception {
	String query = "insert into products values ("+ product.getId() +", '" + product.getProductName() +"','"+product.getBatchNo() +"',"+product.getPrice() +","+product.getProductQuantity()  + ")" ;
	System.out.println("Query : "+query);
	try {
	jdbcTemplate.execute(query);
	}
	
	catch(Exception e) {
		throw new Exception("Something wrong with the insert statement");
	}
		
	}

	public void put(Product product) throws Exception {
		String query = "update products set productName='"+product.getProductName()+"', batchNo='"+product.getBatchNo()+"', price="+product.getPrice()+", productQuantity="+product.getProductQuantity() +" where ID="+product.getId();
		
		System.out.println("Query : "+query);
		try {
		jdbcTemplate.execute(query);
		}
		
		catch(Exception e) {
			throw new Exception("Something wrong with the update statement");
		}
		
		
	}

	public void delete(int id) throws Exception {
		
		String query = "delete from products where id="+id;
		System.out.println("Query : "+query);
		try {
		jdbcTemplate.execute(query);
		}
		
		catch(Exception e) {
			throw new Exception("Something wrong with the update statement");
		}
	}
	
	
	
	

}
