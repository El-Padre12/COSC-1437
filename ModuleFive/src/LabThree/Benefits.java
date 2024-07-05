/*
Author: Angel Chavez
Assignment: Module 5 Lab 3
Date: 3/27/2024
Language: Java
Description: class for Benefits objects
*/
//resources used: https://stackoverflow.com/questions/2379221/how-to-format-decimals-in-a-currency-format
package LabThree;

import java.text.NumberFormat;
import java.util.Formatter;

public class Benefits {
    //instance variables
    private String type, provider;
    private double cost;

    //constructors
    public Benefits(String type, String provider, double cost) {
        this.type = type;
        this.provider = provider;
        this.cost = cost;
    }

    public Benefits() {
        this.type = "none";
        this.provider = "none";
        this.cost = 0.0;
    }

    public Benefits (Benefits pBenefits) {
        this.type = pBenefits.type;
        this.provider = pBenefits.provider;
        this.cost = pBenefits.cost;
    }

    //getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    //functions
    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return "Benefits\n" +
                "\ttype: " + type + "\n" +
                "\tcost: " + formatter.format(cost) + "\n" +
                "\tprovider: " + provider + "\n";
    }
}
