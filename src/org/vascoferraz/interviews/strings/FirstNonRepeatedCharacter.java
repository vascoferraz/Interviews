package org.vascoferraz.interviews.strings;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String message = new String("Hello, my name is Vasco");

        for (int i = 0;  i < message.length()-1 ; i++) {

            for (int j = i+1 ; j < message.length() ; j++) {

                if (message.charAt(i) == message.charAt(j)) {
                    System.out.println("First repeated character: " + message.charAt(i));
                    System.out.println("Index: " + message.indexOf(message.charAt(i)));
                    i=message.length()-1;
                    j=message.length()-1;
                }
            }
        }
    }
}
