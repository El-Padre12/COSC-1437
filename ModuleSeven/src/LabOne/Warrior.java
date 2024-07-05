/*
Author: Angel Chavez
Assignment: Module 7 Lab 1
Date: 4/27/2024
Language: Java
Description: warrior class that inherits Character and implements SpecialAbility
*/
package LabOne;

public class Warrior extends Character implements SpecialAbility {
    //instance variables
    private int strength;

    //constructors
    public Warrior(String name, int level, int health, int strength) {
        super(name, level, health);
        this.strength = strength;
    }

    public Warrior() {
        super();
        strength = 0;
    }

    //getters and setters
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    //inherited methods
    public void attack() {
        System.out.println("Sword Attack");
    }

    public void defend() {
        System.out.println("Shield defense");
    }

    public void useAbility() {
        System.out.println("Berserker Rage");
    }

    //functions
    @Override
    public String toString() {
        return "Warrior" + super.toString() +
                "Strength: " + strength;
    }
}
