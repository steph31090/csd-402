/*
Stephanie Ramos
September 28, 2025
Module 10 Programming Assignment

The purpose of this program is to define an abstract base class for company divisions with common fields and an abstract display method.
*/

public abstract class Division {
    // Fields for a company's division name and account number
    protected String divisionName;
    protected int accountNumber;

    //Constructor requiring both fields
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to be defined in subclass
    public abstract void display();
}