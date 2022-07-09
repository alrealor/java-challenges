package com.arao.challenges.leetcode.arrays;

import java.util.Arrays;

/**
 * Single Number
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 *
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 *
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 */
public class Excercise5 {

    public int singleNumber(int[] nums) {
        int result = 0;
        // sort array is key to determine which is not duplicated
        Arrays.sort(nums);
        int initIdx = 0;
        int movingIdx = 1;
        int count = 0;
        boolean continueLoop = true;

        // loop until break
        while (continueLoop) {

            // validation for last element since that is not compared
            if (initIdx < (nums.length-1)) {

                // compare element from initial position against element in moving position
                // if those are the same, then increase counter of similar
                if (nums[initIdx] == nums[movingIdx]) {
                    movingIdx++;
                    count++;

                } else {
                    // if counter is zero the number is the only one, otherwise re-set indexes and counter
                    if (count == 0) {
                        result = nums[initIdx];
                        continueLoop = false;

                    } else {
                        initIdx = movingIdx;
                        movingIdx++;
                        count = 0;
                    }
                }
            } else {
                // for last element if previous are not unic, this one is the only unic
                result = nums[initIdx];
                continueLoop = false;
            }
        }
        return result;
    }
}
