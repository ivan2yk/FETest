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
public class SuitCase {

    private int id;

    public SuitCase(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        SuitCase other = (SuitCase) obj;
        return id == other.id;
    }

    /**
     * I wanted to clarify if I understand this correctly:<br>
     * == -> is a reference comparison, i.e. both objects point to the same
     * memory location<br>
     * .equals() -> evaluates to the comparison of values in the objects<br>
     *
     * http://www.arquitecturajava.com/comparando-java-vs-equals/
     */
    public static void main(String[] args) {
        SuitCase a = new SuitCase(1);
        SuitCase b = new SuitCase(1);
        SuitCase c = b;
        String result = "-";
        if (a == b) {
            result += "1";
        }
        if (b == c) {
            result += "2";
        }
        b = c;
        if (a.equals(b)) {
            result += "3";
        }
        if (b.equals(c)) {
            result += "4";
        }
        System.out.println(result);
    }
}
