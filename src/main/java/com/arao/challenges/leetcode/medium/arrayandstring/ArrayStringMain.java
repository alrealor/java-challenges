package com.arao.challenges.leetcode.medium.arrayandstring;


import java.util.Scanner;

public class ArrayStringMain {

    public static void main(String[] args) {

        System.out.print("Menu \n " +
                "  4. Longest Substring Without Repeating Characters (Ex4) \n" +
                "Pick up your option: ");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        switch(option) {
            case 4: longestSubWithoutRepeatingChars();
            default:
                System.out.println("Invalid option, exit");
        }

    }

    private static void longestSubWithoutRepeatingChars() {
        Excercise4 ex4 = new Excercise4();
        String test = "PWWKEW";

        System.out.println("");
        System.out.println("Expected result: 3");
        System.out.println("Output: " + ex4.lengthOfLongestSubstring(test));
    }


}
