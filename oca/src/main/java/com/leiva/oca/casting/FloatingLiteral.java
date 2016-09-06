package com.leiva.oca.casting;

/**
 * A floating-point literal is of type float if it ends with the letter F or f;
 * otherwise its type is double and it can optionally end with the letter D or
 * d.<br>
 * Floating literals are defined as double by default
 *
 *
 */
public class FloatingLiteral {

    public static void main(String[] args) {
        // The floating point types (float and double) can also be expressed using E or e (for scientific notation)
        // 9.0122222900391E-5 means 9.0122222900391×10¨5

        double d1 = 123.4;
        // same value as d1, but in scientific notation
        double d2 = 1.234e2;
        float f1 = 123.4f;
        double x = 1e9;
        double y = 9.0122222900391E5;
        double p = 9878e8;

        System.out.println("1e9 -> " + x);
        System.out.println("123.4 -> " + d1);
        System.out.println("1.234e2 -> " + d2);
        System.out.println("123.4f -> " + f1);
        System.out.println("9.0122222900391E5 -> " + y);
        System.out.println("9878e8 -> " + p);

        float f = 32.3F;
        float g = (float) 32.3;
        float h = 32.3F;

        byte a = (byte) 129;
        System.out.println("" + a);
    }

}
