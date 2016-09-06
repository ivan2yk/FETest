/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leiva.oca;

/**
 *
 * @author Usuario
 */
public class Test {

    public static void main(String[] args) {
        short[][] b = new short[4][4];
        short[][] big = new short[2][2];
        short b3 = 8;
        short b2[][][][] = new short[2][3][2][2];

        short x[] = new short[5];
        short[] y = new short[5];
        short[] z[][] = new short[5][2][8];

        b2[1][1] = big;
        b[1][0] = b3;
        b2[1][1][0][1] = b[1][0];
        b2[1][1] = b;
    }
}
