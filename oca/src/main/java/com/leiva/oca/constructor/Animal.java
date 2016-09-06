/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leiva.oca.constructor;

/**
 *
 * @author Usuario
 */
public class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    Animal() {
        this(makeRandomName());
    }

    static String makeRandomName() {
        int x = (int) (Math.random() * 4);
        return new String[]{"Fluffy", "Fido", "Rover", "Gigi"}[x];
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.name);
        Animal b = new Animal("Zeus");
        System.out.println(b.name);
    }
}
