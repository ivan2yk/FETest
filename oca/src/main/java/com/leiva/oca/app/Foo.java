/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leiva.oca.app;

/**
 *
 * @author Usuario
 */
public class Foo {

    int[] iArray = {1, 2, 3};
    int i = 9;

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.mixitUp();
        for (int x = 0; x < foo.iArray.length; x++) {
            System.out.print(foo.iArray[x] + "_");
        }
        System.out.println(foo.i);
    }

    public void mixitUp() {
        iArray[0] = i * 2;//18
        iArray[1] = i++;//9
        iArray[2] = iArray[1];//9
    }

}
