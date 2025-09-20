/*
 * Stephanie Ramos
 * September 19, 2025
 * M8: Programming Assignment
 * 
 * This program stores integers from user input in an ArrayList and displays the largest value.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StephanieArrayListTest {

    // Method to return the largest value
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer largest = list.get(0);
        for (Integer num : list) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (0 to stop):");
        while (true) {
            int value = input.nextInt();
            numbers.add(value);
            if (value == 0) {
                break;
            }
        }

        Integer largestValue = max(numbers);
        System.out.println("The largest value is: " + largestValue);
    }
}
