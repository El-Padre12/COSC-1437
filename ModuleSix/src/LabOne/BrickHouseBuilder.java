/*
Author: Angel Chavez
Assignment: Module 6 Lab 1
Date: 4/10/2024
Language: Java
Description: brickHouseBuilder inherits class with specifically declared methods
 */
package LabOne;

public class BrickHouseBuilder extends HouseBuilder {
    protected void buildFoundation() {
        System.out.println("Building a brick foundation for the house.");
    }
    protected void buildStructure() {
        System.out.println("Building the brick structure of the house.");
    }
    protected void addRoof() {
        System.out.println("Adding a brick roof to the house.");
    }
    protected void addWalls() {
        System.out.println("Adding brick walls to the house.");
    }
    protected void furnishHouse() {
        System.out.println("Furnishing the brick house.");
    }
    protected boolean hasGarden() {
        return false;
    }
}
