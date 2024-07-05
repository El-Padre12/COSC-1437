/*
Author: Angel Chavez
Assignment: Module 5 Lab 3
Date: 3/27/2024
Language: Java
Description: Hour class that inherits Employee class and has hour rate and hours worked attributes
*/
//resources used: https://stackoverflow.com/questions/2379221/how-to-format-decimals-in-a-currency-format
package LabThree;

import java.text.NumberFormat;

public class Hourly extends Employee{
    //instance variables
    private double hourlyRate, hoursWorked;

    //constructors
    public Hourly(String employeeID, String firstName, String lastName, Benefits employeeBenefits, Address employeeHomeAddress,
                  double hourlyRate, double hoursWorked) {
        super(employeeID, firstName, lastName, employeeBenefits, employeeHomeAddress);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public Hourly(double hourlyRate, double hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    //getters and setters
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //functions
    public double calculateGrossPay() {
        double grossPay;

        if (hoursWorked <= 40) {
            grossPay = hourlyRate * hoursWorked;
        }else
            grossPay = (hoursWorked - 40) * (hourlyRate * 1.5) + (40 * hourlyRate);
        return grossPay;
    }


    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        return super.toString() + "\n" +
                "Hourly" + "\n" +
                "Hourly Rate: " + formatter.format(hourlyRate) + "/hr" + "\n" +
                "Hours Worked: " + hoursWorked + "\n" +
                "Pay: " + formatter.format(calculateGrossPay());


    }
}
