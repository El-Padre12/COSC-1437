/*
Author: Angel Chavez
Assignment: Module 6 CLO
Date: 4/10/2024
Language: Java
Description: Shape program that demos abstract inheritance & polymorphism
*/
package CLO_Shape;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Shape triangle = new Triangle("Blue", 10, 10, 10);
        Shape circle = new Circle("Red", 10);
        Shape rectangle = new Rectangle("Purple", 10, 10);

        ArrayList<Shape> shapesList = new ArrayList<>();

        shapesList.add(triangle);
        shapesList.add(circle);
        shapesList.add(rectangle);

        for (Shape myList : shapesList ) {
            System.out.println(myList + "\n");
        }
    }
}
