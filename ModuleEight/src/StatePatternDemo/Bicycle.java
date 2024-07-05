/*
Author: Angel Chavez
Assignment: Module 8 Lab 2
Date: 5/8/2024
Language: Java
Description: class that implements TravelMode interface that calculates ETA/Direction for cycling
*/
package StatePatternDemo;

public class Bicycle implements TravelMode{
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (cycling)");
        return 2;
    }
    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (cycling)");
        return 2;
    }
}
