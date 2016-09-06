package com.leiva.oca.ch6;

public class SplitTest {

    /**
     * The limit parameter controls the number of times the pattern is applied
     * and therefore affects the length of the resulting array. We have 3
     * possible values for this limit:<br>
     *
     * - If the limit n is greater than zero then the pattern will be applied at
     * most n - 1 times, the array's length will be no greater than n, and the
     * array's last entry will contain all input beyond the last matched
     * delimiter.<br>
     * - If n is non-positive then the pattern will be applied as many times as
     * possible and the array can have any length.<br>
     * - If n is zero then the pattern will be applied as many times as
     * possible, the array can have any length, and trailing empty strings will
     * be discarded.<br>
     */
    public static void main(String[] args) {
        String x = "asas|asdasd||||||";
        String[] xArray = x.split("\\|", -1);

        System.out.println("-> " + xArray.length);
    }
}
