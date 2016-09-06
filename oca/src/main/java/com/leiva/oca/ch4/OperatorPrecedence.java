package com.leiva.oca.ch4;

public class OperatorPrecedence {

    /**
     * The Java Tutorials has a list illustrating operator precedence. The
     * equality operators will be evaluated first, then &&, then ||. Parentheses
     * will be evaluated before anything else, so adding them can change the
     * order. This is usually pretty much the same from language to language,
     * but it's always a good idea to double check.<br>
     *
     * The difference between the logical operators (& and |) compared to their
     * conditional counterparts (&& and ||) is that the former do not
     * "shortcircuit"; the latter do. That is:
     *
     *
     */
    public static void main(String[] args) {
        Boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        if ((b1 & b2) | (b2 & b3) & b3) {
            System.out.println("alpha ");
        }
        if ((b1 = false) | (b1 & b3) | (b1 | b2)) {
            System.out.println("beta ");
        }

        System.out.println("b1=false -> " + (b1 = false));
        System.out.println("b1 is not true anymore -> " + (b1));
        System.out.println("true|false -> " + (true | false));
        System.out.println("true|true -> " + (true | true));
        System.out.println("true&false -> " + (true & false));
        System.out.println("false&true -> " + (false & true));
        System.out.println("true&true -> " + (true & true));
    }
}
