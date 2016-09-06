/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leiva.oca.in;

import com.leiva.oca.*;

public class Hammer {

    public void hit() {
        Bleh b = new Bleh();
        System.out.print(b.a + " ");
        b.say(8);
    }

    public static void main(String[] args) {
        new Hammer().hit();
    }

}
