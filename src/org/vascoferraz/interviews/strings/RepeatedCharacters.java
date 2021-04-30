package org.vascoferraz.interviews.strings;

import java.util.*;

public class RepeatedCharacters {

    public static void main(String[] args) {

        String message = "Hello, my name is Vasco";
        char[] messageChars = message.toCharArray();

        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        for (Character ch : messageChars) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        Iterator it = charMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();


            if ( (int) pair.getValue() >= 2) {
                System.out.println(pair.getKey() + " = " + pair.getValue());
            }
        }
    }
}
