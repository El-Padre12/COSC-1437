/*
Author: Angel Chavez
Assignment: Module 5 CLO 8
Date: 3/31/2024
Language: Java
Description: subclass of Animal for Dog objects and overrides the makeSound method
*/
package CLO_8;

import java.util.Objects;

public class Dog extends Animal{
    //instance variables
    private String name;

    //constructors
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super();
    }

    //functions
    public String makeSound() {
        return "Woof Woof";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "Dog\n" + super.toString() + "\n" +
                makeSound();
    }
}
