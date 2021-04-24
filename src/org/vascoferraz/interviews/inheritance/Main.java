package org.vascoferraz.interviews.inheritance;

public class Main {

    public static void main(String[] args) {


        Vehicle series1 = new BMWcar();
        series1.accelerate();
        series1.brake();

        Vehicle r1200 = new BMWbike();
        r1200.accelerate();
        r1200.brake();


        // Polymorphism
        Vehicle polymorphicVehicle;

        int randomNumber = (int)(Math.random()*2);

        if (randomNumber == 0) {
            polymorphicVehicle = new BMWbike();
        }

        else {
            polymorphicVehicle = new BMWcar();
        }

        polymorphicVehicle.accelerate();
        polymorphicVehicle.brake();

    }

}
