package com.metacube.shoppingcart.entity;

/**
 * it will add product to cart
 * @author Vinod Patel
 *
 */
public class Cart {


	public Product product;
	
	public Cart(Product product){
		this.product = product;
	}
	
	/**
	 * this will return the price
	 * @return totalPrice
	 */
	public Product getProduct(){
		return product;
	}
	
}
