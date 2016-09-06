package com.leiva.ocp;

public class TestMyAutoCloseableClass {

    public static void main(String[] args) throws Exception {
        try (MyAutoCloseableClass macc = new MyAutoCloseableClass();) {
            macc.doStuff();
        }
    }

}
