/*
Author: Angel Chavez
Assignment: Module 3 Lab 2
Date: 2/18/2024
Language: Java
Description: class for Student objects.
*/
//Resources used: https://www.scaler.com/topics/random-class-in-java/
//                https://chat.openai.com/c/57663351-8825-4965-96f6-cd52a3187cf6
package LabTwo;

import LabOne.Address;

public class Student {
    //instance variables
    private String firstName, lastNames;
    private Address studentAddress;
    private ParkingPermit studentParkPermit;

    // constructors
    public Student(String firstName, String lastNames, Address studentAddress, ParkingPermit studentParkPermit) {
        this.firstName = firstName;
        this.lastNames = lastNames;
        this.studentAddress = new Address(studentAddress);
        this.studentParkPermit = new ParkingPermit(studentParkPermit);
    }

    public Student() {
        this.firstName = "none";
        this.lastNames = "none";
        this.studentAddress = new Address();
        this.studentParkPermit = new ParkingPermit();
    }

    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = new Address(studentAddress);
    }

    public ParkingPermit getStudentParkPermit() {
        return studentParkPermit;
    }

    public void setStudentParkPermit(ParkingPermit studentParkPermit) {
        this.studentParkPermit = new ParkingPermit(studentParkPermit);
    }

    //functions
    @Override
    public String toString() {
        return "Student " + "\n" +
                "\tFirst name: " + firstName + "\n" +
                "\tLast name: " + lastNames + "\n" +
                "Student address " + this.studentAddress + "\n" +
                "Student parking permit " + this.studentParkPermit + "\n";
    }
}
