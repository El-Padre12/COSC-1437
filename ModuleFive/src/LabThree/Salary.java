/*
Author: Angel Chavez
Assignment: Module 5 Lab 3
Date: 3/27/2024
Language: Java
Description: Salary class that inherits Employee class and has salary and monthly bonus attributes
*/
//resources used: https://stackoverflow.com/questions/2379221/how-to-format-decimals-in-a-currency-format
package LabThree;

import java.text.NumberFormat;

public class Salary extends Employee {
    // instance variables
    private double annualSalary = 0.0,
                monthlyBonus = 0.0;

    //constructors
    public Salary(String employeeID, String firstName, String lastName, Benefits employeeBenefits, Address employeeHomeAddress, double annualSalary, double monthlyBonus) {
        super(employeeID, firstName, lastName, employeeBenefits, employeeHomeAddress);
        this.annualSalary = annualSalary;
        this.monthlyBonus = monthlyBonus;
    }

    public Salary(double annualSalary, double monthlyBonus) {
        this.annualSalary = annualSalary;
        this.monthlyBonus = monthlyBonus;
    }

    //getters and setters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    //Functions
    public double calculateGrossPay() {
        double grossPay;

        grossPay = (annualSalary / 24) + (monthlyBonus / 2);
        return grossPay;
    }
    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        return  super.toString() + "\n" +
                "Salary" + "\n" +
                "Annual Salary: " + formatter.format(annualSalary) + "\n" +
                "Monthly Bonus: " + formatter.format(monthlyBonus) + "\n" +
                "Pay: " + formatter.format(calculateGrossPay());
    }
}
