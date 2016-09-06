package com.leiva.oca.ch5;

public class StringBuilderTest {

    public static void main(String[] args) {
        int x = 5;

        StringBuilder sb1 = new StringBuilder(); // default cap. 16 chars
        StringBuilder sb2 = new StringBuilder("ab"); // default cap. 16 + arg's length
        StringBuilder sb3 = new StringBuilder(x); // capacity = x (an integer)
        sb2.append("hello sansa");
        sb1.insert(0, "=)");
        sb3.append("pi = ");
        sb3.append(3.131416f);

        StringBuilder pi = new StringBuilder("0123456789");
        System.out.println(pi.delete(4, 6));

        StringBuilder xy = new StringBuilder("0123456789");
        xy.insert(4, "----------");
        System.out.println(xy);

        StringBuilder pan = new StringBuilder("hello sansa");
        pan.reverse();
        System.out.println(pan);

        System.out.println(sb3);
        System.out.println("-> " + sb1.toString());
        System.out.println("-> " + sb2);

    }
}
