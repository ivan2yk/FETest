package com.leiva.oca.app;

public class Tree {

    public static void main(String[] args) {
        Tree oak = new Oak();
    }

    Tree(int x) {
        System.out.println(x);
    }

    Tree() {
    }

}

class Oak extends Tree {

    Oak(int x) {
        System.out.println(x);
        //super(1);
    }

    Oak() {
        this(2);
        System.out.println("=)");        
    }

}
