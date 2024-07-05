/*
Author: Angel Chavez
Assignment: Module 7 Lab 2
Date: 4/27/2024
Language: Java
Description: leaf node implements the Employee interface and provides its own implementation of showEmployeeDetails() method.
*/
package LabTwo;

public class Manager implements Employee{
    //instance variables
    private long empID;
    private String name, department;

    //constructor
    public Manager(long empID, String name, String department) {
        this.empID = empID;
        this.name = name;
        this.department = department;
    }

    //overrides
    @Override
    public void showEmployeeDetails() {
        System.out.println("Name: " + name + ", Department: " + department + ", Employee ID: " + empID);
    }
}
