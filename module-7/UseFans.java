/*Stephanie Ramos
 * September 14, 2025
 * Module 7 Assignment
 */

 // The purpose of this program is to create a UseFans class to test the Fan class functionality by creating and displaying multiple Fan instances.
 
import java.util.ArrayList;
import java.util.List;

public class UseFans {

    // Display a single Fan (without using toString)
    public static void displayFan(Fan f) {
        String onOff = f.isOn() ? "ON" : "OFF";
        String speedWord = switch (f.getSpeed()) {
            case Fan.SLOW -> "SLOW";
            case Fan.MEDIUM -> "MEDIUM";
            case Fan.FAST -> "FAST";
            default -> "STOPPED";
        };

        System.out.println("Fan is " + onOff);
        if (f.isOn()) {
            System.out.println("Speed: " + speedWord);
        }
        System.out.println("Radius: " + f.getRadius());
        System.out.println("Color: " + f.getColor());
    }

    // Display a collection of Fans (without using toString)
    public static void displayFans(List<Fan> fans) {
        int index = 1;
        for (Fan f : fans) {
            System.out.println("\nFan " + index + ":");
            displayFan(f);
            index++;
        }
    }

    public static void main(String[] args) {
    // Create a collection of Fan instances
    List<Fan> fans = new ArrayList<>();
    fans.add(new Fan());                               // default
    fans.add(new Fan(Fan.FAST, true, 10.0, "green"));  // custom
    fans.add(new Fan(Fan.SLOW, false, 8.0, "yellow")); // another

    // Display all fans initially
    System.out.println("Initial Fan States:");
    displayFans(fans);

    // Modify each fan to show functionality
    for (Fan f : fans) {
        f.setOn(true);  // turn all on
        if (f.getSpeed() == Fan.STOPPED) {
            f.setSpeed(Fan.MEDIUM);
        }
        f.setRadius(f.getRadius() + 1.0);
        f.setColor(f.getColor() + " updated");
    }

    // Display all fans after modifications
    System.out.println("\nModified Fan States:");
    displayFans(fans);

    // Explicitly show one fan (single-instance display)
    System.out.println("\nDetails of the second fan:");
    displayFan(fans.get(1));

    }
}