/*
Author: Angel Chavez
Assignment: Module 5 Lab 1
Date: 3/29/2024
Language: Java
Description: CruiseShip object that inherits from Ship class and has numOfPassengers attribute
*/
package LabOne;

public class CruiseShip extends Ship {
    //instance variables
    private int numberOfPassengers;

    //constructors
    public CruiseShip(String name, int year, int numberOfPassengers) {
        super(name, year);
        this.numberOfPassengers = numberOfPassengers;
    }

    //getters and setters
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    //functions
    @Override
    public String toString() {
        return "**** Cruise Ship ****" + super.toString() +
                "\nNumber Of Passengers: " + numberOfPassengers;
    }
}
