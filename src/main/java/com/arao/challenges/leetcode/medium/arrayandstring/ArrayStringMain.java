package com.arao.challenges.leetcode.medium.arrayandstring;


import java.util.Scanner;

public class ArrayStringMain {

    public static void main(String[] args) {

        System.out.print("Menu \n" +
                "  1. 3Sum (Ex1) \n" +
                "  4. Longest Substring Without Repeating Characters (Ex4) \n" +
                "Pick up your option: ");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        switch(option) {
            case 1 -> threeSum();
            case 4 -> longestSubWithoutRepeatingChars();
            default -> System.out.println("Invalid option, exit");
        }

    }

    private static void threeSum() {
//        int[] array = new int[] {-1, 0, 1, 2, -1, -4};
//        int[] array = new int[] {0,0,0,0};
        int[] array = new int[] {0,1,1};
        Excercise1 ex1 = new Excercise1();
        System.out.println("Expected result: [-1, 0, 1][-1, -1, 2]");
        System.out.print("Output: ");
        ex1.threeSum(array).forEach(System.out::print);
    }

    private static void longestSubWithoutRepeatingChars() {
        Excercise4 ex4 = new Excercise4();
        String test = "PWWKEW";

        System.out.println("");
        System.out.println("Expected result: 3");
        System.out.println("Output: " + ex4.lengthOfLongestSubstring(test));
    }


}
