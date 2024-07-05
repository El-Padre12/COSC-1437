/*
Author: Angel Chavez
Assignment: Module 7 Lab 1
Date: 4/27/2024
Language: Java
Description: program that demos inheritance and interfaces
*/
package LabOne;

public class Driver {
    public static void main(String[] args) {
        Character barbarian = new Warrior("Conan", 99, 75, 100);
        Character wizard = new Mage("Gandalf", 300, 1000, 500);

        System.out.println(barbarian);
        barbarian.attack();
        barbarian.defend();
        barbarian.useAbility();

        System.out.println();

        System.out.println(wizard);
        wizard.attack();
        wizard.defend();
        wizard.useAbility();

    }
}
