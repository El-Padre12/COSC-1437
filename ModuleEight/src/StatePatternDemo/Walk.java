/*
Author: Angel Chavez
Assignment: Module 8 Lab 2
Date: 5/8/2024
Language: Java
Description: class that implements TravelMode interface that calculates ETA/Direction for walking
*/
package StatePatternDemo;

public class Walk implements TravelMode{
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
