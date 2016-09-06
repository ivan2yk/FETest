package com.leiva.oca.ch1;

class Parrot {

    void chirp(int i) {
        System.out.println("CHIRP");
    }
}

public class Parrotlet extends Parrot {

    void chirp(long i) {
        System.out.println("chirp");
    }

    public static void main(String[] args) {
        Parrotlet p = new Parrotlet();
        p.chirp(420);

        /**
         * 2147483647 es the max integer
         */
        System.out.println(Integer.MAX_VALUE);

        p.chirp(123_456_789_012l);
    }

}
