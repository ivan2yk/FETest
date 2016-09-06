package com.leiva.oca.ch6;

public class TestWhileBrackets {

    public static void main(String[] args) {
        int I = 1;

        do while (I < 1)
            System.out.println("I is" + I);
        while (I > 1);

        while (I < 1)
            System.out.println("I is " + I);        

        do
            System.out.println(":)");
        while (I>1);

    }
}
