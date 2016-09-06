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
public class Lost {

    public Lost() {
        System.out.println("En constructor..." + e);
    }

    public static void main(String[] args) {
        Lost e1 = new Lost();
        Lost e2 = new Lost();
        Lost e3 = new Lost();
        e3.e = e2;
        e1.e = e3;
        e2.e = e1;
        e3 = null;
        e2 = null;
        e1 = null;
    }

    Lost e;
}
