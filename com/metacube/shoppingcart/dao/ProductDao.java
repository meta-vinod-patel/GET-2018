package com.metacube.shoppingcart.dao;

import java.util.ArrayList;
import java.util.List;

import com.metacube.shoppingcart.entity.Cart;
import com.metacube.shoppingcart.entity.Product;

/**
 * 
 * @author Vinod Patel
 *
 */
public class ProductDao {
	/**
	 * Making ProductDao a Singleton class
	 */
	private static ProductDao productDao;
	public List<Product> productList = new ArrayList<Product>();
	public List<Cart> cartList = new ArrayList<Cart>();
	
	private ProductDao(){}
	
	public static ProductDao getInstance(){
		if(productDao == null){
			productDao = new ProductDao();
		}
		
		return productDao;
	}
	
	/**
	 * This will return the list of product
	 * @return
	 */
	
	public List<Product> getProductList(){
		return productList;
	}
	
	/**
	 * it will add product to list
	 * @param product
	 */
	public void addProductToList(Product product){
		try{
			
			productList.add(product);
			System.out.println("Product Added to list with Id : "+product.getProductId());
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	/**
	 * it will get product by product id
	 * @param productId
	 * @return
	 */
	private Product getProductById(int productId){
		List<Product> productList = getProductList();
		for(Product p : productList){
			if(p.getProductId() == productId){
				return p;
			}
		}
		return null;
	}
	
	/**
	 * it will get product from cart
	 * @return
	 * 
	 */
	public List<Cart> getProductFromCart(){
		return cartList;
	}
	
	/**
	 * it will add product to cart
	 * @param productId
	 */
	public void addProductToCart(int productId){
		Product product = getProductById(productId);
		Cart cart = new Cart(product);
		try{
			cartList.add(cart);
			System.out.println("Product Added to Cart");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
