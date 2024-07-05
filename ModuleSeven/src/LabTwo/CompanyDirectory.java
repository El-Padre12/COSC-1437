/*
Author: Angel Chavez
Assignment: Module 7 Lab 2
Date: 4/27/2024
Language: Java
Description: composite node it can contain both leaf nodes and other composite nodes implements Employee
*/
package LabTwo;

import java.util.ArrayList;

//composite
public class CompanyDirectory implements Employee{
    private ArrayList<Employee> employeeList = new ArrayList<Employee>();
    @Override
    public void showEmployeeDetails() {
        for (Employee emp : employeeList) {
            emp.showEmployeeDetails();
        }
    }
    public void countEmployees() {
        System.out.println("The number of employees employed: " + employeeList.size());
    }
    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }
    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }
}
