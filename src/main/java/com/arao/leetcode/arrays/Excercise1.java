package com.arao.leetcode.arrays;

public class Excercise1 {

    public int removeDuplicates(int[] nums) {
        // result integer with total number of expected elements after remove duplicates
        int k = 1;
        // index for original array
        int oIndex = 0;
        // index for result array
        int rIndex = 0;
        // loop original array to look for duplicates and add non-duplicate numbers into result array
        for (int i=1; i < nums.length; i++) {
            // add to result array when original array previous value is not the same as array current value
            if (nums[oIndex] != nums[i]) {
                rIndex++;
                nums[rIndex] = nums[i];
                k++;
            }
            oIndex++;
        }
        return k;
    }

}
