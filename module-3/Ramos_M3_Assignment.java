/*
 * Stephanie Ramos
 * August 25, 2025
 * Module 3: Programming Assignment
 *
 * This program prints a pyramid of numbers with an "@" aligned on the right.
 */

 // Importing necessary libraries
public class Ramos_M3_Assignment {
    public static void main(String[] args) {
        int rows = 7;
        int width = 4; 
        int maxNumbers = rows * 2 - 1; 
        int totalWidth = maxNumbers * width + 3; 

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            for (int s = 0; s < rows - i; s++) {
                System.out.printf("%" + width + "s", "");
            }

            // Print left side numbers
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.printf("%" + width + "d", num);
                num *= 2;
            }

            // Print right side numbers
            num /= 4; 
            for (int j = 1; j < i; j++) {
                System.out.printf("%" + width + "d", num);
                num /= 2;
            }

            // Calculate and print spaces before @
            int currentLength = (rows - i) * width + (2 * i - 1) * width;
            int spacesNeeded = totalWidth - currentLength;
            System.out.printf("%" + spacesNeeded + "s", "");

            // Print @
            System.out.print("@");
            System.out.println();
        }
    }
}