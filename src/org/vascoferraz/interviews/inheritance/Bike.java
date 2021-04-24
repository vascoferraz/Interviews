package org.vascoferraz.interviews.inheritance;

public abstract class Bike implements Vehicle {

    public void accelerate() {
        System.out.printf("Generic bike is accelerating");
    }

    public void brake() {
        System.out.printf("Generic bike is braking");
    }

}
