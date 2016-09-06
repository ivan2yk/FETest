package com.leiva.oca.app;

public class App {

    public static void main(String[] args) {
        int answer = attempt(1);
        System.out.println(answer);
    }

    public static int attempt(int i) {
        switch (i) {
            case 1:
                return 'c';
            case 2:
                return (int) 1.4d;
            case 3:
                return new Integer(4);
            default:
                return 0;
        }
    }

}
