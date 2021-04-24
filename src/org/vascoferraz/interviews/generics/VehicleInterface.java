package org.vascoferraz.interviews.generics;

public interface VehicleInterface<T> {

     public abstract void accelerate(T speed);
     public abstract void brake(T speed);

}
