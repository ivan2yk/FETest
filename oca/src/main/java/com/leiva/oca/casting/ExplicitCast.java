package com.leiva.oca.casting;

public class ExplicitCast {

    public static void main(String[] args) {
        float a = 100.001f;
        int b = (int) a;
        System.out.println("b -> " + b);

        int x = (int) 3957.229;
        System.out.println("x -> " + x);

        long l = 56L;
        byte bb = (byte) l;
        System.out.println("l -> " + l);
        System.out.println("bb -> " + bb);

        long ln = 130L;
        byte bt = (byte) ln;
        System.out.println("bt -> " + bt);
    }

}
