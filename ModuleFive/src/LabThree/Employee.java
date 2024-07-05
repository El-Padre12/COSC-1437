/*
Author: Angel Chavez
Assignment: Module 5 Lab 3
Date: 3/27/2024
Language: Java
Description: employee super class with ID, full name, benefits, and address
*/
//resources used: https://stackoverflow.com/questions/2379221/how-to-format-decimals-in-a-currency-format
package LabThree;

public class Employee {
    //instance variables
    private String employeeID, firstName, lastName;
    private Benefits employeeBenefits;
    private Address employeeHomeAddress;

    //constructors
    public Employee(String employeeID, String firstName, String lastName, Benefits employeeBenefits,
                    Address employeeHomeAddress) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeBenefits = new Benefits(employeeBenefits);
        this.employeeHomeAddress = new Address(employeeHomeAddress);
    }

    public Employee() {
        this.employeeID = "none";
        this.firstName = "none";
        this.lastName = "none";
        this.employeeBenefits = new Benefits();
        this.employeeHomeAddress = new Address();
    }

    //getters and setters
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Benefits getEmployeeBenefits() {
        return employeeBenefits;
    }

    public void setEmployeeBenefits(Benefits employeeBenefits) {
        this.employeeBenefits = new Benefits(employeeBenefits);
    }

    public Address getEmployeeHomeAddress() {
        return employeeHomeAddress;
    }

    public void setEmployeeHomeAddress(Address employeeHomeAddress) {
        this.employeeHomeAddress = new Address(employeeHomeAddress);
    }

    //functions
    public String toString() {
        return  "Employee ID: " + this.employeeID + "\n" +
                "First Name: " + this.firstName + "\n" +
                "Last Name: " + this.lastName + "\n" +
                this.employeeBenefits +
                this.employeeHomeAddress;
    }
}

