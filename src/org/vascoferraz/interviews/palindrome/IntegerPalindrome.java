package org.vascoferraz.interviews.palindrome;

public class IntegerPalindrome {

    public static void main(String[] args) {

        int originalNumber = 1001;
        int numberToManipulate = originalNumber;
        int numberLength = (int) (Math.log10(numberToManipulate) + 1);
        int reversedNumber = 0;

        while (numberToManipulate > 0) {
            reversedNumber += (int) ((numberToManipulate % 10 * Math.pow(10, numberLength))) / 10;
            numberToManipulate = numberToManipulate / 10;
            numberLength--;

        }

        if (originalNumber == reversedNumber) {
            System.out.println("The number \"" + originalNumber + "\" is a palindrome");
        }
        else {
            System.out.println("The number \"" + originalNumber + "\" is not a palindrome");
        }
    }
}
