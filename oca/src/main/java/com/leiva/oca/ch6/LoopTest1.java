package com.leiva.oca.ch6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopTest1 {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("a");
        l.add("b");
        l.add("x");
        for (String l1 : l) {
            l.remove(l1);
        }

        String a[] = {"a", "b", "c", "d"};
        for (String a1 : a) {
            
        }
    }
}
