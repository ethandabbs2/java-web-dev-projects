package org.example;

public class counting {
    public static int countChar(String str, String character) {

        if (str.isEmpty()) {
            return 0;
        }

        if (!(str.substring(0, 1).equals(character))) {
            return countChar(str.substring(1), character);
        } else {
            return 1 + countChar(str.substring(1), character);
        }
    }
}