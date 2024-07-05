/*
Author: Angel Chavez
Assignment: Module 7 Lab 2
Date: 4/27/2024
Language: Java
Description: leaf node implements the Employee interface and provides its own implementation of showEmployeeDetails() method.
*/
package LabTwo;

public class Developer implements Employee{
    //instance variables
    private String name;
    private long empId;
    private String position;

    //constructor
    public Developer(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    //overrides
    @Override
    public void showEmployeeDetails() {
        System.out.println("Developer ID: " + empId + ", Name: " + name + ", Position: " + position);
    }
}
