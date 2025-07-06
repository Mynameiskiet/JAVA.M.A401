package fa.training.entities;

import fa.training.utils.Validator;

import java.util.Scanner;

/**
 * Abstract class representing a multimedia item with name and duration.
 */
public abstract class Multimedia {
    private String name; // Name of the multimedia item
    private double duration; // Duration in minutes

    /**
     * Constructor to initialize name and duration.
     * @param name The name of the multimedia item
     * @param duration The duration in minutes
     */
    public Multimedia(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    /**
     * Default constructor.
     */
    public Multimedia() {
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * Method to input multimedia attributes from keyboard.
     * Uses Validator to ensure valid input with while (true) loop.
     */
    public void createMultimedia() {
        Scanner scanner = new Scanner(System.in);
        // Input name
        while (true) {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            if (Validator.isValidString(name)) {
                break;
            }
            System.out.println("Name cannot be empty!");
        }

        // Input duration
        while (true) {
            System.out.print("Enter duration (minutes): ");
            try {
                duration = Double.parseDouble(scanner.nextLine());
                if (Validator.isValidPositiveNumber(duration)) {
                    break;
                }
                System.out.println("Duration must be positive!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }

    /**
     * Abstract toString method to be overridden by subclasses.
     * @return String representation of the multimedia item
     */
    @Override
    public abstract String toString();
}