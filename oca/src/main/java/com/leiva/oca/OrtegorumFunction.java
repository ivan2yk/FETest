package com.leiva.oca;

public class OrtegorumFunction {

    public int computeDiscontinuous(int x) {
        int r = 1;
        r += x;
        if ((x > 4) && (x < 10)) {
            r += 2 * x;
        } else if (x <= 4) {
            r += 3 * x;
        } else {
            r += 4 * x;
        }
        r += 5 * x;
        return r;
    }

    public static void main(String[] args) {
        OrtegorumFunction o = new OrtegorumFunction();
        System.out.println("OF(2) is: " + o.computeDiscontinuous(11));
    }
}
