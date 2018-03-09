package com.metacube.shoppingcart.dao;

import java.util.HashMap;
import java.util.Map;

import com.metacube.shoppingcart.entity.Product;

/**
 * this class will perform the in memory storage
 * @author Vinod Patel
 *
 */

public class InMemoryProductDao implements BaseDao {
	
	Map<Integer , Product> allProducts = new HashMap();
	
	/**
	 * this method will return the productlist
	 * @return productList
	 */
	
	public Map<Integer, Product> getAllProduct (){
		return this.allProducts;
	}
	
	/**
	 * this method will add a Product in the list
	 * @param Product
	 * 
	 */
	
	public StatusEnum addProduct(Product product ){
		this.allProducts.put(product.getProductId(), product);
		return StatusEnum.PRODUCT_ADDED;
	}
	
	/**
	 * this method will remove product from list
	 * @param Product ID
	 */
	
	public void removeProduct(int productId){
		allProducts.remove(productId);
	}
	
	/**
	 * this method will update all the product
	 * @param productID 
	 * @param productName
	 * @param price
	 */
	public void updateProducts(int productId, String productName, float price){
		Product product = allProducts.get(productId);
		product.setProductName(productName);
		product.setPrice(price);
	}
	
}
