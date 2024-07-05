/*
Author: Angel Chavez
Assignment: Module 6 Lab 1
Date: 4/10/2024
Language: Java
Description: WoodenHouseBuilder inherits class with specifically declared methods
 */
package LabOne;

public class WoodenHouseBuilder extends  HouseBuilder{
    protected void buildFoundation() {
        System.out.println("Building a wooden foundation for the house.");
    }
    protected void buildStructure() {
        System.out.println("Building the wooden structure of the house.");
    }
    protected void addRoof() {
        System.out.println("Adding a wooden roof to the house.");
    }
    protected void addWalls() {
        System.out.println("Adding wooden walls to the house.");
    }
    protected void furnishHouse() {
        System.out.println("Furnishing the wooden house.");
    }
}
