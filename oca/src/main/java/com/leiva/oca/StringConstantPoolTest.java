package com.leiva.oca;

public class StringConstantPoolTest {

    public static void main(String[] args) {
        String literal = "test";
        String one = new String(literal);        
        String two = "test";

        System.out.println(literal == two); //true
        System.out.println(one == two); //false
    }
}
