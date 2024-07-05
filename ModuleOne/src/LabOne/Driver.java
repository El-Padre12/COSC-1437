/*
Author: Angel Chavez
Assignment: Module 1 Lab 1
Date: 1/28/2024
Language: Java
Description: create a random number generator between given integers.
*/
package LabOne;

import java.util.Random;
import java.util.Scanner;

public class Driver {
        public static void main(String[] args) {
            String name = "";
            int upperRange = 0;
            int lowerRange = 0;
            int randomNum = 0;

            Scanner myScan = new Scanner(System.in);
            Random random = new Random();

            System.out.println("Generate a random number between 2 Integers");
            System.out.print("What is your name: ");
            name = myScan.nextLine();
            System.out.print("Enter first number in the range: ");
            lowerRange = myScan.nextInt();
            System.out.print("Enter second number in the range: ");
            upperRange = myScan.nextInt();

            randomNum = random.nextInt(upperRange - lowerRange) + lowerRange;
            System.out.println("Name: " + name);
            System.out.println("Your random number is: " + randomNum);


    }
}
