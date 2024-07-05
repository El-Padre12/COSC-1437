/*
Author: Angel Chavez
Assignment: Module 7 Lab 4
Date: 4/28/2024
Language: Java
Description: program that demos Chain Of Responsibility design pattern.
*/
package LabFour;

public class Driver {
    public static void main(String[] args) {
        LeaveApprover teamLead = new TeamLead();
        LeaveApprover departmentManager = new DepartmentManager();
        LeaveApprover hrManager = new HRManager();
        LeaveApprover CEO = new CEO();

        // Set up the chain of responsibility
        teamLead.setNextApprover(departmentManager);
        departmentManager.setNextApprover(hrManager);
        hrManager.setNextApprover(CEO);

        // Create a leave request - test with 4, 14 and 20 to see the results of the approval process
        LeaveRequest leaveRequest = new LeaveRequest(30);

        // Send the leave request for approval
        teamLead.approveLeave(leaveRequest);
    }
}
