package com.arao.challenges.leetcode.linkedlist;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.print("LinkedList Menu: \n" +
                "1. Add two Numbers (Excercise1) \n\n" +
                "Type your option: ");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        switch(option) {
            case 1 -> addTwoNumbers();
            default -> System.out.println("Exit due to invalid option");
        }
    }

    // Add two numbers for linked list
    // l1 = [2,4,3]
    // l2 = [5,6,4]
    private static void addTwoNumbers() {
        Exercise1 ex1 = new Exercise1();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.print("L1 = ");
        LinkedListUtils.printListNode(l1);
        System.out.println("");
        System.out.print("L2 = ");
        LinkedListUtils.printListNode(l2);
        System.out.println("");
        System.out.println("Expected output = [7,0,8]");
        System.out.print("Result output   = ");
        LinkedListUtils.printListNode(ex1.addTwoNumbers(l1, l2));

        System.out.print("\n\n");
        l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,  new ListNode(9, new ListNode(9)))))));
        l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        System.out.print("L1 = ");
        LinkedListUtils.printListNode(l1);
        System.out.println("");
        System.out.print("L2 = ");
        LinkedListUtils.printListNode(l2);
        System.out.println("");
        System.out.println("Expected output = [8,9,9,9,0,0,0,1]");
        System.out.print("Result output   = ");
        LinkedListUtils.printListNode(ex1.addTwoNumbers(l1, l2));
    }
}
