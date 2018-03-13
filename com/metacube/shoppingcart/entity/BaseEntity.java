package com.metacube.shoppingcart.entity;

public class BaseEntity {
	private int id;
	private String name;
	
	/**
	 * to initialize the basic details of user and product
	 * because product and user both contains name and id to buy creating a parent class
	 * it will reduce the code length
	 * @param id
	 * @param name
	 */
	
	public BaseEntity(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	/**
	 * this will return the name
	 * @return name
	 */
	
	public String getName(){
		return name;
	}
	
	/**
	 * this will update the name in case if we want to change
	 * name
	 * @param name
	 */
	
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * this will return the id
	 * @return id
	 * 
	 */
	
	public int getid(){
		return id;
	}
}
