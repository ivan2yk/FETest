package com.leiva.oca;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("a");
        ls.add("");
        ls.add(null);

        for (String l : ls) {
            ls.remove(l);
        }
    }
}
