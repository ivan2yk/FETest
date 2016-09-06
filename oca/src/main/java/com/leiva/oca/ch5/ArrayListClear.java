package com.leiva.oca.ch5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClear {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(10);
        System.out.println("Initial capacity -> " + list.size());
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "C");
        list.add(0, "C");

        System.out.println("list.contains C -> " + list.contains("Cx"));
        System.out.println("list.get(2) -> " + list.get(3));

        for (String list1 : list) {
            System.out.println("Element -> " + list1 + ", Index -> " + list.indexOf(list1));
        }

        System.out.println("After add -> " + list.size());
        list.clear();
        System.out.println("After clear -> " + list.size());

        for (String list1 : list) {
            System.out.println("Element -> " + list1 + ", Index -> " + list.indexOf(list1));
        }
    }

}
