package com.leiva.oca.ch6;

public class Loopy {

    public static void main(String[] args) {
        int[] x = {7, 6, 5, 4, 3, 2, 1};

        for (int y : x) {
            System.out.println("" + y);
        }
        System.out.println("====================================================");
        for (int y = 0, z = 0; z < x.length; z++) {
            y = x[z];
            System.out.println("" + y);
        }
        System.out.println("====================================================");
        int i = 0;
        for (int j = 0; j < x.length; j++) {
            i = x[j];
            System.out.println("" + i);
        }
    }

}
