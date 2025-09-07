/*Stephanie Ramos
 * September 7, 2025
 * Module 6 Assignment
 */

// The purpose of this program is to create a Fan class with specified attributes and methods, and to test its functionality.

public class Fan {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        setSpeed(speed);
        setOn(on);
        setRadius(radius);
        setColor(color);
    }

    // Getter and Setter methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed value. Setting to STOPPED.");
            this.speed = STOPPED;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive. Setting to default (6.0).");
            this.radius = 6.0;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    private String speedLabel() {
    return switch (speed) {
        case SLOW -> "SLOW";
        case MEDIUM -> "MEDIUM";
        case FAST -> "FAST";
        default -> "STOPPED";
    };
}

    @Override
    public String toString() {
        if (on) {
            return "Fan is ON\n" +
                   "Speed: " + speedLabel() + "\n" +
                   "Radius: " + radius + "\n" +
                   "Color: " + color;
        } else {
            return "Fan is OFF\n" +
                   "Radius: " + radius + "\n" +
                   "Color: " + color;
        }
    }
}

// Test code
class FanTest {
    public static void main(String[] args) {
        // Create a Fan object using the default constructor
        Fan fan1 = new Fan();
        System.out.println("Fan 1 (default constructor):");
        System.out.println(fan1.toString());

        // Create a Fan object using the argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10.0, "blue");
        System.out.println("\nFan 2 (argument constructor):");
        System.out.println(fan2.toString());

        // Modify fan1's attributes using setter methods
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(8.0);
        fan1.setColor("red");
        System.out.println("\nFan 1 (after modifications):");
        System.out.println(fan1.toString());
    }
}