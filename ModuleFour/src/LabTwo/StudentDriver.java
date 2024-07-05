/*
Author: Angel Chavez
Assignment: Module 4 Lab 2
Date: 3/5/2024
Language: Java
Description: Student records management program/system.
*/
//resources: none
package LabTwo;

import java.util.ArrayList;

public class StudentDriver {
    public static void main(String[] args) {

        ArrayList<Student> studentRecords = new ArrayList<Student>();

        studentRecords.add(new Student("Angel", "Chavez", "Java", "Sophomore", 901209833));
        studentRecords.add(new Student("Mark", "Ortega", "Java", "Sophomore", 901209845));
        studentRecords.add(new Student("John", "Cruz", "C++", "Freshman", 901209704));
        studentRecords.add(new Student("Saeed", "Abadi", "Python", "Freshman", 901207694));
        studentRecords.add(new Student("Will", "Peterson", "C#", "Junior", 901209233));

        System.out.println("Student Management System!");
        displayAllStudents(studentRecords);

    }// end of main

    //functions
    public static void displayAllStudents(ArrayList<Student> pStudent) {
        for(Student aStudent : pStudent) {
            System.out.println(aStudent);
        }
    }
}//end of class
