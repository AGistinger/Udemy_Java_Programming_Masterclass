package com.sets_hashsets;

public class DogMain {

    // type "psvm" to create a main method
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        // A labrador is an instance of Dog
        System.out.println(rover2.equals(rover));
        // Dog is not an instance of Labrador (fixed by not allowing equals
        // to be overriden in subclasses
        System.out.println(rover.equals(rover2));
    }
}
