package com.leiva.oca.ch6;

public class Swill {

    static final int x2 = 2;
    static final Integer x4 = 3;

    public static void main(String[] args) {
        String s = "-";

        switch (TimeZone.CST) {
            case EST:
                s += "e";
            case CST:
                s += "c";
            case MST:
                s += "m";
            case PST:
                s += "X";
            default:
                s += ".";
        }
        System.out.println(s);

        Integer x5 = 0;

        switch (x5) {
            case 5:
            case x2:
            // wrapper variables aven final static ones arent considered constants
            //case x4:
            default:
        }
    }

}

enum TimeZone {

    EST, CST, MST, PST
}
