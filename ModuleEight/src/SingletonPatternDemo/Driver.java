/*
Author: Angel Chavez
Assignment: Module 8 Lab 1
Date: 5/8/2024
Language: Java
Description: singleton demo
*/
package SingletonPatternDemo;

public class Driver {
    public static void main(String[] args) {
        ReportHeader reportHeader = ReportHeader.getInstance();
        ReportFooter reportFooter = ReportFooter.getInstance();

        reportHeader.printHeader(); // Using the new printHeader method

        System.out.println("Random Report...");

        reportFooter.printFooter();
    }
}
