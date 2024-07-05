/*
Author: Angel Chavez
Assignment: Module 3 Lab 2
Date: 2/18/2024
Language: Java
Description: class for ParkingPermit objects.
*/
//Resources used: https://www.scaler.com/topics/random-class-in-java/
//                https://chat.openai.com/c/57663351-8825-4965-96f6-cd52a3187cf6
 package LabTwo;

import java.util.Random;

public class ParkingPermit {
    //instance variables
    private int carYear;
    private int permitID;
    private String carMake, carModel;

    //constructors
    public ParkingPermit(int carYear, int permitID, String carMake, String carModel) {
        Random random = new Random();
        this.carYear = carYear;
        this.permitID = random.nextInt(9000) + 1000;
        this.carMake = carMake;
        this.carModel = carModel;
    }

    public ParkingPermit(ParkingPermit pParkPermit) {
        Random random = new Random();
        this.carYear = pParkPermit.carYear;
        this.permitID = random.nextInt(9000) + 1000;
        this.carMake = pParkPermit.carMake;
        this.carModel = pParkPermit.carModel;
    }

    public ParkingPermit() {
        Random random = new Random();
        this.carYear = 0;
        this.permitID = random.nextInt();
        this.carMake = "none";
        this.carModel = "none";
    }

    //getters and setters
    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public int getPermitID() {
        return permitID;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    //functions
    @Override
    public String toString() {
        return "\n\tCar year: " + carYear + "\n" +
                "\tCar Make: " + carMake + "\n" +
                "\tCar Model: " + carModel + "\n" +
                "\tPermitID: " + permitID + "\n";
    }
}
