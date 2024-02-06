package com.appliction.shopping;

public class User {
	@SuppressWarnings("unused")
	private String name;
    private ShoppingCart cart;

    public User(String name) {
        this.name = name;
        this.cart = new ShoppingCart();
    }

    public void addToCart(Product product) {
        cart.addItem(product);
    }

    public void viewCart() {
        cart.displayCartItems();
    }

    public void placeOrder() {
        double totalCost = 0.0;
        for (int i = 0; i < cart.itemCount; i++) {
            totalCost += cart.cartItems[i].getPrice();
        }
        System.out.println("Order placed successfully! Total cost: " + totalCost);
        cart.clearCart();
    }

}
