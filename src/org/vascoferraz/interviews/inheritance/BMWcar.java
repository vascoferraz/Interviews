package org.vascoferraz.interviews.inheritance;

public class BMWcar extends Car implements Vehicle{


    @Override
    public void accelerate() {
        System.out.println("BMW car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("BMW car is braking");
    }

}
