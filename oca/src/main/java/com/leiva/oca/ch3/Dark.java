package com.leiva.oca.ch3;

public class Dark {

    int x = 3;

    public static void main(String[] args) {
        new Dark().go1();
    }

    void go1() {
        int x = 0;
        go2(++x);
    }

    void go2(int y) {
        int x = ++y;
        System.out.println("" + x);
    }

}
