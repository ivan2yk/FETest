package com.leiva.oca.ch6;

class Infinity {
};

public class Beyond extends Infinity {

    static Integer i;
    static int ii;
    static String myString;
    static double myDouble;

    public static void main(String[] args) {
        int[] sww = {0, 1, 2};

        System.out.println("" + i);
        System.out.println("" + ii);
        System.out.println("" + myString);
        System.out.println("" + myDouble);

        for (int sw : sww) {
            switch (sw) {
                case 0: {
                    for (int j = 0; j > 5; j++) {
                        if (j > 10) {
                            j = 10;
                        }
                        break;
                    }
                }
                case 1: {
                    int y = 7 * i;
                    break;
                }
                case 2: {
                    Beyond inf = new Beyond();
                    Beyond b = (Beyond) inf;
                }
            }
        }
    }

}
