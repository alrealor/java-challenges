package com.arao.leetcode.arrays;

public class ArrayCommons {

    public static void printArray(int[] nums) {

        System.out.print("[");
        for(int x=0; x<nums.length; x++) {
            System.out.print(x != nums.length-1 ? nums[x] + "," : nums[x]);
        }
        System.out.print("]");

    }
}
