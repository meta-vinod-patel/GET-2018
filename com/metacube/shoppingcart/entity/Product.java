package com.metacube.shoppingcart.entity;
/**
 * 
 * @author Vinod Patel
 *
 */
public class Product extends BaseEntity {
	
	/**
	 * Basic variable to identify a product
	 */
	
	private static int countId = 0;
	private  int stock;
	private  float price;
	
	/**
	 * Constructor to create a product
	 * @param ProductName Price and id will be generated automatically
	 */
	
	public Product(String productName, float price, int stock){
		super((++countId),productName);
		this.stock = stock;
		this.price = price;
	}
	
	/**
	 * this is a function that help to get the product id
	 * @return productId
	 */
	
	public int getProductId(){
		return super.getid();
	}
	
	/**
	 * this is a function that help to get productName
	 * @return productName
	 * 
	 */
	
	public String getProductName(){
		return super.getName();
	}
	
	/**
	 * this will set or update the stock of the product
	 * @param stock
	 */
	public void setProductStock(int stock){
		this.stock = stock;
	}
	
	/**
	 * this will return the stock value of the product
	 * @return stock
	 */
	public int getProductStock(){
		return stock;
	}
	
	/**
	 * this will set or update the price of the product
	 * @param price
	 * 
	 */
	
	public void setProductPrice(float price){
		this.price = price;
	}
	
	/**
	 * this will return the price of a product
	 * @return price
	 * 
	 */
	
	public float getProductPrice(){
		return price;
	}
}
