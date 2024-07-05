/*
Author: Angel Chavez
Assignment: Module 7 Lab 4
Date: 4/28/2024
Language: Java
Description: Department Manager handler
*/
package LabFour;

public class DepartmentManager implements LeaveApprover {
    private LeaveApprover nextApprover;
    public void setNextApprover(LeaveApprover nextApprover) {
        this.nextApprover = nextApprover;
    }
    public void approveLeave(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() <= 10) {
            System.out.println("Leave approved by Department Manager");
        } else if (nextApprover != null) {
            System.out.println("Approval exceeds 10 days, escalated to HR Manager");
            nextApprover.approveLeave(leaveRequest);
        } else {
            System.out.println("Leave rejected");
        }
    }
}
