/*
Author: Angel Chavez
Assignment: Module 7 Lab 3
Date: 4/28/2024
Language: Java
Description: concrete implementations of the payment algorithm
*/
package LabThree;

import java.text.NumberFormat;

//concrete strategies
public class PayPalStrategy implements PaymentStrategy{
    //instance variables
    private String email;
    private String password;

    //constructor
    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(double amount) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.println("Paying " + formatter.format(amount) + " with PayPal.");
        // Perform the payment logic using PayPal credentials
    }
}
