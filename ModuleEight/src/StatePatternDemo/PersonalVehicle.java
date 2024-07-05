/*
Author: Angel Chavez
Assignment: Module 8 Lab 2
Date: 5/8/2024
Language: Java
Description: class that implements TravelMode interface that calculates ETA/Direction for driving
*/
package StatePatternDemo;

public class PersonalVehicle implements TravelMode{
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }
    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
