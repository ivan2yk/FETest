package com.leiva.oca.casting;

/**
 * character are 16 bit unsigned integers under the hood
 */
public class CharacterLiterals {

    public static void main(String[] args) {
        char a = 'a';
        char b = '@';
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);

        // character as unicode \\u
        char letterN = '\u004E';
        System.out.println("letterN -> " + letterN);

        char aa = 0x892; // hexadecimal literal
        System.out.println("hexadecimal literal 0x892 -> " + (int) aa);

        char bb = 982; // int literal
        System.out.println("int literal 982 -> " + (int) bb);

        char tab = '\t';
        System.out.println("tab -> " + tab);

        String siSenor = "S\u00ED Se\u00F1or";
        System.out.println("siSenor -> " + siSenor);
    }

}
