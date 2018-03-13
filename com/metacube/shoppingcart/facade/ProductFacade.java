package com.metacube.shoppingcart.facade;

import java.util.List;

import com.metacube.shoppingcart.dao.ProductDao;
import com.metacube.shoppingcart.entity.Cart;
import com.metacube.shoppingcart.entity.Product;

public class ProductFacade {
	
	private static ProductFacade facadeObject;
	private ProductDao productDao = ProductDao.getInstance();
	private ProductFacade(){}
	
	public static ProductFacade getInstance(){
		if(facadeObject == null){
			facadeObject = new ProductFacade(); 
		}
		return facadeObject;
	}
	
	public List<Product> getProductList(){
		return productDao.getProductList();	 
	}
	
	private boolean checkProductAvailability(Product product){
		List<Product> productList = getProductList();
		return productList.contains(product.getProductName());
	}
	
	/**
	 * to get productById 
	 * @param productId
	 * @return product
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
	
	public void addNewProduct(Product newProduct){
		if( !(checkProductAvailability( newProduct ) == true) ){
			productDao.addProductToList(newProduct);
		}else{
			System.out.println("Error");
		}
	}
	
	public void updateProductPrice(int productId, float price){
		if( checkProductAvailability( getProductById(productId) ) ){
			//call dao
		}
	}
	
	public void updateProductStock(int productId, int stock){
		if( checkProductAvailability( getProductById(productId) ) ){
			//call dao
		}
	}
	
	public void deleteProduct(int productId){
		if( checkProductAvailability( getProductById(productId) ) ){
			//call dao
		}
	}

	public void addProductToCart(int productId){
		productDao.addProductToCart(productId);
	}
	
	public List<Cart> getProductFromCart(){
		return productDao.getProductFromCart();
	}
}
