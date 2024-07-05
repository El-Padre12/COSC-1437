/*
Author: Angel Chavez
Assignment: Module 2 Lab 3
Date: 2/9/2024
Language: Java
Description: Class for HouseDriver that has address, bedrooms, restrooms, square footage, and price properties.
*/
package LabThree;

import java.text.NumberFormat;

public class House {
    //instance variables
    private String houseAddress;
    private int houseBedrooms, houseSquareFeet;
    private double houseBathroom, housePrice;

    //format currency output.
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

    //two constructors, 1 default and 1 parameterized
    public House(String houseAddress, int houseBedrooms, int houseSquareFeet, double houseBathroom, double housePrice) {
        this.houseAddress = houseAddress;
        this.houseBedrooms = houseBedrooms;
        this.houseSquareFeet = houseSquareFeet;
        this.houseBathroom = houseBathroom;
        this.housePrice = housePrice;
    }

    public House() { this ("", 0, 0, 0.0 ,0.0);}

    //getters and setters
    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public int getHouseBedrooms() {
        return houseBedrooms;
    }

    public void setHouseBedrooms(int houseBedrooms) {
        this.houseBedrooms = houseBedrooms;
    }

    public int getHouseSquareFeet() {
        return houseSquareFeet;
    }

    public void setHouseSquareFeet(int houseSquareFeet) {
        this.houseSquareFeet = houseSquareFeet;
    }

    public double getHouseBathroom() {
        return houseBathroom;
    }

    public void setHouseBathroom(double houseBathroom) {
        this.houseBathroom = houseBathroom;
    }

    public double getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(double housePrice) {
        this.housePrice = housePrice;
    }

    //method for printing info to the console as a string
    public String printInfo() {
        String myMessage;
        myMessage = "\nAddress: " + this.houseAddress;
        myMessage += "\nBedrooms: " + this.houseBedrooms;
        myMessage += "\nBathrooms: " + this.houseBathroom;
        myMessage += "\nHouse size in square feet: " + this.houseSquareFeet;
        myMessage += "\nPrice of house: " + currencyFormatter.format(this.housePrice);
        return myMessage;
    }

    //method for calculating price per square foot
    public double calculatePricePerSqFt() {
        double pricePerSqFt = this.housePrice / this.houseSquareFeet;
        System.out.print("Price per square foot: ");
        return pricePerSqFt;
    }
}
