package com.appliction.shopping;
import java.util.Scanner;
public class OnlineShoppingApp {
    public static void main(String[] args) throws InterruptedException {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("-----------------------Welcome to our shop-----------------------");
    	System.out.println("1: Potato ");
    	System.out.println("2: Onion ");
    	System.out.println("3: Sugar ");
    	System.out.println("4: Oil ");
    	System.out.println("5: For potato and onion both ");
    	System.out.println("6: For all of them");
    	System.out.print("Enter your choice in digits: ");
    	int choice = sc.nextInt();
    	User user1 = new User("User 1");
    	Product product1 = new Product(1, "Potato", "Description 1", 50.0);
        Product product2 = new Product(2, "Onion", "Description 2", 35.0);
        Product product3 = new Product(3, "Oil", "Description 2", 35.0);
        Product product4 = new Product(4, "Sugar", "Description 2", 35.0);
    	switch(choice) {
    	case 1:  
    	         Thread thread1 = new Thread(() -> {
    	             user1.addToCart(product1);
    	             user1.viewCart();
    	             user1.placeOrder();
    	         });
    	         thread1.start();
    	        break;
    	case 2:    
    	           Thread thread2 = new Thread(() -> {  
    	               user1.addToCart(product2);
    	               user1.viewCart();
    	               user1.placeOrder();
    	           });
    	           thread2.start();
    	           break;
    	case 3: 
                Thread thread3 = new Thread(() -> {
                user1.addToCart(product3);
                user1.viewCart();
                user1.placeOrder();
                  });
                thread3.start();
                break;
    		
    	case 4:
        Thread thread4 = new Thread(() -> {
        user1.addToCart(product4);
        user1.viewCart();
        user1.placeOrder();
          });
        thread4.start();
        break;
    	case 5:                   
                 Thread thread5 = new Thread(() -> {
                 user1.addToCart(product1);
                 user1.addToCart(product2);
                 user1.viewCart();
                 user1.placeOrder();
                 });
                 thread5.start();
                 break;
    	case 6:	
                Thread thread6 = new Thread(()->{
                	user1.addToCart(product1);
                    user1.addToCart(product2);
                    user1.addToCart(product3);
                    user1.addToCart(product4);                   
                    user1.viewCart();
                    user1.placeOrder();
                });
                thread6.start();
                break;
                
         default : System.out.println("Enter valid Choice.");
                
    	}
    	sc.close();
    }
}
