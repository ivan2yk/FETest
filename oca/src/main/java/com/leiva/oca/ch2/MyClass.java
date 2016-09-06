package com.leiva.oca.ch2;

public class MyClass extends MySuperClass {

    public MyClass() {
        super();
        System.out.println("=)");
    }

    public void MyClass() {
        System.out.println("=)");
        //super();
    }

    public static void main(String... args) {
        System.out.println("=)");
        getValue(1);
    }

    public static void getValue(double d) {
        System.out.println("-> " + d);
    }

}
