package com.metacube.shoppingcart.facade;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.metacube.shoppingcart.dao.InMemoryProductDao;
import com.metacube.shoppingcart.dao.ProductFactory;
import com.metacube.shoppingcart.dao.DatabaseEnum;
import com.metacube.shoppingcart.dao.StatusEnum;
import com.metacube.shoppingcart.entity.Product;

/**
 * product facade will perform all the logical operation like insertion and deletion etc.
 * @author Vinod Patel
 *
 */

public class ProductFacade {
	private static ProductFacade obj;
	
	InMemoryProductDao inMemoryDao = (InMemoryProductDao) ProductFactory.getInstance(DatabaseEnum.IN_MEMORY);
	/**
	 * this method is used to return the object of this class
	 * @return object of this singleton class
	 */
	public static ProductFacade getInstance(){
		if(obj == null) {
			obj = new ProductFacade();
		}
		
		return obj;
	}
	
	/**
	 * private constructor to restrict object using new keyword
	 */
	
	private ProductFacade(){}
	
	/**
	 * this method returns the list of products came from inmemory storage
	 * @return list of products
	 */
	
	public List<Product> getAll(){
		List<Product> productList = new ArrayList<>();
		for(Map.Entry<Integer, Product> e: inMemoryDao.getAllProduct().entrySet()){
			productList.add((Product)e.getValue());
		}
		return productList;
	}
	
	/**
	 * this method returns status of product after perform adding operation
	 * @param product - product object
	 * @return - status of added product
	 */
	public StatusEnum addProduct(Product product) {
		return inMemoryDao.addProduct(product);
	}	
	/**
	 * this method returns status of product after perform remove operation
	 * @param productId - id of product
	 * @return - status of product either removed or error
	 */
	public StatusEnum removeProduct(int productId) {
		if( inMemoryDao.getAllProduct().containsKey(productId) ){
			inMemoryDao.removeProduct(productId);;
			return StatusEnum.PRODUCT_REMOVED;
		} else {
			return StatusEnum.PRODUCT_NOT_FOUND;
		}
	}
	
	/**
	 * this method returns status of product after perform update operation
	 * @param productId - id of product
	 * @param productName - name of product
	 * @param price - price of product
	 * @return - status of product either update successful or error
	 */
	public StatusEnum updateProduct(int productId, String productName, float price ){
		if(inMemoryDao.getAllProduct().containsKey(productId)){
			inMemoryDao.updateProducts(productId, productName, price);
			return StatusEnum.UPDATE_SUCCESSFULL;
		} else {
			return StatusEnum.PRODUCT_NOT_FOUND;
		}
	}
	
}
