package com.metacube.shoppingcart.main;

import java.util.Scanner;

import com.metacube.shoppingcart.controller.ProductController;
import com.metacube.shoppingcart.login.LoginAsAdmin;
import com.metacube.shoppingcart.login.LoginAsUser;
/**
 * it is our main class where we have view to consol
 * @author Vinod Patel
 *
 */
public class ProductView {
	static int choice=0;
    static int choice2=1;
    static Scanner input = new Scanner(System.in);    	
    // Here we create a object of singleton class ProductController
	static ProductController productController = ProductController.getInstance();
    
	public static void main(String[] arg){
    	
        int choice1=1;
        
        while(choice1==1){
        	System.out.println("Login as: ");
            System.out.println("1. User ");
            System.out.println("2. Admin ");
            System.out.println("3. New Here - Create a New Account");
            choice = input.nextInt();
            switch(choice){
            case 1:
            	LoginAsUser loginAsUser = new LoginAsUser();
            	loginAsUser.loginAsUser();
            	break;
            
            case 2:
            	LoginAsAdmin loginAsAdmin = new LoginAsAdmin();
            	loginAsAdmin.loginAsAdmin();
                break;
            case 3:
            	System.out.println("You Choose Create a New Account.");
            	//feature are under development
            	break;
                
            default:
            	System.out.println("No Option Found");
            	break;
            }
        }
        
        input.close();
    }
    


}
