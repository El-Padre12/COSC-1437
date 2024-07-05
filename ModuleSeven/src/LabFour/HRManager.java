/*
Author: Angel Chavez
Assignment: Module 7 Lab 4
Date: 4/28/2024
Language: Java
Description: HR Manager handler
*/
package LabFour;

public class HRManager implements LeaveApprover {
    private LeaveApprover nextApprover;
    public void setNextApprover(LeaveApprover nextApprover) {
        this.nextApprover = nextApprover;
    }
    public void approveLeave(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() <= 15) {
            System.out.println("Leave approved by HR Manager");
        } else if (nextApprover != null) {
            System.out.println("Approval exceeds 15 days, escalated to CEO");
            nextApprover.approveLeave(leaveRequest);
        } else {
            System.out.println("Leave rejected");
        }
    }
}
