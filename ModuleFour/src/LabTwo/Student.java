/*
Author: Angel Chavez
Assignment: Module 4 Lab 2
Date: 3/5/2024
Language: Java
Description: class for Student object
*/
//resources: none
package LabTwo;

public class Student {
    //instance variables
    private String firstName, lastName, course, yearOfStudy;
    private int studentID;

    //constructors
    public Student(String firstName, String lastName, String course, String yearOfStudy, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.yearOfStudy = yearOfStudy;
        this.studentID = studentID;
    }

    public Student() {
        this.firstName = "none";
        this.lastName = "none";
        this.course = "none";
        this.yearOfStudy = "none";
        this.studentID = 0;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    //functions
    @Override
    public String toString() {
        return  "First name: " + firstName + "\n" +
                "Last name: " + lastName + "\n" +
                "Course: " + course + "\n" +
                "Year of study: " + yearOfStudy + "\n" +
                "Student ID: " + studentID +"\n";
    }
}
