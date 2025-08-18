/*
 * Stephanie Ramos
 * August 17, 2025
 * Module 1: Programming Assignment
 * 
 * The purpose of this program is to calculate the energy needed to heat water from an initial temperature to a final temperature.
 */

import java.util.Scanner;

public class Ramos_M1_Programming_Assignment {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Prompt user for water mass
            System.out.print("Enter the mass of water in kilograms: ");
            double waterMass = input.nextDouble();

            // Prompt user for initial temperature
            System.out.print("Enter the initial temperature of the water in degrees Celsius: ");
            double initialTemp = input.nextDouble();

            // Prompt user for final temperature
            System.out.print("Enter the final temperature of the water in degrees Celsius: ");
            double finalTemp = input.nextDouble();

            // Calculate the amount of energy
            double energy = waterMass * (finalTemp - initialTemp) * 4184;

            // Display the result
            System.out.printf("The energy needed to heat the water is: %.2f Joules%n", energy);
        }
    }
}