/*
Author: Angel Chavez
Assignment: Module Six Lab Two
Date: 4/8/2024
Language: Java
Description: base class for Doctor and Nurse with name, ID, and office location attributes.
*/
package LabTwo;

import java.util.Objects;

public abstract class MedicalProvider {
    //instance variables
    private String firstName, lastName, employeeID;
    private OfficeLocation employeeOffice;

    //constructors
    public MedicalProvider(String firstName, String lastName, String employeeID, OfficeLocation employeeOffice) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.employeeOffice = new OfficeLocation(employeeOffice);
    }

    public MedicalProvider() {
        this.firstName = "none";
        this.lastName = "none";
        this.employeeID = "none";
        this.employeeOffice = new OfficeLocation();
    }

    public MedicalProvider(MedicalProvider pProvider) {
        this.firstName = pProvider.firstName;
        this.lastName = pProvider.lastName;
        this.employeeID = pProvider.employeeID;
        this.employeeOffice = new OfficeLocation(pProvider.employeeOffice);
    }

    //getters and setters
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

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public OfficeLocation getEmployeeOffice() {
        return employeeOffice;
    }

    public void setEmployeeOffice(OfficeLocation employeeOffice) {
        this.employeeOffice = new OfficeLocation(employeeOffice);
    }

    //functions
    public abstract double payEmployee();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MedicalProvider that)) return false;
        return Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getLastName(), that.getLastName())
                && Objects.equals(getEmployeeID(), that.getEmployeeID()) && Objects.equals(getEmployeeOffice(), that.getEmployeeOffice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getEmployeeID(), getEmployeeOffice());
    }

    @Override
    public String toString() {
        return  "Name: " + firstName + " " + lastName + "\n" +
                "EmployeeID: " + employeeID + "\n" +
                employeeOffice;
    }
}
