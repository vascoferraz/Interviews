package org.vascoferraz.interviews.generics;

public class Main {

    public static void main(String[] args) {

        VehicleInterface car = new Car();
        VehicleInterface bike = new Bike();

        car.accelerate("twelve");
        car.brake(10.00);


        car.accelerate(10);
        bike.brake("ten");

    }
}
