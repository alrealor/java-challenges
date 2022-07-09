package com.arao.challenges.leetcode.arrays;

import java.io.Serializable;
import java.util.Scanner;

public class ArraysMainExecutor implements Serializable {

    public static void main(String... args) {

        System.out.print("Array Menu Options" +
                "\n 1 - Remove duplicates from sorted array (Excercise1)" +
                "\n 2 - Best time to buy and sell [Excercise2]" +
                "\n 3 - Rotate array [Excercise3]" +
                "\n 4 - Contain duplicate [Excercise4]" +
                "\n 5 - Single number [Excercise5]" +
                "\n 6 - Intersection of two arrays [Excercise6]" +
                "\n 7 - Plus one [Excercise7]" +
                "\n 8 - Move Zeroes [Excercise8]" +
                "\n 9 - Two Sum [Excercise9]" +
                "\n 10 - Valid Sudoku [Excercise10]" +
                "\n 11 - Rotate image [Excercise11]" +
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
            case 10 -> validSudoku();
            case 11 -> rotateImage();
            default -> System.out.println("Invalid option, exit");
        }
    }

    /**/
    private static void validSudoku(){
        Excercise10 ex10 = new Excercise10();
        char[][] matrix1 = new char[][] {{'5','3','.','.','7','.','.','.','.'}
                                        ,{'6','.','.','1','9','5','.','.','.'}
                                        ,{'.','9','8','.','.','.','.','6','.'}
                                        ,{'8','.','.','.','6','.','.','.','3'}
                                        ,{'4','.','.','8','.','3','.','.','1'}
                                        ,{'7','.','.','.','2','.','.','.','6'}
                                        ,{'.','6','.','.','.','.','2','8','.'}
                                        ,{'.','.','.','4','1','9','.','.','5'}
                                        ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.print("\nSudoku is " + (ex10.isValidSudoku(matrix1) ? "valid" : "invalid"));
        ArrayCommons.printMatrix(matrix1);
        System.out.print("Expected output: Sudoku is valid");

        // invalid sudoku
        char[][] matrix2 = new char[][] {{'8','3','.','.','7','.','.','.','.'}
                                        ,{'6','.','.','1','9','5','.','.','.'}
                                        ,{'.','9','8','.','.','.','.','6','.'}
                                        ,{'8','.','.','.','6','.','.','.','3'}
                                        ,{'4','.','.','8','.','3','.','.','1'}
                                        ,{'7','.','.','.','2','.','.','.','6'}
                                        ,{'.','6','.','.','.','.','2','8','.'}
                                        ,{'.','.','.','4','1','9','.','.','5'}
                                        ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.print("\n\nSudoku is " + (ex10.isValidSudoku(matrix2) ? "valid" : "invalid"));
        ArrayCommons.printMatrix(matrix2);
        System.out.print("Expected output: Sudoku is invalid");
    }

    /**/
    private static void rotateImage(){
        Excercise11 ex11 = new Excercise11();
        int[][] matrix = new int[][] {{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}};
        int[][] expected = new int[][] {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};
        System.out.print("Original matrix: ");
        ArrayCommons.printMatrix(matrix);
        System.out.print("\nMatrix rotated at right: ");
        ArrayCommons.printMatrix(ex11.rotate(matrix));
        System.out.print("\nExpected output: ");
        ArrayCommons.printMatrix(expected);
    }

    /**/
    private static void twoSum(){
        Excercise9 ex9 = new Excercise9();
        int[] array = new int[] {0,-3,1,8,3};
        int target = 0;
        int[] expected = new int[] {1, 4};
        System.out.print("Original array: ");
        ArrayCommons.printArray(array);
        System.out.print("\nTarget: " + target);
        System.out.print("\nResult array: ");
        ArrayCommons.printArray(ex9.twoSum1(array, target));
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
        int[] orderedArray = new int[] {1,1,1,3,4,5,5,6,7,7,8,9,10};
        System.out.print("Original array: ");
        ArrayCommons.printArray(orderedArray);
        System.out.println("\nTotal elements without duplicates: " + ex1.removeDuplicates(orderedArray));
    }
}
