package com.metacube.shoppingcart.dao;

/**
 * This class is used to return storage instance type
 * like inmemory or database
 * @author Vinod Patel
 *
 */

public class ProductFactory {
	private static BaseDao baseDao;
	
	/**
	 * This method returns instance of storage type
	 * @param dbname - storage type
	 * @return - instance of storage
	 * 
	 */
	public static BaseDao getInstance(DatabaseEnum dbName){
		switch(dbName){
			case IN_MEMORY : baseDao = new InMemoryProductDao();
							return baseDao;
			case SQL : return null;
		}
		return null;
	}
	
	/**
	 * 
	 * Private constructor to restrict creating object from using new keywork like ClassName obj = new ClassName();
	 * 
	 */
	
	private ProductFactory(){}
}
