/*
Author: Angel Chavez
Assignment: Module 3 Lab 3
Date: 2/21/2024
Language: Java
Description: class for Course objects
*/
package LabThree;

public class Course {
    //instance variables
    private String courseName, courseCode;

    //constructors
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public Course() {
        this.courseName = "none";
        this.courseCode = "none";
    }

    public Course(Course pCourse) {
        this.courseName = pCourse.courseName;
        this.courseCode = pCourse.courseCode;
    }

    //getters and setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    //functions
    @Override
    public String toString() {
        return "\n\tCourse name: " + courseName + "\n" +
               "\tCourse code: " + courseCode;
    }
}
