package org.vascoferraz.interviews.inheritance;

public class BMWbike extends Bike implements Vehicle{


    @Override
    public void accelerate() {
        System.out.println("BMW bike is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("BMW bike is braking");
    }

}
