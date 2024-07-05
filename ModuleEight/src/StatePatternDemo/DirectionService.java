/*
Author: Angel Chavez
Assignment: Module 8 Lab 2
Date: 5/8/2024
Language: Java
Description: This is the class that has a property whose value is based on the current state of the object.
*/
package StatePatternDemo;

public class DirectionService {
    private TravelMode travelMode;

    public DirectionService(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public Object getETA() {
        return travelMode.getETA();
    }

    public Object getDirection() {
        return travelMode.getDirection();
    }

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
}
