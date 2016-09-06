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
public class Update {

    private static void update(int[] nums, int index) {
        index++;
        nums[index] = 14;
    }

    public static void main(String[] args) {
        int index = 2;
        int[] nums = {1, 3, 5, 7};

        String[] x = {"", ""};
        Update[] y = {new Update(), new Update()};

        update(nums, index);

        for (int num : nums) {
            System.out.print(num + ", ");
        }
        System.out.print(index);
    }

}
