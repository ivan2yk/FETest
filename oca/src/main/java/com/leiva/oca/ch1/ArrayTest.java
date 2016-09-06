package com.leiva.oca.ch1;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {

    public static void main(String[] args) {
        Object xx = new long[4];
        long[] yy = (long[]) xx;
        yy[0] = 1L;
        System.out.println("" + yy[0]);

        Object[] pid = new String[8];
        Object[] pidx = new ArrayTest[2];

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(2);
        l.remove(1);
        System.out.println("" + l);
    }
}
