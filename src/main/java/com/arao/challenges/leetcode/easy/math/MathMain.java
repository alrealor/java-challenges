package com.arao.challenges.leetcode.easy.math;

import java.util.Scanner;

public class MathMain {

    public static void main(String[] args) {
        System.out.print("Math Menu: \n" +
                " 1. FizzBuzz (Excercise1) \n" +
                "Select your option: ");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        // send specific method based on the option
        switch (option) {
            case 1 -> fizzBuzz();
        }
    }

    static void fizzBuzz() {
        Excercise1 ex1 = new Excercise1();
        System.out.println("x = 15");
        System.out.println("Expected output: 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz");
        System.out.print("Result output:   ");
        ex1.fizzBuzz(15).forEach(x -> System.out.print(x + ", "));
    }
}
