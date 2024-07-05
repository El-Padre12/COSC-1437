/*
Author: Angel Chavez
Assignment: Module 7 Lab 4
Date: 4/28/2024
Language: Java
Description: CEO handler
*/
package LabFour;

public class CEO implements LeaveApprover {
    private LeaveApprover nextApprover;
    public void setNextApprover(LeaveApprover nextApprover) {
        this.nextApprover = nextApprover;
    }
    public void approveLeave(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() <= 30) {
            System.out.println("Leave approved by CEO");
        } else if (nextApprover != null) {
            nextApprover.approveLeave(leaveRequest);
        } else {
            System.out.println("Approval exceeds 30 days");
            System.out.println("Leave rejected");
        }
    }
}
