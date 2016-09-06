package com.leiva.oca.casting;

public class HexaTest {

    /**
     * hexa: 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f <br>
     * prefix: 0x, 0X
     *
     * @param args
     */
    public static void main(String[] args) {
        int x = 0X0001;
        int y = 0x7fffffff;
        
        // 0xDeadCafe = 0xDEADCAFE
        int z = 0xDeadCafe;
        
        int i = 0xaba;

        System.out.println("hexa 0X0001 -> " + x);
        System.out.println("hexa 0x7fffffff -> " + y);
        System.out.println("hexa 0xDeadCafe -> " + z);
        System.out.println("hexa 0xaba -> " + i);
    }

}
