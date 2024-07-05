/*
Author: Angel Chavez
Assignment: Module 7 Lab 1
Date: 4/27/2024
Language: Java
Description: mage class that inherits Character and implements SpecialAbility
*/
package LabOne;

public class Mage extends Character implements SpecialAbility {
    //instance variables
    private int magic;

    //constructors
    public Mage(String name, int level, int health, int magic) {
        super(name, level, health);
        this.magic = magic;
    }

    public Mage() {
        super();
        magic = 0;
    }

    //getters and setters
    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    //inherited methods
    public void attack() {
        System.out.println("Wand Attack");
    }

    public void defend() {
        System.out.println("Magic defense");
    }

    public void useAbility() {
        System.out.println("Time Warp");
    }

    //functions
    @Override
    public String toString() {
        return "Mage" + super.toString() +
                "Magic: " + magic;
    }
}
