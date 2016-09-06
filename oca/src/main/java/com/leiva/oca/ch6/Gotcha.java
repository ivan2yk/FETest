package com.leiva.oca.ch6;

public class Gotcha {

    public static void main(String[] args) {
//        new Gotcha().go();

        try {
            new Gotcha().go();
        } catch (Error e) {
            System.out.println("ouch " + e);
        }

        try {
            new Gotcha().go();
        } catch (Exception e) {
            System.out.println("ouch " + e);
        }
    }

    void go() {
        go();
    }

}
