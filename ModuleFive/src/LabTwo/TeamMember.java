/*
Author: Angel Chavez
Assignment: Module 5 Lab 2
Date: 3/27/2024
Language: Java
Description: super class for coach and player, with name and jerseyNumber attributes
*/
package LabTwo;

public class TeamMember {
    //instance variables
    private String name;
    private int jerseyNumber;

    //constructor
    public TeamMember(String name, int jerseyNumber) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
    }

    public TeamMember() {
        this.name = "no name";
        this.jerseyNumber = 0;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    //functions
    @Override
    public String toString() {
        return "\nTeam Member" + "\n" +
                "Name: " + name + "\n" +
                "Jersey Number: " + jerseyNumber;
    }
}
