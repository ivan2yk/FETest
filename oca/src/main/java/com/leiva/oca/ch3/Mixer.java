package com.leiva.oca.ch3;

public class Mixer {

    Mixer() {
    }

    Mixer(Mixer m) {
        m1 = m;
    }

    Mixer m1;

    public static void main(String[] args) {
        Mixer m2 = new Mixer(); // m2 object and m1 null
        Mixer m3 = new Mixer(m2); // m3 object and m1 is m2
        Mixer m4 = m3.m1; // m4 is m2
        Mixer m5 = m2.m1; // m5 null

        m3.go();
        m4.go();
        m5.go();
    }

    void go() {
        System.out.println("hi ");
    }
}
