package com.leiva.oca.ch4;

public class ElseIf {

    /**
     * When using else-if a closing else is optional
     */
    public static void main(String[] args) {
        String x = "Ivan";

        if (x.equals("ivaN")) {
            System.out.println("It's ivaN");
        } else if (x.equals("Joel")) {
            System.out.println("It's Joel");
        } else if (x.equals("Ivanx")) {
            System.out.println("It's Ivan");
        } else if (x.equals("Alexander")) {
            System.out.println("It's Alexander");
        } else {
            System.out.println("It's no one");
        }
    }
}
