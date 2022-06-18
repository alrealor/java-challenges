package com.arao.leetcode.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Excercise4 {

    /**
     * Returns true if array contains at least one duplicate element
     * @param nums - array of int
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=1; i<nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                return true;
            }
        }
        return false;
    }
}
