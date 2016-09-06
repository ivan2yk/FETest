package com.leiva.oca.app;

public class ArrayCopy {

    /**
     * Parameters src -- This is the source array.
     *
     * srcPos -- This is the starting position in the source array.
     *
     * dest -- This is the destination array.
     *
     * destPos -- This is the starting position in the destination data.
     *
     * length -- This is the number of array elements to be copied.
     *
     * @param args
     */
    public static void main(String[] args) {
        char[] from = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};
        char[] to = new char[7];

        System.arraycopy(from, 2, to, 0, 7);

        System.out.println(new String(to));
    }

}
