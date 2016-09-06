package com.leiva.oca.ch3;

public class Ouch {

    static int ouch = 7;

    public static void main(String[] args) {
        new Ouch().go(ouch);
        System.out.println(" " + ouch);
    }

    void go(int ouch) {
        ouch++;
        for (int i = 3; i < 6; i++)
            ;
        System.out.println("" + ouch);
    }

}
