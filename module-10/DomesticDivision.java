
/*
Stephanie Ramos
September 28, 2025
Module 10 Programming Assignment

The purpose of this program is to represent a domestic division with an additional field for the state.
*/
public class DomesticDivision extends Division {
    // Additional field for domestic divisions
    private String state;

    // Constructor requiring all fields
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber); // calls superclass constructor
        this.state = state;
    }

    // Implementation of the abstract display() method
    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}