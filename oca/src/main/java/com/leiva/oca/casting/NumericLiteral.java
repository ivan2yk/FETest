package com.leiva.oca.casting;

public class NumericLiteral {

    public static void main(String[] args) {
        int pre7 = 100_000_000;
        System.out.println("100_000_000 -> " + pre7);

        int b1 = 0B101010;
        System.out.println("0B101010 -> " + b1);

        int b2 = 0b00011;
        System.out.println("0b00011 -> " + b2);

        int billon = 1_000_000_000;
        System.out.println("billon -> " + billon);
    }

}
