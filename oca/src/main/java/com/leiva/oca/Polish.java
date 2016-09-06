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
public class Polish {

    /**
     * delete:<br>
     * Removes the characters in a substring of this sequence. The substring
     * begins at the specified start and extends to the character at index end -
     * 1 or to the end of the sequence if no such character exists (characters
     * begins at 0).
     */
    public static void main(String[] args) {
        int x = 4;
        StringBuilder sb = new StringBuilder("..fedcba");
        sb.delete(3, 6);
        System.out.println(""+sb);
        sb.insert(3, "az");
        System.out.println(""+sb);
        if(sb.length()>6) x = sb.indexOf("b");
        sb.delete((x-3), (x-2));
        System.out.println("" + sb);
    }

}
