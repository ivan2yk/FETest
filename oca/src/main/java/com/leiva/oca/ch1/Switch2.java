package com.leiva.oca.ch1;

public class Switch2 {

    static final int x = 1;
    static final int y = 2;

    public static void main(String[] args) {
        int val = 5;

        switch (val) {
            case (x - 1):
                System.out.println("0");
                break;
            default:
                System.out.println("def");
            case x:
                System.out.println("1");
            case y + 3:
                System.out.println("2");
        }
    }

}
