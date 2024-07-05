/*
Author: Angel Chavez
Assignment: Module 5 Lab 2
Date: 3/27/2024
Language: Java
Description: class that inherits TeamMember with role attribute
*/
package LabTwo;

public class Coach extends TeamMember {
    //instance variables
    private String role;

    //constructors
    public Coach(String name, int jerseyNumber, String role) {
        super(name, jerseyNumber);
        this.role = role;
    }

    public Coach() {
        super();
        this.role = "none";
    }

    //getters and setters
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //functions
    @Override
    public String toString() {
        return "*** Coach ***" + super.toString() + "\n" +
                "Role: " + role;
    }
}
