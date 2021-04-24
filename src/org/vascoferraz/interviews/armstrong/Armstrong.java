package org.vascoferraz.interviews.armstrong;

public class Armstrong {

    public static void main(String[] args) {

        for (int i = 1; i < 100000000 ; i++) {

            int number = i;
            int numberLength = (int) (Math.log10(number) + 1);
            int testForArmstrong = 0;

            while (number > 0) {
                testForArmstrong += Math.pow(number % 10, numberLength);
                number = number / 10;
            }

            if (i == testForArmstrong) {
                System.out.println(testForArmstrong);
            }
        }
    }
}
