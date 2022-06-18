package com.arao.leetcode.arrays;

import java.util.Scanner;

public class ArraysMainExecutor {

    public static void main(String... args) {

        System.out.print("Array Menu Options" +
                "\n1 - Remove duplicates from sorted array (Excercise1)" +
                "\n2 - Best time to buy and sell (Excercise2)" +
                "\n3 - Rotate array (Excercise3)" +
                "\n4 - Contain duplicate (Excercise4)" +
                "\n5 - Single number (Excercise5)" +
                "\n6 - Intersection of two arrays (Excercise6)" +
                "\n7 - Plus one (Excercise7)" +
                "\n8 - Move Zeroes (Excercise8)" +
                "\n9 - Two Sum (Excercise9)" +
                "\nChoose your menu number option: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch(option) {
            case 1 -> removesDuplicateFromSortedArray();
            case 2 -> bestTimeBuyAndSell();
            case 3 -> rotateArray();
            case 4 -> containDuplicate();
            case 5 -> detectSingleNumber();
            case 6 -> intersectTwoArrays();
            case 7 -> plusOne();
            case 8 -> moveZeroes();
            case 9 -> twoSum();
        }
    }

    private static void twoSum(){
        Excercise9 ex9 = new Excercise9();
        int[] array = new int[] {0,-3,1,8,3};
        int target = 0;
        int[] expected = new int[] {1, 4};
        System.out.print("Original array: ");
        ArrayCommons.printArray(array);
        System.out.print("\nTarget: " + target);
        System.out.print("\nResult array: ");
        ArrayCommons.printArray(ex9.twoSum(array, target));
        System.out.print("\nExpected output: ");
        ArrayCommons.printArray(expected);
    }

    private static void moveZeroes(){
        Excercise8 ex8 = new Excercise8();
        int[] array = new int[] {0,4,0,1,12,3,0};
        int[] expected = new int[] {4,1,12,3,0,0,0};
        System.out.print("Original array: ");
        ArrayCommons.printArray(array);
        System.out.print("\nMove zeroes result: ");
        ArrayCommons.printArray(ex8.moveZeroes(array));
        System.out.print("\nExpected output: ");
        ArrayCommons.printArray(expected);
    }

    /**/
    private static void plusOne(){
        Excercise7 ex7 = new Excercise7();
        int[] array = new int[] {9,9,9};
        int[] expected = new int[] {1,0,0,0};
        System.out.print("Original array: ");
        ArrayCommons.printArray(array);
        System.out.print("\nArray plus one: ");
        ArrayCommons.printArray(ex7.plusOne(array));
        System.out.print("\nExpected output: ");
        ArrayCommons.printArray(expected);
    }

    /**/
    private static void intersectTwoArrays(){
        Excercise6 ex6 = new Excercise6();
        int[] array1 = new int[] {4,9,5};
        int[] array2 = new int[] {9,4,9,8,4};
        System.out.print("Original array 1: ");
        ArrayCommons.printArray(array1);
        System.out.print("\nOriginal array 2: ");
        ArrayCommons.printArray(array2);
        System.out.print("\nIntersect array: ");
        ArrayCommons.printArray(ex6.intersect(array1, array2));
    }

    /**/
    private static void detectSingleNumber(){
        Excercise5 ex5 = new Excercise5();
        int[] array = new int[] {1,2,3,1,3};
        System.out.print("Original array: ");
        ArrayCommons.printArray(array);
        System.out.print("\nSingle number: " + ex5.singleNumber(array));
    }

    /**/
    private static void containDuplicate(){
        Excercise4 ex4 = new Excercise4();
        int[] array = new int[] {1,2,3};
        System.out.print("Original array: ");
        ArrayCommons.printArray(array);
        System.out.print("\nContain duplicate " + ex4.containsDuplicate(array));
    }

    /**/
    private static void rotateArray() {
        Excercise3 ex3 = new Excercise3();
        int[] array = new int[] {1,2,3,4,5,6,7};
        int k = 3;
        System.out.print("Original array: ");
        ArrayCommons.printArray(array);
        System.out.print("\nArray rotated " + k + " times at right: ");
        ArrayCommons.printArray(ex3.rotateFaster(array, k));
    }

    /**/
    private static void bestTimeBuyAndSell() {
        Excercise2 ex2 = new Excercise2();
        int[] array = new int[] {7,1,5,4,3,5,8,2,2,7,7,1};
        System.out.print("\nOriginal array: ");
        ArrayCommons.printArray(array);
        System.out.println("\nMaximum profit: " + ex2.maxProfit(array));


    }

    /**/
    private static void removesDuplicateFromSortedArray() {
        Excercise1 ex1 = new Excercise1();
        int[] orderedArray = new int[] {1,1,1,2,2,3,4,5,5,6,7,7,8,9,10};
        System.out.print("Original array: ");
        ArrayCommons.printArray(orderedArray);
        System.out.println("\nNon-duplicated numbers: " + ex1.removeDuplicates(orderedArray));
    }
}