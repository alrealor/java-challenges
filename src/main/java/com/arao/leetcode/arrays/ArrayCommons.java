package com.arao.leetcode.arrays;

public class ArrayCommons {

    public static void printArray(int[] nums) {
        System.out.print("[");
        for(int x=0; x<nums.length; x++) {
            System.out.print(x != nums.length-1 ? nums[x] + "," : nums[x]);
        }
        System.out.print("]");
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("");
        // loop the matrix rows
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print("  " + matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
