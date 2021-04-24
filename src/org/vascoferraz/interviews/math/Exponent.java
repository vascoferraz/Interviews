package org.vascoferraz.interviews.math;

public class Exponent {

    public static void main(String[] args) {

        System.out.println(exponent(3,99));
    }

    private static double exponent(double number, double exponent) {

        number = Math.pow(number, exponent);
        return number;
    }
}
