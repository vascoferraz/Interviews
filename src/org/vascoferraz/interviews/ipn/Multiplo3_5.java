package org.vascoferraz.interviews.ipn;

public class Multiplo3_5 {

    public static void main(String[] args) {

        System.out.println(multiplo3_5(10));
    }

    private static int multiplo3_5(int max) {

        int sum = 0;

        for (int i = 0; i < max; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }

        return sum;
    }
}
