/*
Author: Angel Chavez
Assignment: Module 5 CLO 8
Date: 3/31/2024
Language: Java
Description: class hierarchy that demos inheritance and overrides.
*/
package CLO_8;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Fido");
        Animal dog2 = new Dog("Fido");
        Animal cat1 = new Cat("Sparkles");
        Animal cat2 = new Cat("Mayhem");

        ArrayList<Animal> dogList = new ArrayList<>();
        ArrayList<Animal> catList = new ArrayList<>();

        dogList.add(dog1);
        dogList.add(dog2);
        catList.add(cat1);
        catList.add(cat2);

        System.out.println("*** Animal lab ***");

        for (Animal myAnimal : dogList) {
            System.out.println(myAnimal + "\n");
        }

        for (Animal myAnimal : catList) {
            System.out.println(myAnimal + "\n");
        }

        System.out.println("dog 1 hashcode: " + dog1.hashCode());
        System.out.println("dog 2 hashcode: " + dog2.hashCode());
        if(dog1.equals(dog2)) {
            System.out.println("dogs are equal");
        }else {
            System.out.println("dogs are NOT equal");
        }

        System.out.println("cat 1 hashcode: " + cat1.hashCode());
        System.out.println("cat 2 hashcode: " + cat2.hashCode());
        if(cat1.equals(cat2)) {
            System.out.println("cats are equal");
        }else {
            System.out.println("cats are NOT equal");
        }

    }
}
