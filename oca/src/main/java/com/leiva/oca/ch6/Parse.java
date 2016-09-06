package com.leiva.oca.ch6;

public class Parse {

    /**
     * class NumberFormatException extends IllegalArgumentException
     */
    public static void main(String[] args) {
        try {
            String one = "1";
            Integer.parseInt(one);
        } catch (NumberFormatException e) {
        } catch (IllegalArgumentException e) {
        }
    }

}