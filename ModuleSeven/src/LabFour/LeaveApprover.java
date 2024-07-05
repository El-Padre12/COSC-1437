/*
Author: Angel Chavez
Assignment: Module 7 Lab 4
Date: 4/28/2024
Language: Java
Description: LeaveApprover interface that declares methods for handling/escalating requests
*/
package LabFour;

public interface LeaveApprover {
    void setNextApprover(LeaveApprover nextApprover);
    void approveLeave(LeaveRequest leaveRequest);
}
