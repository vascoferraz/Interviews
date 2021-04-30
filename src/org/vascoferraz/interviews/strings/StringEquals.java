package org.vascoferraz.interviews.strings;

public class StringEquals {

    public static void main(String[] args) {


        // Declaring strings using "new String" and comparing them with ==
        String string1 = new String("Hello World");
        String string2 = new String("Hello World");
        System.out.print(Integer.toHexString(System.identityHashCode(string1)));
        System.out.print(" | ");
        System.out.print(Integer.toHexString(System.identityHashCode(string2)));
        System.out.print(" | ");

        if (string1 == string2) {
            System.out.println("string1 == string2");

        } else {
            System.out.println("string1 != string2");
        }


        // Declaring strings without using "new String" and comparing them with ==
        String string3 = "Hello World";
        String string4 = "Hello World";
        System.out.print(Integer.toHexString(System.identityHashCode(string3)));
        System.out.print(" | ");
        System.out.print(Integer.toHexString(System.identityHashCode(string4)));
        System.out.print(" | ");

        if (string3 == string4) {
            System.out.println("string3 == string4");
        } else {
            System.out.println("string3 != string4");
        }


        // Declaring strings using "new String" and comparing them with equals
        String string5 = new String("Hello World");
        String string6 = new String("Hello World");
        System.out.print(Integer.toHexString(System.identityHashCode(string5)));
        System.out.print(" | ");
        System.out.print(Integer.toHexString(System.identityHashCode(string6)));
        System.out.print(" | ");

        if (string5.equals(string6)) {
            System.out.println("string5 == string6");
        } else {
            System.out.println("string5 != string6");
        }


        // Declaring strings without using and comparing them with equals
        String string7 = "Hello World";
        String string8 = "Hello World";
        System.out.print(Integer.toHexString(System.identityHashCode(string7)));
        System.out.print(" | ");
        System.out.print(Integer.toHexString(System.identityHashCode(string8)));
        System.out.print(" | ");

        if (string5.equals(string7)) {
            System.out.println("string7 == string8");
        } else {
            System.out.println("string7 != string8");
        }
    }
}
