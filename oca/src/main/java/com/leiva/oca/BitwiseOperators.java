/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leiva.oca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class BitwiseOperators {

    /**
     * Bitwise and Bit Shift Operators<br>
     * The bitwise & operator performs a bitwise AND operation.<br>
     * The bitwise ^ operator performs a bitwise exclusive OR operation.<br>
     * The bitwise | operator performs a bitwise inclusive OR operation.
     *
     * How does the XOR operator work in Java? (^)<br>
     * The XOR operator will return a 1, or TRUE, if both numbers being compared
     * are different. But, if the numbers being compared are the same it will
     * return a 0 for FALSE.
     *
     * Binary "BitWise" Operations<br>
     * Here are four common bit operators in Java.<br>
     * ~ - The unary complement<br>
     * & - Bitwise and<br>
     * ^ - Bitwise exclusive or<br>
     * | - Bitwise inclusive or<br>
     * Examples<br>
     * 1010 & 0101 == 0000<br>
     * 1100 & 0110 == 0100<br>
     * 1010 | 0101 == 1111<br>
     * 1100 | 0110 == 1110<br>
     * ~1111 == 0000<br>
     * ~0011 == 1100<br>
     * 1010 ^ 0101 == 1111<br>
     * 1100 ^ 0110 == 1010<br>
     */
    public static void main(String[] args) {
        System.out.println("Bitwise AND:" + (12 & 12));
        System.out.println("Bitwise inclusive OR:" + (12 | 12));
        System.out.println("Bitwise exclusive OR:" + (12 ^ 12));

        List<String> myList = null;

        if (false && !myList.isEmpty()) {
            System.out.println("=)");
        }
    }
}
