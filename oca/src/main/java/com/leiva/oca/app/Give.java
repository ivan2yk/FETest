package com.leiva.oca.app;

public class Give {

    public static void main(String[] args) {
        char[] from = {'d', 'e', 'c', 'a', 'x', 'y', 'u', 'o', 'p', 'w', 'z'};
        char[] to = new char[9];
        System.arraycopy(from, 1, to, 0, 9);
        System.out.println(new String(to));
    }

}
