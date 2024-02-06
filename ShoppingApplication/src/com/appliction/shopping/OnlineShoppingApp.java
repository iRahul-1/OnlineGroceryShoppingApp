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
    	switch(choice) {
    	case 1:  Product product1 = new Product(1, "Aaloo", "Description 1", 50.0);
    	         User user1 = new User("User 1");
    	         Thread thread1 = new Thread(() -> {
    	             user1.addToCart(product1);
    	             user1.viewCart();
    	             user1.placeOrder();
    	         });
    	         thread1.start();
    	        break;
    	case 2:    Product product2 = new Product(2, "Pyaz", "Description 2", 35.0);  
    	           User user2 = new User("User 2"); 
    	           Thread thread2 = new Thread(() -> {
    	               
    	               user2.addToCart(product2);
    	               user2.viewCart();
    	               user2.placeOrder();
    	           });
    	           thread2.start();
    	           break;
    	case 3: Product product3 = new Product(3, "chini", "Description 2", 35.0);
    	        User user3 = new User("User 3"); 
                Thread thread3 = new Thread(() -> {
            
                user3.addToCart(product3);
                user3.viewCart();
                user3.placeOrder();
                  });
                thread3.start();
                break;
    		
    	case 4: Product product4 = new Product(3, "tel", "Description 2", 35.0);
        User user4 = new User("User 4"); 
        Thread thread4 = new Thread(() -> {
    
        user4.addToCart(product4);
        user4.viewCart();
        user4.placeOrder();
          });
        thread4.start();
        break;
    		
    	case 5:  Product product5 = new Product(1, "Aaloo", "Description 1", 50.0);
                 Product product6 = new Product(2, "Pyaz", "Description 2", 35.0);

                 User user5 = new User("User 5");
                 Thread thread5 = new Thread(() -> {
                 user5.addToCart(product5);
                 user5.addToCart(product6);
                 user5.viewCart();
                 user5.placeOrder();
                 });
                 thread5.start();
                 break;
    	case 6:	Product product7 = new Product(1, "Aaloo", "Description 1", 50.0);
                Product product8 = new Product(2, "Pyaz", "Description 2", 35.0);
                Product product9 = new Product(3, "tel", "Description 2", 35.0);
                Product product10 = new Product(3, "chini", "Description 2", 35.0);
                User user6 = new User("User 6");
                Thread thread6 = new Thread(()->{
                	user6.addToCart(product7);
                    user6.addToCart(product8);
                    user6.addToCart(product9);
                    user6.addToCart(product10);                   
                    user6.viewCart();
                    user6.placeOrder();
                });
                thread6.start();
                break;
                
         default : System.out.println("Enter valid Choice.");
                
    	}
//        Product product1 = new Product(1, "Aaloo", "Description 1", 50.0);
//        Product product2 = new Product(2, "Pyaz", "Description 2", 35.0);
//
//        User user1 = new User("User 1");
//        User user2 = new User("User 2");
//
//        Thread thread1 = new Thread(() -> {
//            user1.addToCart(product1);
//            user1.addToCart(product2);
//            user1.viewCart();
//            user1.placeOrder();
//        });
//
//        Thread thread2 = new Thread(() -> {
//            user2.addToCart(product1);
//            user2.addToCart(product2);
//            user2.viewCart();
//            user2.placeOrder();
//        });
//
//        thread1.start();
//        thread1.join();
//        thread2.start();
    }
}
