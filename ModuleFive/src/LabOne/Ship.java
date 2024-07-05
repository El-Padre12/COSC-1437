/*
Author: Angel Chavez
Assignment: Module 5 Lab 1
Date: 3/29/2024
Language: Java
Description: Super class for Ship objects that has name and year attributes
*/
package LabOne;

public class Ship {
    private String name;
    private int year;

    public Ship(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "\nShip Name: " + name + "\n" +
                "Ship Year: " + year;
    }
}
