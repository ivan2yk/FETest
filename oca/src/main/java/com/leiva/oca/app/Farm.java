package com.leiva.oca.app;

public class Farm {

    Farm() {
        System.out.println("Dog");
    }

    {
        System.out.println("Cat");
    }

    public static void main(String[] args) {
        new Farm().go();
        System.out.println("------------------------------------");
        new Farm().go();
        System.out.println("------------------------------------");
        new Farm().go();
    }

    void go() {
        System.out.println("Pig");
    }

    static {
        System.out.println("Cow");
    }

}
