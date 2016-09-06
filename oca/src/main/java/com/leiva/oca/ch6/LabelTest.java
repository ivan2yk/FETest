package com.leiva.oca.ch6;

public class LabelTest {

    public static void main(String[] args) {
        int[][] xx = {{1, 2, 500, 74}, {40, 41, 45, 77,}, {55, 58, 57, 59, 53}};

        myLabel:
        for (int i = 0; i < xx.length; i++) {
            System.out.println("-> " + xx[i]);
            for (int j = 0; j < xx[i].length; j++) {
                System.out.println("-> " + xx[i][j]);
                if (xx[i][j] == 40) {
                    break myLabel;
                }
            }
        }
    }
}
