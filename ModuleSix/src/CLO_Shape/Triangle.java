/*
Author: Angel Chavez
Assignment: Module 6 CLO
Date: 4/10/2024
Language: Java
Description: sub class of Shape with base, side 1 and side 2 attributes
*/
package CLO_Shape;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Objects;

public class Triangle extends Shape {
    //instance variables
    private int base, sideOne, sideTwo;

    //constructors
    public Triangle(String color, int base, int sideOne, int sideTwo) {
        super(color);
        this.base = base;
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public Triangle() {
        super();
        this.base = 0;
        this.sideOne = 0;
        this.sideTwo = 0;
    }

    //getters and setters
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getSideOne() {
        return sideOne;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    //override abstract methods from Shape class
    public String displayInfo() {
        NumberFormat formatter = new DecimalFormat("#0.00");

        return "Area: " + formatter.format(area()) + "\n" +
                "Perimeter: " + formatter.format(perimeter());
    }

    public double area() {
        double semiPerimeter = perimeter() / 2;
        return (Math.sqrt(semiPerimeter * (semiPerimeter - sideOne) * (semiPerimeter - sideTwo) * (semiPerimeter - base)));
    }

    public double perimeter() {
        return sideOne + base + sideTwo;
    }

    //override functions
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle triangle)) return false;
        if (!super.equals(o)) return false;
        return getBase() == triangle.getBase() && getSideOne() == triangle.getSideOne() && getSideTwo() == triangle.getSideTwo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBase(), getSideOne(), getSideTwo());
    }

    @Override
    public String toString() {
        return "\tTriangle\n" + super.toString() +
                "Base: " + base + "\n" +
                "Side One: " + sideOne + "\n" +
                "Side Two " + sideTwo + "\n" +
                displayInfo();
    }
}
