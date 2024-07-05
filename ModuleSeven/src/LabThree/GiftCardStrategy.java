/*
Author: Angel Chavez
Assignment: Module 7 Lab 3
Date: 4/28/2024
Language: Java
Description: concrete implementations of the payment algorithm
*/
package LabThree;

import java.text.NumberFormat;

public class GiftCardStrategy implements PaymentStrategy{
    //instance variables
    private String cardNumber, pin;

    //constructor
    public GiftCardStrategy(String cardNumber, String pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public void pay(double amount) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.println("Paying " + formatter.format(amount) + " with gift card.");
        // Perform the payment logic using credit card details
    }
}
