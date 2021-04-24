package org.vascoferraz.interviews.math;

public class Prime {


    public static void main(String[] args) {

        for (int number = 0; number <= 1000; number++) {
            System.out.print("Number " + number + " is prime? ");
            System.out.println(isPrime(number));
        }
    }

    private static boolean isPrime(int number) {

        if (number <= 0) {
            return false;
        }

        if (number == 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
