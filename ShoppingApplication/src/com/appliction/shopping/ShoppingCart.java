package com.appliction.shopping;

public class ShoppingCart {
	Product[] cartItems;
    int itemCount;
    private static final int MAX_CAPACITY = 10;

    public ShoppingCart() {
        cartItems = new Product[MAX_CAPACITY];
        itemCount = 0;
    }

    public void addItem(Product product) {
        if (itemCount < MAX_CAPACITY) {
            cartItems[itemCount] = product;
            itemCount++;
        } else {
            System.out.println("The cart is full. Cannot add more items.");
        }
    }

    public void displayCartItems() {
        System.out.println("Your Shopping Cart:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(cartItems[i].getName() + " - " + cartItems[i].getPrice());
        }
    }

    public void clearCart() {
        itemCount = 0;
    }
}
