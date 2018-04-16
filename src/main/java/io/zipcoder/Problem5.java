package io.zipcoder;

public class Problem5 {
    public String reverseString(String input) {
        if (input.length() <= 1 ) {
            return input;
        }
        return input.substring(input.length()-1, input.length()) + reverseString(input.substring(0, input.length()-1));
    }
}

