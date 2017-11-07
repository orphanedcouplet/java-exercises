package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CountChars {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char[] charsInText = text.toCharArray();
        HashMap<Character, Integer> freqTable = new HashMap<>();

        for (char c : charsInText) {
            if (freqTable.containsKey(c)) {
                freqTable.put(c, freqTable.get(c) + 1);
            } else {
                freqTable.put(c, 1);
            }

        }

        for (Map.Entry<Character, Integer> charPair: freqTable.entrySet()) {
            System.out.println(charPair.getKey() + ": " + charPair.getValue());
        }
    }
}
