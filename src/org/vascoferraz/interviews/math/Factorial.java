package org.vascoferraz.interviews.math;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(10));
    }

    private static int factorial(int number) {

        return (number == 1 || number == 0) ? 1 : number * factorial(number - 1);
    }
}
