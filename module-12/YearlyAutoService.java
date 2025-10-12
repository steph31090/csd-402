/*
Stephanie Ramos
October 12, 2025
Module 12 Programming Assignment

The purpose of this program is to calculate the cost of a yearly auto service visit using method overloading.
*/

public class YearlyAutoService {

    // no parameters
    public static double yearlyService() {
        double standardService = 125.0; // standard service charge
        return standardService;
    }

    // one parameter: added oil change
    public static double yearlyService(double oilChange) {
        double standardService = 125.0;
        return standardService + oilChange;
    }

    // two parameters: added oil change and tire rotation
    public static double yearlyService(double oilChange, double tireRotation) {
        double standardService = 125.0;
        return standardService + oilChange + tireRotation;
    }

    // three parameters: added oil change, tire rotation, and coupon
    public static double yearlyService(double oilChange, double tireRotation, double coupon) {
        double standardService = 125.0;
        return standardService + oilChange + tireRotation - coupon;
    }

    // main method - test each method twice
    public static void main(String[] args) {
        System.out.println("No Parameters Test 1: $" + yearlyService());
        System.out.println("No Parameters Test 2: $" + yearlyService());

        System.out.println("One Parameter Test 1: $" + yearlyService(35.0));
        System.out.println("One Parameter Test 2: $" + yearlyService(35.0));

        System.out.println("Two Parameters Test 1: $" + yearlyService(35.0, 20.0));
        System.out.println("Two Parameters Test 2: $" + yearlyService(35.0, 20.0));

        System.out.println("Three Parameters Test 1: $" + yearlyService(35.0, 20.0, 5.0));
        System.out.println("Three Parameters Test 2: $" + yearlyService(35.0, 20.0, 5.0));
    }
}
