/*
Author: Angel Chavez
Assignment: Module 3 Lab 1
Date: 2/16/2024
Language: Java
Description: employee program that prompts user for ID and name, then outputs the info to the user.
*/
package LabOne;

import java.util.Scanner;

public class EmployeeDriver {
    public static void main(String[] args) {
        String employeeID, firstName, lastName;

        Address myAddress = new Address("123 Wild rd", "San Antonio", "Texas", "78210");
        Benefits myBenefits = new Benefits("Healthcare", "UnitedHealth", 495.0);
        Employee myEmployee;

        Scanner myScan = new Scanner(System.in);

        System.out.println("Welcome to the Info System!");
        System.out.print("Enter Employee ID: ");
        employeeID = myScan.nextLine();
        System.out.print("Enter First Name: ");
        firstName = myScan.nextLine();
        System.out.print("Enter Last Name: ");
        lastName = myScan.nextLine();

        myEmployee = new Employee(employeeID, firstName,lastName, myBenefits, myAddress);

        System.out.println(myEmployee.printEmployeeInfo());

    }
}
