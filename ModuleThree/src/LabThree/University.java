/*
Author: Angel Chavez
Assignment: Module 3 Lab 3
Date: 2/21/2024
Language: Java
Description: class for University objects
*/
package LabThree;

public class University {
    //instance variables
    private String universityName, location;
    private Professor professor;

    //constructors
    public University(String universityName, String location, Professor professor) {
        this.universityName = universityName;
        this.location = location;
        this.professor = new Professor(professor);
    }

    public University() {
        this.universityName = "none";
        this.location = "none";
        this.professor = new Professor();
    }

    //getters and setters
    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = new Professor(professor);
    }

    //functions
    @Override
    public String toString() {
        return "University" + "\n" +
                "\tUniversity name: " + universityName + "\n" +
                "\tLocation: " + location + "\n" +
                "Professor" + professor;
    }
}
