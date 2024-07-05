/*
Author: Angel Chavez
Assignment: Module 6 CLO
Date: 4/10/2024
Language: Java
Description: Sub class of Shape with length, and width attributes
*/
package CLO_Shape;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Objects;

public class Rectangle extends Shape {
    //instance variables
    private int length, width;

    //constructors
    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        super();
        this.length = 0;
        this.width = 0;
    }

    //getters and setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //override abstract methods from Shape class
    @Override
    public String displayInfo() {
        NumberFormat formatter = new DecimalFormat("#0.00");

        return "Area: " + formatter.format(area()) + "\n" +
                "Perimeter: " + formatter.format(perimeter());
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return (length + width) * 2;
    }

    //overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        if (!super.equals(o)) return false;
        return getLength() == rectangle.getLength() && getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLength(), getWidth());
    }

    @Override
    public String toString() {
        return "\tRectangle\n" + super.toString() +
                "Length: " + length + "\n" +
                "Width: " + width + "\n" +
                displayInfo();
    }
}
