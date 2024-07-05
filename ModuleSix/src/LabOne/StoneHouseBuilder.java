/*
Author: Angel Chavez
Assignment: Module 6 Lab 1
Date: 4/10/2024
Language: Java
Description: StoneHouseBuilder inherits class with specifically declared methods
 */
package LabOne;

public class StoneHouseBuilder extends HouseBuilder {
    protected void buildFoundation() {
        System.out.println("Building a stone foundation for the house.");
    }
    protected void buildStructure() {
        System.out.println("Building the stone structure of the house.");
    }
    protected void addRoof() {
        System.out.println("Adding a stone roof to the house.");
    }
    protected void addWalls() {
        System.out.println("Adding stone walls to the house.");
    }
    protected void furnishHouse() {
        System.out.println("Furnishing the stone house.");
    }
    protected boolean hasGarden() {
        return true;
    }
}
