package org.vascoferraz.interviews.generics;

public class Car<T> extends VehicleAbstract<T> {

    @Override
    public void accelerate(T speed) {
        System.out.println("Real car is accelerating " + speed + " km/h");
    }

    @Override
    public void brake(T speed) {
        System.out.println("Real car is braking " + speed + " km/h");
    }

}
