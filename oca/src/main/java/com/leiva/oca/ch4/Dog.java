package com.leiva.oca.ch4;

public class Dog {

    String name;

    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Boi");
        Dog d2 = new Dog("Tyri");
        System.out.println((d1 == d2) + "");
        Dog d3 = new Dog("Boi");
        d2 = d1;
        System.out.println((d1 == d2) + "");
        System.out.println((d1 == d3) + "");
    }
}
