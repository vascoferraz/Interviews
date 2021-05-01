package org.vascoferraz.interviews.math;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        int num1 = 16;
        int num2 = 18;

        for (int i = num1; i > 0 ; i--) {

            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
