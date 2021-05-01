package org.vascoferraz.interviews.strings;

public class ReverseWords {

    public static void main(String[] args) {

        String message = "Hello, my name is Vasco";
        String[] splitMessage = message.split(" ");
        int size = splitMessage.length;
        String[] reverseMessage = new String[size];
        int counter = 0;

        for (int i = splitMessage.length; i > 0; i--) {
            reverseMessage[counter] = splitMessage[i - 1];
            counter++;
        }

        for (String str : reverseMessage) {
            System.out.println(str);
        }
    }
}
