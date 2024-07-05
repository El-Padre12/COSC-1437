/*
Author: Angel Chavez
Assignment: Module 3 Lab 3
Date: 2/21/2024
Language: Java
Description: university program that takes input from the user and then outputs that data. *Nested Aggregation
*/
package LabThree;

import java.util.Scanner;

public class UniversityDriver {
    public static void main(String[] args) {
        //variables
        String courseName, courseID, professor,
               department, university, location;

        Course myCourse;            // = new Course("Java", "COSC-1437");
        Professor myProfessor;      // = new Professor("Dr. Roark", "Computer Science", myCourse);
        University myUniversity;    // = new University("NVC", "Bexar County", myProfessor);

        Scanner myScan = new Scanner(System.in);

        System.out.println("**University app**");
        System.out.print("Input course name: ");
        courseName = myScan.nextLine();
        System.out.print("Input course ID: ");
        courseID = myScan.nextLine();
        System.out.print("Input professor: ");
        professor = myScan.nextLine();
        System.out.print("Input department: ");
        department = myScan.nextLine();
        System.out.print("Input university: ");
        university = myScan.nextLine();
        System.out.print("Input university location: ");
        location = myScan.nextLine();

        myCourse = new Course(courseName, courseID);
        myProfessor = new Professor(professor, department, myCourse);
        myUniversity = new University(university, location, myProfessor);

        System.out.print(myUniversity);
    }
}
