/*
Author: Angel Chavez
Assignment: Module 8 Lab 2
Date: 5/8/2024
Language: Java
Description: class that implements TravelMode interface that calculates ETA/Direction for bus transit
*/
package StatePatternDemo;

public class Bus implements TravelMode{
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
