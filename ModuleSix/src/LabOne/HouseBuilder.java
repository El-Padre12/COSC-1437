/*
Author: Angel Chavez
Assignment: Module 6 Lab 1
Date: 4/10/2024
Language: Java
Description: abstract super class for building different houseBuilder class, with several abstract methods.
*/
package LabOne;

public abstract class HouseBuilder {
    public final void buildHouse() {
        buildFoundation();
        buildStructure();
        addRoof();
        addWalls();

        if (hasGarden()) {
            addGarden();
        }
        furnishHouse();
    }
    protected abstract void buildFoundation();
    protected abstract void buildStructure();
    protected abstract void addRoof();
    protected abstract void addWalls();
    protected void addGarden() {
        System.out.println("Adding a beautiful garden to the house.");
    }
    protected abstract void furnishHouse();
    protected boolean hasGarden() {
        return true;
    }
}
