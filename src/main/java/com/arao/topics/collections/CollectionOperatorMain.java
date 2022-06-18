package com.arao.topics.collections;

import java.util.Arrays;
import java.util.List;

public class CollectionOperatorMain {

    public static void main(String... args) {
        // Sort collections example
        operateCollections();
    }

    /**
     * Sort collections example
     */
    private static void operateCollections() {
        System.out.println("\n----------------------------------- COLLECTIONS OPERATIONS -----------------------------------");
        // Original collections
        List<Integer> intList = Arrays.asList(8, 24, 2, 59, 320, 591, 2, 8, 2);
        List<String> strList = Arrays.asList("Tree", "Zoo", "House", "Duck", "Yambak", "Picture", "Tree");
        List<Character> charList = Arrays.asList('A', 'B', 'C', 'A', 'Y', 'Z', 'A');

        // ----------------------------------------- INTEGERS -----------------------------------------
        // Display original Integer array
        System.out.println("Original INTEGER Collection");
        intList.forEach(e -> System.out.print(e + ", "));

        // Display ascending sort
        System.out.println("\nAscending sort: ");
        CollectionOperation.sortAscendingInt(intList).forEach(e -> System.out.print(e + ", "));

        // Display descending sort
        System.out.println("\nDescending sort: ");
        CollectionOperation.sortDescendingInt(intList).forEach(e -> System.out.print(e + ", "));

        // Display min and max values
        System.out.println("\nMin - Max: ");
        System.out.print(CollectionOperation.findMinimumInt(intList) + " - " + CollectionOperation.findMaximumInt(intList));

        // Show duplicates if exists
        System.out.println("\nDuplicates: ");
        CollectionOperation.findDuplicatesGeneric(intList).entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

        // Remove duplicates for Integer array
        System.out.println("Remove duplicates over sort: ");
        CollectionOperation.removeDuplicatesGeneric(intList).forEach(e -> System.out.print(e + ", "));

        System.out.println("\n");

        // ----------------------------------------- STRINGS -----------------------------------------
        // Display original String array
        System.out.println("Original STRING Collection");
        strList.forEach(e -> System.out.print(e + ", "));

        // Display ascending sort
        System.out.println("\nAscending sort: ");
        CollectionOperation.sortAscendingGeneric(strList).forEach(e -> System.out.print(e + ", "));

        // Display descending sort
        System.out.println("\nDescending sort: ");
        CollectionOperation.sortDescendingGeneric(strList).forEach(e -> System.out.print(e + ", "));

        // Display min and max values
        System.out.println("\nMin - Max: ");
        System.out.print(CollectionOperation.findMinimumGeneric(strList) + " - " + CollectionOperation.findMaximumGeneric(strList));

        // Show duplicates if exists
        System.out.println("\nDuplicates: ");
        CollectionOperation.findDuplicatesGeneric(strList).entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

        // Remove duplicates for Integer array
        System.out.println("Remove duplicates over sort: ");
        CollectionOperation.removeDuplicatesGeneric(strList).forEach(e -> System.out.print(e + ", "));

        System.out.println("\n");

        // ----------------------------------------- CHARACTER -----------------------------------------
        // Display original String array
        System.out.println("Original CHARACTER Collection");
        charList.forEach(e -> System.out.print(e + ", "));

        // Display ascending sort
        System.out.println("\nAscending sort: ");
        CollectionOperation.sortAscendingGeneric(charList).forEach(e -> System.out.print(e + ", "));

        // Display descending sort
        System.out.println("\nDescending sort: ");
        CollectionOperation.sortDescendingGeneric(charList).forEach(e -> System.out.print(e + ", "));

        // Display min and max values
        System.out.println("\nMin - Max: ");
        System.out.print(CollectionOperation.findMinimumGeneric(charList) + " - " + CollectionOperation.findMaximumGeneric(charList));

        // Show duplicates if exists
        System.out.println("\nDuplicates: ");
        CollectionOperation.findDuplicatesGeneric(charList).entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

        // Remove duplicates for Integer array
        System.out.println("Remove duplicates over sort: ");
        CollectionOperation.removeDuplicatesGeneric(charList).forEach(e -> System.out.print(e + ", "));
    }

}
