/*
Author: Angel Chavez
Assignment: Module 3 Lab
Date: 2/16/2024
Language: Java
Description: class for Benefits objects
*/
package LabOne;

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
        return "Benefits\n" +
                "\ttype: " + type + "\n" +
                "\tcost: " + cost + "\n" +
                "\tprovider: " + provider + "\n";
    }
}
