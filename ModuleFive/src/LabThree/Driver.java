/*
Author: Angel Chavez
Assignment: Module 5 Lab 3
Date: 3/27/2024
Language: Java
Description: Employee inheritance demo.
*/
//resources used: https://stackoverflow.com/questions/2379221/how-to-format-decimals-in-a-currency-format
package LabThree;

public class Driver {
    public static void main(String[] args) {

        Address salaryAddress = new Address("123 Wilde rd", "San Antonio", "TX", "78267");
        Address hourlyAddress = new Address("3436 Frio blvd", "Cisco", "TX", "65875");

        Benefits hourlyBenefits = new Benefits("Dental", "Dentcare", 99.89);
        Benefits salaryBenefits = new Benefits("Healthcare", "Shield", 80.89);

        Salary salaryEmployee = new Salary("9129", "Angel", "Chavez", salaryBenefits, salaryAddress,
                            100000.00, 208.33);

        Hourly hourlyEmployee = new Hourly("7845", "Joe", "Cerda", hourlyBenefits, hourlyAddress,
                            30.0, 48);

        System.out.println("*** Employee Inheritance ***");
        System.out.println(salaryEmployee);
        System.out.println(hourlyEmployee);
    }
}
