/*
Author: Angel Chavez
Assignment: Module 6 CLO
Date: 4/10/2024
Language: Java
Description: sub class of Shape with radius attributes
*/
package CLO_Shape;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Objects;

public class Circle extends Shape {
    //instance variables
    private final double PI = 3.14;
    private int radius;

    //constructors
    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
        super();
        this.radius = 0;
    }

    //getters and setters
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    //override abstract methods from Shape class
    public String displayInfo() {
        NumberFormat formatter = new DecimalFormat("#0.00");

        return "Area: " + formatter.format(area()) + "\n" +
                "Perimeter: " + formatter.format(perimeter());
    }

    public double perimeter() {
        return (int) (2 * PI * radius);
    }

    public double area() {
        return (PI * (radius * radius));
    }

    //overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(PI, circle.PI) == 0 && radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), PI, radius);
    }

    @Override
    public String toString() {
        return "\tCircle\n" + super.toString() +
                "Radius: " + radius + "\n" +
                displayInfo();
    }
}
