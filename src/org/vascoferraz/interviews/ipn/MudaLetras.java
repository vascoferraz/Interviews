package org.vascoferraz.interviews.ipn;

public class MudaLetras {

    public static void main(String[] args) {

        System.out.println(mudaLetras("hello*3"));
        System.out.println(mudaLetras("fun times!"));
    }

    public static String mudaLetras(String str) {

        String result = "";
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'z' || str.charAt(i) == 'd' || str.charAt(i) == 'h' || str.charAt(i) == 'n' || str.charAt(i) == 't') {
                result += Character.toString((char) (((int) str.charAt(i)) - 31));
            }

            else if (str.charAt(i) < 97 || str.charAt(i) > 122) {
                result += Character.toString(str.charAt(i));
            }

            else {
                result += Character.toString((char) (((int) str.charAt(i)) + 1));
            }
        }

        return result;
    }
}
