/*
Author: Angel Chavez
Assignment: Module 6 CLO
Date: 4/10/2024
Language: Java
Description: Base class for shapes with color attributes
*/
package CLO_Shape;

import java.util.Objects;

public abstract class Shape {
    //instance variables
    private String color;

    //constructors
    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
        this.color = "none";
    }

    //getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //abstract methods
    public abstract String displayInfo();

    public abstract double area();

    public abstract double perimeter();

    //overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape shape)) return false;
        return Objects.equals(getColor(), shape.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor());
    }

    @Override
    public String toString() {
        return "Color: " + color + "\n";
    }
}
