package org.vascoferraz.interviews.palindrome;

public class StringPalindrome {

    public static void main(String[] args) {

        String message = "test";
        String reversedMessage = "";

        for (int i = message.length()-1 ; i >= 0 ; i--) {

            reversedMessage += message.charAt(i);
        }

        if (message.equals(reversedMessage)) {
            System.out.println("The string \"" + message + "\" is a palindrome");
        }
        else {
            System.out.println("The string \"" + message + "\" is not a palindrome");
        }
    }
}
