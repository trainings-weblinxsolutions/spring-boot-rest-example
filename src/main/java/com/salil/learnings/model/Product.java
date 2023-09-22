package com.salil.learnings.model;

public class Product {
	private int id;
	private String productName;
	private String batchNo;
	private double price;
	private int productQuantity;

//default constructor
	public Product() {

	}

//constructor using fields
	public Product(int id, String pname, String batchno, double price, int productQuantity) {
		super();
		this.id = id;
		this.productName = pname;
		this.batchNo = batchno;
		this.price = price;
		this.productQuantity = productQuantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

//getters and setters
	
	
	
	
}