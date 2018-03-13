package com.metacube.shoppingcart.login;

import java.util.Scanner;

import com.metacube.shoppingcart.controller.ProductController;
import com.metacube.shoppingcart.entity.Product;
/**
 * It will help to login as Admin
 * to add product to list and remove and update product from list
 * @author Vinod Patel
 *
 */
public class LoginAsAdmin {
	int choice2 = 1;
	int choice = 0;
	Scanner input = new Scanner(System.in);
	ProductController productController = ProductController.getInstance();
	public void loginAsAdmin(){
    	while(choice2==1){
    		System.out.println("Select The Option from the Menu to Continue : ");
        	System.out.println("1. Add product to list.");
        	System.out.println("2. Change product Price.");
        	System.out.println("3. Update stock.");
        	System.out.println("4. Delete Product.");
        	System.out.println("5. Show Available Products.");
        	System.out.println("6. Logout From Admin");
        	
            choice = input.nextInt();
            switch(choice){
            
            case 1:
            	System.out.println("You choose Add product to list.");
            	System.out.println("Enter no of Products you want to add : ");
            	int n = input.nextInt();
            	for(int i = 1 ; i<=n ; i++){
                	System.out.println(" Enter Name of Product "+i+" : ");
                	String productName = input.next();
                	System.out.println(" "+productName+" Price : ");
                	float productPrice = input.nextFloat();
                	System.out.println(" Enter Stock : ");
                	int productStock = input.nextInt();
                		Product item = new Product(productName,productPrice,productStock);
                		productController.addNewProduct(item);
            	}
            	
                	System.out.println("Do You Want to continue (1/0 || Yes/No): ");
                	choice2 = input.nextInt();
            	break;
            	
            case 2:
            	System.out.println("You choose Change Product Price : ");
            	System.out.println("Enter Product Id/Price : ");
            	
            		productController.updateProductPrice(input.nextInt(),input.nextFloat());
            		System.out.println("Do You Want to continue (1/0 || Yes/No): ");
                	choice2 = input.nextInt();
            	break;
            	
            case 3:
            	System.out.println("You choose Update Stock : ");
            	System.out.println("Enter Product Id/Stock : ");
            	
            		productController.updateProductStock(input.nextInt(),input.nextInt());
            		System.out.println("Do You Want to continue (1/0 || Yes/No): ");
                	choice2 = input.nextInt();
            	break;
            	
            case 4:
            	System.out.println("You choose Delete Product : ");
            	System.out.println("Enter Product Id : ");
            	
            		productController.deleteProduct(input.nextInt());
            		System.out.println("Do You Want to continue (1/0 || Yes/No): ");
                	choice2 = input.nextInt();
            	break;
            	
            case 5:
            	System.out.println("You choose Show Available Product : ");
            	
            	for(Product p : productController.getProductList()){
            		System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice()+" "+p.getProductStock());
            	}
        		System.out.println("Do You Want to continue (1/0 || Yes/No): ");
            	choice2 = input.nextInt();
            	break;
            	
            case 6:
            	System.out.println("Logout From Admin Successfully.");
            	choice2 = 0;
            	break;
            	
            default:
            	System.out.println("No Option Found");
            	break;
            	
            }
    	}
	}
}
