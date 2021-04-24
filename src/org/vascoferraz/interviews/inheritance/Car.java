package org.vascoferraz.interviews.inheritance;

public abstract class Car implements Vehicle {

    public void accelerate() {
        System.out.println("Generic car is accelerating");
    }

    public void brake() {
        System.out.println("Generic car is braking");
    }

}
