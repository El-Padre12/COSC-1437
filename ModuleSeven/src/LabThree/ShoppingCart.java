/*
Author: Angel Chavez
Assignment: Module 7 Lab 3
Date: 4/28/2024
Language: Java
Description: contains a reference to a PaymentStrategy object, which can be set dynamically. The client code can change
             the payment strategy by calling the setPaymentStrategy() method
*/
package LabThree;

//client code
public class ShoppingCart {
    //instance variable
    private PaymentStrategy paymentStrategy;

    //constructor
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        // Perform the checkout process
        paymentStrategy.pay(amount);
    }
}