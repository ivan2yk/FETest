package com.leiva.oca.app;

public class Riyadh extends Town {

    Riyadh() {
        this(1.0d);
        System.out.println("n");
    }

    Riyadh(double d) {
        System.out.println("" + d);
    }

    public static void main(String[] args) {
        new Riyadh(1);
    }

}
