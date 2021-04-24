package org.vascoferraz.interviews.generics;

public class Bike<T> extends VehicleAbstract<T>{

    @Override
    public void accelerate(T speed) {
        System.out.println("Real bike is accelerating " + speed + " km/h");
    }

   @Override
    public void brake (T speed) {
        System.out.println("Real bike is braking " + speed + " km/h");
    }

}
