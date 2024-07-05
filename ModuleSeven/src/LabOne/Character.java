/*
Author: Angel Chavez
Assignment: Module 7 Lab 1
Date: 4/23/2024
Language: Java
Description: super class for all type of characters in the game
*/
package LabOne;

public abstract class Character {
    //instance variables
    private String name;
    private int level, health;

    //constructors
    public Character(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public Character() {
        this.name = "none";
        this.level = 0;
        this.health = 0;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    //abstract methods
    public abstract void attack();

    public abstract void defend();

    public abstract void useAbility();

    //functions
    @Override
    public String toString() {
        return  "Name: " + name + "\n" +
                "Level: " + level + "\n" +
                "Health: " + health + "\n";
    }
}
