/*Stephanie Ramos
 * September 14, 2025
 * Module 7 Assignment
 */

// The purpose of this program is to create a Fan class with specified attributes and methods, and to test its functionality.
// Updated with 'this' references to be used in UseFans.java

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
        return this.speed;
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
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
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
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    private String speedLabel() {
    return switch (this.speed) {
        case SLOW -> "SLOW";
        case MEDIUM -> "MEDIUM";
        case FAST -> "FAST";
        default -> "STOPPED";
    };
}

    @Override
    public String toString() {
        if (this.on) {
            return "Fan is ON\n" +
                   "Speed: " + this.speedLabel() + "\n" +
                   "Radius: " + this.radius + "\n" +
                   "Color: " + this.color;
        } else {
            return "Fan is OFF\n" +
                   "Radius: " + this.radius + "\n" +
                   "Color: " + this.color;
        }
    }
}
