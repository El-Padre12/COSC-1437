/*
Author: Angel Chavez
Assignment: Module 5 CLO 8
Date: 3/31/2024
Language: Java
Description: subclass of Animal for Cat objects and overrides the makeSound method
*/
package CLO_8;

import java.util.Objects;

public class Cat extends Animal{
    //instance variables
    private String name;

    //constructors
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    //functions
    public String makeSound() {
        return "Meow Meow";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "Cat\n" + super.toString() + "\n" +
                makeSound();
    }
}
