package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {

    @Test
    public void reverseStringWithSpacesTest() {
        Problem5 problem5 = new Problem5();
        String input = "I love UNIT Testing";

        String expected = "gnitseT TINU evol I";
        String actual = problem5.reverseString(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseEmptyStringTest() {
        Problem5 problem5 = new Problem5();
        String input = "";

        String expected = "";
        String actual = problem5.reverseString(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseSingleLetterStringTest() {
        Problem5 problem5 = new Problem5();
        String input = "A";

        String expected = "A";
        String actual = problem5.reverseString(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseStringNoSpacesTest() {
        Problem5 problem5 = new Problem5();
        String input = "Hello";

        String expected = "olleH";
        String actual = problem5.reverseString(input);

        Assert.assertEquals(expected, actual);
    }
}
