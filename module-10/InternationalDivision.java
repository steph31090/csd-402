/*
Stephanie Ramos
September 28, 2025
Module 10 Programming Assignment

The purpose of this program is to represent an international division with additional fields for country and language.
*/

public class InternationalDivision extends Division {
    // Additional fields for international divisions
    private String country;
    private String language;

    // Constructor requiring all fields
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber); // Calls superclass constructor
        this.country = country;
        this.language = language;
    }

    // Implementation of the abstract display() method
    @Override
    public void display() {
        System.out.println("International Division: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println(); 
    }
}