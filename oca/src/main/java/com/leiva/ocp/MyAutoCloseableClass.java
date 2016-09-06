package com.leiva.ocp;

public class MyAutoCloseableClass implements AutoCloseable {

    public void doStuff() {
        System.out.println("doing something...!");
    }

    @Override
    public void close() throws Exception {
        System.out.println("closing something...!");
    }

}
