import java.util.Scanner;
import java.util.regex.Pattern;

public class SafeInput {

    /**
     * Gets a non-zero-length string from the user.
     * @param pipe Scanner object to read input.
     * @param prompt Message to display as the prompt.
     * @return A string that is not empty.
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString;
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.trim().length() == 0);
        return retString;
    }

    /**
     * Gets an integer from the user.
     * @param pipe Scanner object to read input.
     * @param prompt Message to display as the prompt.
     * @return An integer value.
     */
    public static int getInt(Scanner pipe, String prompt) {
        int number;
        while (true) {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                number = pipe.nextInt();
                pipe.nextLine();  // Consume newline
                return number;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.next();  // Consume invalid input
            }
        }
    }

    /**
     * Gets a double from the user.
     * @param pipe Scanner object to read input.
     * @param prompt Message to display as the prompt.
     * @return A double value.
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double number;
        while (true) {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                number = pipe.nextDouble();
                pipe.nextLine();  // Consume newline
                return number;
            } else {
                System.out.println("Invalid input. Please enter a valid double.");
                pipe.next();  // Consume invalid input
            }
        }
    }

    /**
     * Gets an integer within a specified range.
     * @param pipe Scanner object to read input.
     * @param prompt Message to display as the prompt.
     * @param low The lower bound (inclusive).
     * @param high The upper bound (inclusive).
     * @return An integer within the range.
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int number;
        while (true) {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                number = pipe.nextInt();
                pipe.nextLine();  // Consume newline
                if (number >= low && number <= high) {
                    return number;
                } else {
                    System.out.println("Number out of range. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                pipe.next();  // Consume invalid input
            }
        }
    }

    /**
     * Gets a double within a specified range.
     * @param pipe Scanner object to read input.
     * @param prompt Message to display as the prompt.
     * @param low The lower bound (inclusive).
     * @param high The upper bound (inclusive).
     * @return A double within the range.
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double number;
        while (true) {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                number = pipe.nextDouble();
                pipe.nextLine();  // Consume newline
                if (number >= low && number <= high) {
                    return number;
                } else {
                    System.out.println("Number out of range. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid double.");
                pipe.next();  // Consume invalid input
            }
        }
    }

    /**
     * Gets a yes/no confirmation from the user.
     * @param pipe Scanner object to read input.
     * @param prompt Message to display as the prompt.
     * @return True if user enters Y/y, False if N/n.
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;
        while (true) {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine().trim().toUpperCase();
            if (response.equals("Y")) {
                return true;
            } else if (response.equals("N")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    /**
     * Gets a string input that matches a given regex pattern.
     * @param pipe Scanner object to read input.
     * @param prompt Message to display as the prompt.
     * @param regEx The regex pattern to match.
     * @return A valid string matching the regex pattern.
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;
        while (true) {
            System.out.print("\n" + prompt + ": ");
            input = pipe.nextLine();
            if (Pattern.matches(regEx, input)) {
                return input;
            } else {
                System.out.println("Invalid input. Does not match required pattern.");
            }
        }
    }

    /**
     * Prints a formatted header with a centered message.
     * @param msg The message to display.
     */
    public static void prettyHeader(String msg) {
        int width = 60;
        int padding = (width - msg.length() - 6) / 2; // 6 spaces for "***   ***"
        String border = "*".repeat(width);

        System.out.println(border);
        System.out.println("***" + " ".repeat(padding) + msg + " ".repeat(padding) + "***");
        System.out.println(border);
    }
}
