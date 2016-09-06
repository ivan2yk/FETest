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
public class Equality {

    private String word;

    public Equality(String word) {
        this.word = word;
    }

    public static void main(String[] args) {
        Equality e1 = new Equality("howdy");
        Equality e2 = new Equality("howdy");                        
        if (e1.equals(e2)) {
            System.out.println(e1 == e2);
        }
    }

    public String getWord() {
        return word;
    }

    public boolean equals(Object o) {        
        if (((Equality) o).getWord() == word) {
            System.out.println("Equals! ");
            return true;
        } else {
            System.out.println("Equals... not! ");
            return false;
        }
    }

}
