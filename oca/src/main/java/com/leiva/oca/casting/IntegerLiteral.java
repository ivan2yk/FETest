package com.leiva.oca.casting;

/**
 * An integer literal is of type long if it ends with the letter L or l;
 * otherwise it is of type int.
 */
public class IntegerLiteral {

    public static void main(String[] args) {
        // The number 26, in decimal
        int decVal = 26;
        System.out.println("decVal -> " + decVal);
        //  The number 26, in hexadecimal
        int hexVal = 0x1a;
        System.out.println("hexVal -> " + hexVal);
        // The number 26, in binary
        int binVal = 0b11010;
        System.out.println("binVal -> " + binVal);
    }

}
