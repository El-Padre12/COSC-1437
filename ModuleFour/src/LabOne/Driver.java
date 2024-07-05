/*
Author: Angel Chavez
Assignment: Module 4 Lab 1
Date: 3/5/2024
Language: Java
Description: program to manage the current inventory for a car lot using a Car class
*/
//resources used: the book
package LabOne;

import java.util.ArrayList;
import java.text.NumberFormat;

public class Driver {
    public static void main(String[] args) {

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        ArrayList<Car> carLot = new ArrayList<Car>();
        Car myCar = new Car("Ford", "F150", 2020, 24000);

        carLot.add(myCar);
        carLot.add(new Car("Chevy", "Cruise", 2015, 15000));
        carLot.add(new Car("GMC", "Sierra", 2018, 40000));
        carLot.add(new Car("Honda", "Ridgeline", 2017, 20000));
        carLot.add(new Car("Nissan", "Frontier", 2019, 22000));

        System.out.println("Welcome to car lot program");
        displayInventory(carLot);
        System.out.println("Car lot Value: " + currency.format(calculateTotalValue(carLot)));
    }//end of main

    //functions
    public static void displayInventory(ArrayList<Car> pCar) {
        for(Car aCar : pCar) {
            System.out.println(aCar);
        }
    }

    public static double calculateTotalValue(ArrayList<Car> pCar) {
        double myReturn = 0.0;

        for (Car aCar : pCar) {
            myReturn += aCar.getPrice();
        }
        return myReturn;
    }
}//end of class
