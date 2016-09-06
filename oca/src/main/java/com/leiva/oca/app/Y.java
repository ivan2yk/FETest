package com.leiva.oca.app;

public class Y {

    private int b = 1;

    private int getB() {
        return b;
    }

    public static void main(String[] args) {
        Y y1 = new Y();
        X x1 = new X();
        Y y2 = x1;
        Y[] array = {y1, x1, y2};
        for (Y y : array) {
            System.out.println(y.getB());
        }
    }

}
