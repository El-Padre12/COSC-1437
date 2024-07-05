/*
Author: Angel Chavez
Assignment: Module 7 Lab 2
Date: 4/27/2024
Language: Java
Description: leaf node implements the Employee interface and provides its own implementation of showEmployeeDetails() method.
*/
package LabTwo;

public class Intern implements Employee{
    //instance variables
    private String name, universityAttended;
    private final String position;

    //constructor
    public Intern(String universityAttended, String name, String position) {
        this.universityAttended = universityAttended;
        this.name = name;
        this.position = position;
    }

    //overrides
    @Override
    public void showEmployeeDetails() {
        System.out.println("Name: " + name + ", Position: " + position + ", University Attended: " + universityAttended);
    }
}
