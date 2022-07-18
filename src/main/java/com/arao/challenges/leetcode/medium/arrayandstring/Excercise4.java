package com.arao.challenges.leetcode.medium.arrayandstring;

import java.util.LinkedHashSet;
import java.util.Set;

public class Excercise4 {

    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new LinkedHashSet<>();
        int i1=0, i2=0, max=0;

        while(i1 < s.length()) {
            if(set.contains(s.charAt(i1))) {
                set.remove(s.charAt(i2));
                i2++;
            } else {
                set.add(s.charAt(i1));
                max = Math.max((i1-i2)+1, max);
                i1++;
            }
        }
        return max;
    }
}
