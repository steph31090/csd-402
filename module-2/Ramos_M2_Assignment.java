/*
 * Stephanie Ramos
 * August 24, 2025
 * Module: Rock-Paper-Scissors Program
 *
 * This program simulates the game Rock-Paper-Scissors.
 */

 // Import necessary classes
import java.util.Random;
import java.util.Scanner;

// Main class
public class Ramos_M2_Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Computer randomly chooses between 1 and 3
        int computerChoice = random.nextInt(3) + 1;

        // Prompt user for input
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Enter your selection: 1 = Rock, 2 = Paper, 3 = Scissors");

        // Read and validate the user's choice
        int userChoice = readChoice(scanner);

        // Display choices
        System.out.println("Computer chose: " + choiceToString(computerChoice));
        System.out.println("You chose: " + choiceToString(userChoice));

        // Determine and display the result
        String result = determineWinner(userChoice, computerChoice);
        System.out.println("Result: " + result);

        scanner.close();
    }

    // Method to read and validate user input
    private static int readChoice(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int val = scanner.nextInt();
                if (val >= 1 && val <= 3) {
                    return val;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid input. Please enter 1, 2, or 3:");
        }
    }

    // Method to convert choice number to string
    private static String choiceToString(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid";
        }
    }

    // Method to determine the winner
    private static String determineWinner(int user, int computer) {
        if (user == computer) {
            return "It's a tie!";
        } else if ((user == 1 && computer == 3) ||
                   (user == 2 && computer == 1) ||
                   (user == 3 && computer == 2)) {
            return "You win!";
        } else {
            return "You lost!";
        }
    }
}
