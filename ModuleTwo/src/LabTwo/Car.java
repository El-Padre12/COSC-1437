/*
Author: Angel Chavez
Assignment: Module 2 Lab 2
Date: 2/8/2024
Language: Java
Description: Class for CarDriver program has a drive method to add miles from drive to mileage, and a printInfo
             method to display user input to console as a String
*/
package LabTwo;

public class Car {
    private String carBrand, carModel;
    private int carYear;
    private double carMileage;

    public Car() {
        this("", "", 0, 0.0);
    }

    public Car(String carBrand, String carModel, int carYear, double carMileage) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYear = carYear;
        this.carMileage = carMileage;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public double getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(double carMileage) {
        this.carMileage = carMileage;
    }

    public double drive(double miles) {
        miles += this.carMileage;
        System.out.print("Mileage after drive: ");
        return miles;
    }

    public String printInfo() {
        String myMessage;
        myMessage = "\nBrand: " + this.carBrand;
        myMessage += "\nModel: " + this.carModel;
        myMessage += "\nYear: " + this.carYear;
        myMessage += "\nMileage before drive: " + this.carMileage;
        return myMessage;
    }
}
