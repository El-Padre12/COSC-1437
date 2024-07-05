/*
Author: Angel Chavez
Assignment: Module 4 Lab 1
Date: 3/5/2024
Language: Java
Description: class for Car object.
*/
//resources used: the book
package LabOne;

import java.text.NumberFormat;

public class Car {
    //instance variables
    private String make, model;
    private int year;
    private double price;

    //number formatting for price
    NumberFormat currency = NumberFormat.getCurrencyInstance();

    //constructors
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car() {
        this.make = "none";
        this.model = "none";
        this.year = 0;
        this.price = 0.0;
    }

    //getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //functions
    @Override
    public String toString() {
        return "Car Make: " + make +
                "\nModel: " + model +
                "\nYear: " + year +
                "\nPrice: " + currency.format(price) +
                "\n";
    }
}
