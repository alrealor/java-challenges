package com.arao.leetcode.strings;

import com.arao.leetcode.arrays.ArrayCommons;

import java.util.Scanner;

public class StringsMainExecutor
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Strings Menu Options" +
                "\n1 - Reverse String [Excercise1]" +
                "\nChoose your menu number option: ");
        int option = scanner.nextInt();

        switch(option) {
            case 1 -> reverseString();
            default -> System.out.println("Invalid option, exit");
        }
    }

    /**/
    private static void reverseString() {
        Excercise1 ex1 = new Excercise1();
        char[] array = new char[] {'H','e','l','l','o'};
        char[] expected = new char[] {'o','l','l','e','H'};

        System.out.print("\nOriginal array: ");
        ArrayCommons.printArray(array);

        System.out.print("\nReversed array: ");
        ArrayCommons.printArray(ex1.reverseString(array));

        System.out.print("\nExpected output: ");
        ArrayCommons.printArray(expected);
    }
}
