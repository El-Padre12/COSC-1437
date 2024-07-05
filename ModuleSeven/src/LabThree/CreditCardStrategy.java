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
public class CreditCardStrategy implements PaymentStrategy{
    //instance variables
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    //constructor
    public CreditCardStrategy(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public void pay(double amount) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.println("Paying " + formatter.format(amount) + " with credit card.");
        // Perform the payment logic using credit card details
    }
}
