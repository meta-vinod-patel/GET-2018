package com.metacube.shoppingcart.entity;

/**
 * this class returns the product details
 * @autor Vinod Patel
 */
public class Product {
	private static int countId = 0;
	private int id;
	private String name;
	private float price;
	/**
	 * Now creating the cunstructor for the product class
	 * @param name
	 * @param price
	 * 
	 */
	
	public Product(String name, float price){
		this.name = name;
		this.price = price;
		this.id   = countId++;
	}
	
	/**
	 * get the product price
	 * @return
	 */
	
	public float getPrice(){
		return price;
	}
	
	/**
	 * set the price of the product
	 * @param price
	 */
	
	public void setPrice(float price){
		this.price = price;
	}
	
	/**
	 * get product name 
	 * @return Product name
	 * 
	 */
	public String getProductName(){
		return name;
	}
	
	/**
	 * set product name
	 * @param name
	 * 
	 */
	public void setProductName(String name){
		this.name = name;
	}
	
	/**
	 * get product Id
	 * @return productId
	 * 
	 */
	
	public int getProductId(){
		return id;
	}
	
}
