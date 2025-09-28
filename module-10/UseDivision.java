/*
Stephanie Ramos
September 28, 2025
Module 10 Programming Assignment

The purpose of this program is to create and display information for both domestic and international divisions. 
*/

public class UseDivision {
    public static void main(String[] args) {
        // Create two InternationalDivision instances
        InternationalDivision intl1 = new InternationalDivision("Tech Inc", 2212, "Mexico", "Spanish");
        InternationalDivision intl2 = new InternationalDivision("Starlight", 2215, "Japan", "Japanese");

        // Create two DomesticDivision instances
        DomesticDivision dom1 = new DomesticDivision("Haven Tech", 15521, "Arizona");
        DomesticDivision dom2 = new DomesticDivision("Global", 15535, "California");

        // Display divisions
        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}