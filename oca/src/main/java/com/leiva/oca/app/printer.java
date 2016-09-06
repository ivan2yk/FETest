package com.leiva.oca.app;

public class printer {

    /**
     * When using this version of the for statement, keep in mind that:
     *
     * The initialization expression initializes the loop; it's executed once,
     * as the loop begins.<br>
     * When the termination expression evaluates to false, the loop
     * terminates.<br>
     * The increment expression is invoked after each iteration through the
     * loop; it is perfectly acceptable for this expression to increment or
     * decrement a value.
     */
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 5, j = 1; j >= -1; --j, i--) {
            System.out.println(i + " " + j);
        }
        System.out.println(i + " " + j);

        //main();
    }

    private static void main() {
        int i;
        int j;
        int k;

        for (i = 0, j = 0, k = 0; i < 5; i++, ++j, k--) {
            System.out.println(i + " - " + j);
        }
        System.out.println(i + " - " + j + " - " + k);
    }

}
