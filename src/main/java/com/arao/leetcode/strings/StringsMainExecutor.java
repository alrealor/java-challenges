package com.arao.leetcode.strings;

import com.arao.leetcode.arrays.ArrayCommons;

import java.util.Scanner;

public class StringsMainExecutor extends ArrayCommons
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Strings Menu Options" +
                "\n1 - Reverse String [Excercise1]" +
                "\n2 - Reverse Integer [Excercise2]" +
                "\nChoose your menu number option: ");
        int option = scanner.nextInt();

        switch(option) {
            case 1 -> reverseString();
            case 2 -> reverseInteger();
            default -> System.out.println("Invalid option, exit");
        }
    }

    /* Reverse integer method */
    private static void reverseInteger() {
        Excercise2 ex2 = new Excercise2();
        int number = -123;
        System.out.print("\nOriginal number: " + number);
        System.out.print("\nReversed number: " + ex2.reverseInteger(number));
        System.out.print("\nExpected output: " + -321);
    }

    /* Reverse string method */
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
