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
public class Change {

    private static void changeIt(int num, String str, StringBuilder builder) {
        num = 5;
        str += "b";
        builder.append("d");
    }

    public static void main(String[] args) {
        int num = 1;
        String str = "a";
        StringBuilder builder = new StringBuilder("c");
        changeIt(num, str, builder);
        System.out.println("num: " + num);
        System.out.println("str: " + str);
        System.out.println("builder: " + builder);
    }

}
