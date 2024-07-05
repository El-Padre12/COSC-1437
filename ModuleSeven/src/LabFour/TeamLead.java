/*
Author: Angel Chavez
Assignment: Module 7 Lab 4
Date: 4/28/2024
Language: Java
Description: TeamLead handler
*/
package LabFour;

public class TeamLead implements LeaveApprover {
    private LeaveApprover nextApprover;
    public void setNextApprover(LeaveApprover nextApprover) {
        this.nextApprover = nextApprover;
    }
    public void approveLeave(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() <= 5) {
            System.out.println("Leave approved by Team Lead");
        } else if (nextApprover != null) {
            System.out.println("Approval exceeds 5 days, escalated to Department Manager");
            nextApprover.approveLeave(leaveRequest);
        } else {
            System.out.println("Leave rejected");
        }
    }
}
