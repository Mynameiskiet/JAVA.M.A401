package fa.training.utils;

/**
 * Utility class for input validation.
 */
public class Validator {
    /**
     * Validates if a string is non-null and non-empty.
     * @param str The string to validate
     * @return true if valid, false otherwise
     */
    public static boolean isValidString(String str) {
        return str != null && !str.trim().isEmpty();
    }

    /**
     * Validates if a number is positive.
     * @param value The number to validate
     * @return true if positive, false otherwise
     */
    public static boolean isValidPositiveNumber(double value) {
        return value > 0;
    }
}