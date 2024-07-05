/*
Author: Angel Chavez
Assignment: Module 5 Lab 2
Date: 3/27/2024
Language: Java
Description: baseball team program that demos inheritance
*/
package LabTwo;

public class Driver {
    public static void main(String[] args) {
        Player myPlayer = new Player("Gabriel Garcia", 23, "short stop");
        Coach myCoach = new Coach("Greg Pop", 0, "Head Coach");

        System.out.println(myPlayer);
        System.out.println(myCoach);
    }
}
