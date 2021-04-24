package org.vascoferraz.interviews.caesarcipher;

public class SimpleCaesarCipher {

    public static void main(String[] args) {

        String text = "Message to encrypt";

        char[] chars = text.toCharArray();

        for (char c : chars) {
            c += 1;
            System.out.print(c);
        }
    }
}
