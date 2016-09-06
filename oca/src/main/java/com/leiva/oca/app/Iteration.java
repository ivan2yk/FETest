package com.leiva.oca.app;

public class Iteration {

    private static void addTo(int[] nums, int index) {
        index++;
        nums[index] = 14;
    }

    public static void main(String[] args) {
        int index = 2;
        int[] nums = {1, 3, 5, 7};
        addTo(nums, index);
        for (int num : nums) {
            System.out.print(num + ",");
        }
        System.out.println(index);
    }

}
