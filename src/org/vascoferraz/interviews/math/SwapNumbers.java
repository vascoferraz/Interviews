package org.vascoferraz.interviews.math;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number2: ");
        int number2 = input.nextInt();

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println(number1);
        System.out.println(number2);

    }
}
