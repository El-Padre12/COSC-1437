/*
Author: Angel Chavez
Assignment: Module 3 Lab 2
Date: 2/18/2024
Language: Java
Description: class for ParkingPermit objects.
*/
//Resources used: https://www.scaler.com/topics/random-class-in-java/
//                https://chat.openai.com/c/57663351-8825-4965-96f6-cd52a3187cf6
package LabTwo;

import LabOne.Address;

import java.util.Scanner;

public class ParkingPermitDriver {
    public static void main(String[] args) {
        //variables
        String firstName, lastName, street, city, state, zipcode, carMake, carModel;
        int carYear,
            permitID = 0;

        //declare objects we're going to use
        Address studentAddress;
        ParkingPermit studentParkPermit;
        Student myStudent;

        Scanner myScan = new Scanner(System.in);

        Header.displayWelcomeMessage();
        System.out.print("Input first name: ");
        firstName = myScan.nextLine();
        System.out.print("Input last name: ");
        lastName = myScan.nextLine();
        System.out.print("Input street address: ");
        street = myScan.nextLine();
        System.out.print("Input city: ");
        city = myScan.nextLine();
        System.out.print("Input State: ");
        state = myScan.nextLine();
        System.out.print("Input zipcode: ");
        zipcode = myScan.nextLine();
        System.out.print("Input car make: ");
        carMake = myScan.nextLine();
        System.out.print("Input car model: ");
        carModel = myScan.nextLine();
        System.out.print("Input car year: ");
        carYear = myScan.nextInt();

        //instantiate and initialize objects
        studentAddress = new Address(street, city, state, zipcode);
        studentParkPermit = new ParkingPermit(carYear, permitID, carMake, carModel);
        myStudent = new Student(firstName, lastName, studentAddress, studentParkPermit);

        //output info to the user
        System.out.println(myStudent);
    }
}
