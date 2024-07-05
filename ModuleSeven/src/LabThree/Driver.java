/*
Author: Angel Chavez
Assignment: Module 7 Lab 3
Date: 4/28/2024
Language: Java
Description: demos Strategy design pattern
*/
package LabThree;

public class Driver {
    //usage
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Set the payment strategy dynamically
        cart.setPaymentStrategy(new CreditCardStrategy("1234 5678 9012 3456", "12/23", "123"));
        cart.checkout(100.0);

        // Change the payment strategy at runtime
        cart.setPaymentStrategy(new PayPalStrategy("example@example.com", "password"));
        cart.checkout(50.0);

        cart.setPaymentStrategy(new GiftCardStrategy("8976 2345 6758 1583", "0987"));
        cart.checkout(25);
    }
}
