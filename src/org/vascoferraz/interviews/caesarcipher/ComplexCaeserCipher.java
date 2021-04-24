package org.vascoferraz.interviews.caesarcipher;

public class ComplexCaeserCipher {

    public static void main(String[] args) {

        // Keep in mind that there are 26 capitals letters
        encryptMessage("ABCDEFG", 2);
    }

    private static void encryptMessage(String message, int shift) {

        shift = shift%26;

        char[] chars = message.toCharArray();

        for (char c : chars) {

            if ( (int)c >= 65 && (int)c <= 90 ) {

                c += shift;

                if ((int)c > 90 ) {
                    int auxChar = (64+shift);
                    c = (char)auxChar;
                }
            }

            else {
                c=c;
            }

            System.out.print(c);
        }
    }
}
