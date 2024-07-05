/*
Author: Angel Chavez
Assignment: Module 3 Lab 3
Date: 2/21/2024
Language: Java
Description: class for Professor objects
*/
package LabThree;

public class Professor {
    //instance variables
    private String professorName, department;
    private Course course;

    //constructors
    public Professor(String professorName, String department, Course course) {
        this.professorName = professorName;
        this.department = department;
        this.course = new Course(course);
    }

    public Professor() {
        this.professorName = "none";
        this.department = "none";
        this.course = new Course();
    }

    public Professor(Professor pProfessor) {
        this.professorName = pProfessor.professorName;
        this.department = pProfessor.department;
        this.course = new Course(pProfessor.course);
    }

    //getters and setters
    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = new Course(course);
    }

    //functions
    @Override
    public String toString() {
        return "\n\tProfessor name: " + professorName + "\n" +
               "\tDepartment: " + department + "\n" +
               "Course " + course;
    }
}
