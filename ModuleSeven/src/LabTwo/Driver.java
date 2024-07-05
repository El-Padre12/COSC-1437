/*
Author: Angel Chavez
Assignment: Module 7 Lab 2
Date: 4/27/2024
Language: Java
Description: demos the composite pattern design.
*/
package LabTwo;

public class Driver {
    public static void main(String[] args) {
        Employee dev1 = new Developer(100, "Angel Chavez", "Principal Engineer");
        Employee dev2 = new Developer(101, "Mark Zuckerberg", "Junior Engineer");
        Employee intern1 = new Intern("Rice University", "Linus Torvalds", "Software Engineer Intern");
        Employee manager = new Manager(301, "Steve Jobs", "Software Development");

        CompanyDirectory softwareDev = new CompanyDirectory();

        softwareDev.addEmployee(dev1);
        softwareDev.addEmployee(dev2);
        softwareDev.addEmployee(intern1);
        softwareDev.addEmployee(manager);

        softwareDev.showEmployeeDetails();
        softwareDev.countEmployees();
    }
}
