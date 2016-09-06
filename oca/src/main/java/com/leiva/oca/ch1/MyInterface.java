package com.leiva.oca.ch1;

import java.io.Serializable;
import java.util.concurrent.Callable;

public interface MyInterface extends Runnable, Serializable, Callable<String> {

    public static class Default implements MyInterface {

        @Override
        public void run() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String call() throws Exception {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
