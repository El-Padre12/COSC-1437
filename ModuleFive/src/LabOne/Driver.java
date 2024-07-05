/*
Author: Angel Chavez
Assignment: Module 5 Lab 1
Date: 3/29/2024
Language: Java
Description: Ship Manifest program that demos basic inheritance.
*/
package LabOne;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        String cruiseName, cargoName;
        int cruiseYear, cargoYear, cruisePassengers, cargoCapacity;

        Scanner myScan = new Scanner(System.in);

        CruiseShip myCruise;
        CargoShip myCargo;

        System.out.println("*** Ship Manifest ***");
        System.out.print("Enter cruise ship name: ");
        cruiseName = myScan.nextLine();
        System.out.print("Enter cruise ship year: ");
        cruiseYear = myScan.nextInt();
        System.out.print("Enter amount of passengers on cruise: ");
        cruisePassengers = myScan.nextInt();

        myScan.nextLine();

        System.out.print("Enter cargo ship name: ");
        cargoName = myScan.nextLine();
        System.out.print("Enter cargo ship year: ");
        cargoYear = myScan.nextInt();
        System.out.print("Enter cargo capacity(in Tons): ");
        cargoCapacity = myScan.nextInt();

        myCruise = new CruiseShip(cruiseName, cruiseYear, cruisePassengers);
        myCargo = new CargoShip(cargoName, cargoYear, cargoCapacity);

        System.out.println(myCruise);
        System.out.println(myCargo);

    }
}
