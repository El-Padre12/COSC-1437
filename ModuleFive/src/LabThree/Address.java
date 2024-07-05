/*
Author: Angel Chavez
Assignment: Module 5 Lab 3
Date: 3/27/2024
Language: Java
Description: class for Address objects
*/
//resources used: https://stackoverflow.com/questions/2379221/how-to-format-decimals-in-a-currency-format
package LabThree;

public class Address {
    //instance variables
    private String street, city, state, zip;

    //constructors
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address() {
        this.street = "none";
        this.city = "none";
        this.state = "none";
        this.zip = "none";
    }

    public Address (Address pAddress) {
        this.street = pAddress.street;
        this.city = pAddress.city;
        this.state = pAddress.state;
        this.zip = pAddress.zip;
    }

    //getters and setters
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    //functions
    @Override
    public String toString() {
        return "\n\tStreet: " + street + "\n" +
                "\tCity: " + city + "\n" +
                "\tState: " + state + "\n"+
                "\tZip: " + zip;
    }
}
