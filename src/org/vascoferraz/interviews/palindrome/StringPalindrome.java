package org.vascoferraz.interviews.palindrome;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Word to test: ");
        String message = input.next();

        String lowerCaseMessage = message.toLowerCase();
        String reversedMessage = "";

        for (int i = lowerCaseMessage.length()-1 ; i >= 0 ; i--) {

            reversedMessage += lowerCaseMessage.charAt(i);
        }

        if (lowerCaseMessage.equals(reversedMessage)) {
            System.out.println("The string \"" + message + "\" is a palindrome");
        }
        else {
            System.out.println("The string \"" + message + "\" is not a palindrome");
        }
    }
}
