package com.arao.challenges.leetcode.medium.arrayandstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Excercise1 {

    public List<List<Integer>> threeSum (int[] nums) {
        List<Integer> result;
        List<List<Integer>> list = new ArrayList<>();
        int mx = 0, my = 1, mz = 2, x = 0, y = 0, z = 0;

        while (true) {

            if (mx <= nums.length - 3) {
                x = nums[mx];

                if (my <= nums.length - 2) {
                    y = nums[my];

                    if (mz <= nums.length - 1) {
                        z = nums[mz];

                        System.out.println("x:"+x+", y:"+y+", z:"+z+" - mx:"+mx+", my:"+my+", mz:"+mz);

                        if (y + z != Math.negateExact(x)) {
                            mz++;
                            System.out.println("increasing index of Z - " + mz);
                        } else {
                             result = new ArrayList<>();
                            // sum is zero
                            result.add(nums[mx]);
                            result.add(nums[my]);
                            result.add(nums[mz]);
                            Collections.sort(result);
                            list.add(result);
                            mz++;
                            System.out.println("Success sum of elements is equqlas to ZERO");
                            list.forEach(System.out::println);
                        }
                    } else {
                        // index od Z has finished
                        my++;
                        mz = my + 1;
                        System.out.println("increasing index of Y - " + my);
                    }
                } else {
                    //index of Y has finished
                    mx++;
                    my = mx + 1;
                    mz = my + 1;
                    System.out.println("increasing index of x - " + mx);
                }
            } else {
                break;
            }
        }
        return list.stream().distinct().collect(Collectors.toList());
    }
}
