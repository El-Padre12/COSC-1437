/*
Author: Angel Chavez
Assignment: Module 3 Lab 1
Date: 2/16/2024
Language: Java
Description: class for Employee objects
*/
package LabOne;

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
    public String printEmployeeInfo() {
        String myReturn = "";
        myReturn += "Employee ID: " + this.employeeID + "\n";
        myReturn += "First Name: " + this.firstName + "\n";
        myReturn += "Last Name: " + this.lastName + "\n";
        myReturn += this.employeeBenefits;
        myReturn += this.employeeHomeAddress;
        return myReturn;
    }
}
