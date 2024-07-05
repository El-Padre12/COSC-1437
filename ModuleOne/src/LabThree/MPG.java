/*
Author: Angel Chavez
Assignment: Module 1 Lab 3
Date: 1/28/2024
Language: Java
Description: Program that will calculate the fuel efficiency of a car in miles per gallon.
*/
package LabThree;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        int milesDriven = 0;
        int fuelUsed = 0;
        int milesPerGallon = 0;

        Scanner myScan = new Scanner(System.in);

        System.out.println("Fuel Efficiency Calculator");
        System.out.println();
        System.out.print("Input miles driven: ");
        milesDriven = myScan.nextInt();
        System.out.print("Input amount of fuel used in gallons: ");
        fuelUsed = myScan.nextInt();

        milesPerGallon = milesDriven / fuelUsed;
        System.out.println("your car gets " + milesPerGallon + " MPG.");

    }
}
