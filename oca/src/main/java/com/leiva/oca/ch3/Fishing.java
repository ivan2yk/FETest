package com.leiva.oca.ch3;

/**
 * when a mathematical operation is performed on any primitives smaller than
 * ints, the result is automatically cast to an integer
 */
public class Fishing {

    byte b1 = 4;
    int i1 = 123456;
    long L1 = (long) i1;
    short s2 = (short) i1;
    byte b2 = (byte) i1;
    int i2 = (int) 123.456;
    byte b3 = (byte) (b1 + 7); // the result is always a int

    public static void main(String[] args) {
        System.out.println("" + new Fishing().b3);
    }

}
