package com.metacube.shoppingcart.entity;

public class User extends BaseEntity{
	private static boolean isAdmin;
	private static String userName;
	private static int countId = 0;
	
	/**
	 * Constructor to initialize user class
	 * @param isAdmin
	 */
	public User(boolean isAdmin){
		super((++countId),userName);
		this.isAdmin = isAdmin;
	}
	
	/**
	 * method to get username
	 * @return userName;
	 * 
	 */
	
	public String getUserName(){
		return super.getName();
	}
	
	/**
	 * method to change userName
	 * @param userName
	 * 
	 */
	
	public void setUserName(String userName){
		super.setName(userName);
	}
	
	/**
	 * method to get userId
	 * @return userId
	 * 
	 */
	
	public int getUserId(){
		return super.getid();
	}
}
