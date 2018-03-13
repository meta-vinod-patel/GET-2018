package com.metacube.shoppingcart.login;

import java.util.Scanner;

import com.metacube.shoppingcart.controller.ProductController;
import com.metacube.shoppingcart.entity.Cart;
import com.metacube.shoppingcart.entity.Product;
/**
 * it will help us to login as user
 * @author Vinod Patel
 *
 */
public class LoginAsUser {
	int choice3=1;
	Scanner input = new Scanner(System.in);
	int choice = 0;
	ProductController productController = ProductController.getInstance();
	
    public void loginAsUser(){
    	while(choice3==1){
        	System.out.println("Select The Option from the Menu to Continue : ");
        	System.out.println("1. Show your cart item.");
        	System.out.println("2. Buy Products.");
        	System.out.println("3. Logout from User Profile.");
            choice = input.nextInt();
        	//to get the user input
        	switch(choice){
        		case 1:
        			System.out.println("you choose show your cart item.");
	        			for(Cart p : productController.getProductFromCart()){
	                		System.out.println(p.product.getProductId()+" "+p.product.getProductName()+" "+p.product.getProductPrice());
	                	}
            			System.out.println("Do You Want to continue (1/0 || Yes/No): ");
                    	choice3 = input.nextInt();
        			break;
        		
        		case 2:
        			System.out.println("You choose Buy Products.");
        			System.out.println();
        			System.out.println("Select item you want to buy : ");
        			for(Product p : productController.getProductList()){
                		System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice()+"/- "+p.getProductStock());
                	}
        				System.out.println("Enter Product ID to buy a Product : ");
        				int productId = input.nextInt();
        				productController.addProductToCart(productId);
            			System.out.println("Do You Want to continue (1/0 || Yes/No): ");
                    	choice3 = input.nextInt();
        			break;
        		
        		case 3:
        			System.out.println("Logout form User Profile Successfully.");
        				
        				choice3 = 0;
        			break;
        		default:
        			System.out.println("No option found");
        			break;
        	}
    	}
    }
}
