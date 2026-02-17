package classes.exercises;

/**
 * Exercise 3: Inheritance
 * ------------------------
 * TODO:
 * 1. Create a superclass Vehicle with method start().
 * 2. Create a subclass Bike that adds method ride().
 * 3. In main(), create a Bike object and call both methods.
 */
public class Exercise3
{
    public static void main(String[] args)
    {
        // TODO: Create Bike object and test methods
        Bike v = new Bike();
        v.start();
        v.ride();
    }
}


class Vehicle {
    void start() {
        System.out.println("The vehicle started.");
    }
}


class Bike extends Vehicle {
    void ride() {
        System.out.println("Riding the bike.");
    }
}