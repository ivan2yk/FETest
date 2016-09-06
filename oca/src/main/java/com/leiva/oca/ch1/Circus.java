package com.leiva.oca.ch1;

public class Circus {

    static {
    }

    void doStuff() {
    }

    public static void main(String[] args) {
//        int z = 8;
//        for (int i = 0; i < 10; i++, --z) {
//        }

        Circus a = new Circus();
        Circus b = new Circus();
        if (a.equals(b)) {
            System.out.println("a equals b");
        }
        if (a == b) {
            System.out.println("a == b");
        }
    }
}
