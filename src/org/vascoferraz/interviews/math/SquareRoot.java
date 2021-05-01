package org.vascoferraz.interviews.math;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {

        System.out.println("-- Welcome to the Square Root calculator --");
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert the number: ");
        double number = input.nextInt();
        input.close();

        double squareRoot = number / 2;
        double auxiliaryVariable = 0;

        while ((auxiliaryVariable - squareRoot) != 0) {
            auxiliaryVariable = squareRoot;
            squareRoot = (auxiliaryVariable + (number / auxiliaryVariable)) / 2;
        }

        System.out.println("Number: " + number);
        System.out.println("Square root: " + squareRoot);
    }
}
