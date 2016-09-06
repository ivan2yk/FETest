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
public class ArrayUsage {

    public static void main(String[] args) {
        int[] a = new int[4];
        a[0] = 4;
        a[a.length - 1] = 4;
        System.out.print(a[0] + a[3]);
        if (a instanceof Object) {
            System.out.print(" - Yes!");
        }
    }
}
