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
public class Titanic {

    public static void main(String[] args) {
        Boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        if((b1&b2)|(b2&b3)&b3)
            System.out.println("alpha");
        if((b1=false)|(b1&b3)|(b1&b2))
            System.out.println("beta ");        
    }
}
