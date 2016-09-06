/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leiva.oca;

/**
 *
 * @author Usuario
 */
public class Animals {

    public static void main(String[] args) {
        String word = "quack";
        switch (word) {
            case "roof": {
                System.out.println("Sounds like a dog!");
                break;
            }
            case "mew": {
                System.out.println("Sounds like a cat!");
                break;
            }
            case "tweet": {
                System.out.println("Sounds like a bird!");
                break;
            }
            default: {
                System.out.println("It's another animal...");
            }
        }
    }

}
