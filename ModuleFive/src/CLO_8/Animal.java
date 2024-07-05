/*
Author: Angel Chavez
Assignment: Module 5 CLO 8
Date: 3/31/2024
Language: Java
Description: Animal super class with a name attribute and a makeSound method
*/
package CLO_8;

import java.util.Objects;

public class Animal {
    //instance variable
    private String name;

    //constructors
    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        name = "none";
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //functions
    public String makeSound() {
        return "Some generic animal sound";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
