/*
Author: Angel Chavez
Assignment: Module 5 Lab 2
Date: 3/27/2024
Language: Java
Description: class that inherits TeamMember with position attribute
*/
package LabTwo;

public class Player extends TeamMember {
    //instance variables
    private String position;

    //constructors
    public Player(String name, int jerseyNumber, String position) {
        super(name, jerseyNumber);
        this.position = position;
    }

    public Player() {
        super();
        this.position = "none";
    }

    //getters and setters
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //functions
    @Override
    public String toString() {
        return  "*** Player ***" + super.toString() + "\n" +
                "Position: " + position;
    }
}
