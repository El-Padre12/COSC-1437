/*
Author: Angel Chavez
Assignment: Module 1 Lab 4
Date: 1/28/2024
Language: Java
Description: Java program that will take two numbers as input and perform
             addition, subtraction, multiplication, and division operations on them.
*/
//used to find out how to get quotient using Math class.
//https://www.javatpoint.com/java-math
package LabFour;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int numOne = 0;
        int numTwo = 0;
        int sumNum = 0;
        int differenceNum = 0;
        int productNum = 0;
        int quotientNum = 0;

        Scanner myScan = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Take two numbers as input and perform addition, subtraction," +
                           " multiplication, and division operations on them.");
        System.out.println();
        System.out.print("Input first number: ");
        numOne = myScan.nextInt();
        System.out.print("Input second number: ");
        numTwo = myScan.nextInt();

        sumNum = Math.addExact(numOne, numTwo);
        System.out.println("The sum of " + numOne + " and " + numTwo + " is " + sumNum);

        differenceNum = Math.subtractExact(numOne, numTwo);
        System.out.println("The difference of " + numOne + " and " + numTwo + " is " + differenceNum);

        productNum = Math.multiplyExact(numOne, numTwo);
        System.out.println("The product of " + numOne + " and " + numTwo + " is " + productNum);

        quotientNum = Math.floorDiv(numOne, numTwo);
        System.out.println("The quotient of " + numOne + " and " + numTwo + " is " + quotientNum);

    }
}
