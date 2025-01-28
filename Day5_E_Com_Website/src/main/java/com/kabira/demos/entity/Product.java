package com.kabira.demos.entity;

public class Product {
	
	String productName ;
	String productId ;
	String productQuantity;
	String productPrice ;
	public Product(String productName, String productId, String productQuantity, String productPrice) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
	
	

}
