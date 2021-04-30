package org.vascoferraz.interviews.math;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year to test: ");

        int year = input.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");

        } else {
            System.out.println(year + " is not a leap year");
        }

        input.close();
    }
}
