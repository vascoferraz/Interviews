package org.vascoferraz.interviews.strings;

public class StringBufferStringBuilder {

    public static void main(String[] args) {

        String str = new String("Hello");
        StringBuffer buffer= new StringBuffer ("Hello");
        StringBuilder builder = new StringBuilder("Hello");

        str.concat(", my name is Vasco"); // Immutable - You can't change a string...
        System.out.println(str);

        String newStr = str.concat(", my name is Vasco"); // Immutable - ... unless you create a new one.
        System.out.println(newStr);

        buffer.append(", my name is Vasco"); // Mutable - If you use StringBuffer you can change a string.
        System.out.println(buffer);

        builder.append(", my name is Vasco"); // Mutable - If you use StringBuilder you can change a string.
        System.out.println(builder);

    }
}
