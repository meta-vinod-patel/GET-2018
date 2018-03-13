package com.metacube.shoppingcart.controller;

import java.util.List;

import com.metacube.shoppingcart.entity.Cart;
import com.metacube.shoppingcart.entity.Product;
import com.metacube.shoppingcart.facade.ProductFacade;
/**
 * 
 * @author Vinod Patel
 *
 */
public class ProductController {
	
	private static ProductController controllerObject;
	
	/**
	 * COMMENT START
	 * 
	 * Singleton Class
	 * this is how we create a singleton class
	 * 
	 */
	
	private ProductController(){}
	
	public static ProductController getInstance(){
		if(controllerObject==null){
			controllerObject = new ProductController();
		}
		return controllerObject;
	}
	
	/**
	 * COMMENT END
	 */
	private ProductFacade productFacade = ProductFacade.getInstance();
	
	//it will add product to list
	public void addNewProduct(Product newProduct){
		productFacade.addNewProduct(newProduct);
	}
	
	/**
	 * it will update product price in List
	 * @param productId
	 * @param price
	 */
	public void updateProductPrice(int productId, float price){
		productFacade.updateProductPrice(productId, price);
	}
	
	/**
	 * it will update stock
	 * @param productId
	 * @param stock
	 */
	public void updateProductStock(int productId, int stock){
		productFacade.updateProductStock(productId, stock);
	}
	
	/**
	 * it will remove product from list
	 * @param productId
	 */
	public void deleteProduct(int productId){
		productFacade.deleteProduct(productId);
	}
	
	/**
	 * 
	 * @return product List
	 */
	
	public List<Product> getProductList(){
		return productFacade.getProductList();
	}
	
	/**
	 * add product to cart
	 * @param productId
	 */
	
	public void addProductToCart(int productId){
		productFacade.addProductToCart(productId);
	}
	
	/**
	 * get product from cart
	 * @return
	 */
	public List<Cart> getProductFromCart(){
		return productFacade.getProductFromCart();
	}
}
