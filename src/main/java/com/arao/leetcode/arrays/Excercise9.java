package com.arao.leetcode.arrays;

/**
 * Two Sum
 *
 * Solution
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class Excercise9 {

    public int[] twoSum(int[] nums, int target) {
        int secNum = 0;
        int[] r = new int[2];
        for(int i=0; i<nums.length; i++) {
            r[0] = i;
            secNum = target - nums[i];
            for(int j=(i+1); j<nums.length; j++) {
                if(nums[j] == secNum) {
                    r[1] = j;
                    break;
                }
            }
            if (r[1] != 0)
                break;
        }
        return r;
    }
}