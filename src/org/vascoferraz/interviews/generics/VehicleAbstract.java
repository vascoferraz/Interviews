package org.vascoferraz.interviews.generics;

public abstract class VehicleAbstract<T> implements VehicleInterface<T>{


    @Override
    public void accelerate(T speed) {
        System.out.println("Abstract car is accelerating");
    }

    @Override
    public void brake(T speed) {
        System.out.println("Abstract car is braking");
    }
}
