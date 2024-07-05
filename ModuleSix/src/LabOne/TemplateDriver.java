/*
Author: Angel Chavez
Assignment: Module 6 Lab 1
Date: 4/10/2024
Language: Java
Description: adds another concrete class to the house building example using the Template Method pattern
 */
package LabOne;

public class TemplateDriver {
    public static void main(String[] args) {

        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        woodenHouseBuilder.buildHouse();
        System.out.println();

        HouseBuilder brickHouseBuilder = new BrickHouseBuilder();
        brickHouseBuilder.buildHouse();
        System.out.println();

        HouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
        stoneHouseBuilder.buildHouse();
    }
}
