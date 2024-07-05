/*
Author: Angel Chavez
Assignment: Module 2 Lab 2
Date: 2/8/2024
Language: Java
Description: program that displays car brand, model, year, and mileage before and after a drive.
*/
package LabTwo;

import java.util.Scanner;

public class CarDriver {
    public static void main(String[] args) {
        String brand, model;
        int year;
        double mileage, milesDriven;

        Scanner myScan =  new Scanner(System.in);

        Car usersCar;

        System.out.print("Input your car Brand: ");
        brand = myScan.nextLine();
        System.out.print("Input your car Model: ");
        model = myScan.nextLine();
        System.out.print("Input the Year of your car: ");
        year = myScan.nextInt();
        System.out.print("Input your Current mileage: ");
        mileage = myScan.nextDouble();
        System.out.print("Input amount miles driven for this drive: ");
        milesDriven = myScan.nextDouble();

        usersCar = new Car(brand, model, year, mileage);

        System.out.println(usersCar.printInfo());
        System.out.println(usersCar.drive(milesDriven));

    }
}
