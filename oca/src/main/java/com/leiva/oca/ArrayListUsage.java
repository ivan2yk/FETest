package com.leiva.oca;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUsage {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>(2);
        System.out.println(""+l.size());
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        System.out.println(""+l.size());
    }
}
