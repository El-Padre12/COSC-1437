/*
Author: Angel Chavez
Assignment: Module 5 Lab 1
Date: 3/29/2024
Language: Java
Description: CargoShip object that inherits from Ship class and has capacity attribute
*/
package LabOne;

public class CargoShip extends Ship {
    //instance variables
    private int capacity;

    //constructors
    public CargoShip(String name, int year, int capacity) {
        super(name, year);
        this.capacity = capacity;
    }

    //getters and setters
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //functions
    @Override
    public String toString() {
        return "**** Cargo Ship ****" + super.toString() +
                "\nCapacity: " + capacity;
    }
}
