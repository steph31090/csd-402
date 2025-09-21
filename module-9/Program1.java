/*
 * Stephanie Ramos
 * September 19, 2025
 * M8: Programming Assignment
 * 
 * This program demonstrates the use of an ArrayList to store strings and retrieve an element by user-specified index.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        // ArrayList with at least 10 Strings
        ArrayList<String> places = new ArrayList<>();
        places.add("New York");
        places.add("Los Angeles");
        places.add("Chicago");
        places.add("Houston");
        places.add("Miami");
        places.add("Dallas");
        places.add("San Francisco");
        places.add("Seattle");
        places.add("Boston");
        places.add("Las Vegas");

        // Use a for-each loop to print the ArrayList
        for (String place : places) {
            System.out.println(place);
        }

        // Ask the user which element they want to see again
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of the element to see again (0-" + (places.size() - 1) + "): ");
        String input = sc.nextLine(); // user String input

        try {
            // Autoboxing: converting String to Integer object
            Integer boxedIndex = Integer.valueOf(input.trim());

            // Auto-unboxing: Integer object to primitive int
            int index = boxedIndex;

            // Attempt to print the chosen element
            System.out.println("Element: " + places.get(index));
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            // If input is invalid, display exception message
            System.out.println("Out of Bounds");
        }
    }
}
