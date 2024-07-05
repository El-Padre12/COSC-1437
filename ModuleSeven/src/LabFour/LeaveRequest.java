/*
Author: Angel Chavez
Assignment: Module 7 Lab 4
Date: 4/28/2024
Language: Java
Description: leave request class for requesting leave.
*/
package LabFour;

// leave request class
public class LeaveRequest {
    private int days;
    public LeaveRequest(int days) {
        this.days = days;
    }
    public int getDays() {
        return days;
    }
}
