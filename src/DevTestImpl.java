import java.util.Scanner;

class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        // Test getInt
        int number = SafeInput.getInt(in, "Enter an integer");
        System.out.println("You entered: " + number);

        // Test getDouble
        double dbl = SafeInput.getDouble(in, "Enter a double");
        System.out.println("You entered: " + dbl);

        // Test getRangedInt
        int rangedNum = SafeInput.getRangedInt(in, "Enter an integer", 1, 10);
        System.out.println("You entered: " + rangedNum);

        // Test getRangedDouble
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double", 1.5, 9.5);
        System.out.println("You entered: " + rangedDouble);

        // Test getYNConfirm
        boolean confirm = SafeInput.getYNConfirm(in, "Do you want to continue?");
        System.out.println("You chose: " + (confirm ? "Yes" : "No"));

        // Test getRegExString
        String ssn = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Valid SSN: " + ssn);

        // Test prettyHeader
        SafeInput.prettyHeader("Test Message");
    }

    public static class BirthDateTime {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
            int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

            int day;
            switch (month) {
                case 2:  // February
                    day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 29);
                    break;
                case 4: case 6: case 9: case 11:  // April, June, September, November
                    day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
                    break;
                default:  // January, March, May, July, August, October, December
                    day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
            }

            int hours = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
            int minutes = SafeInput.getRangedInt(in, "Enter your birth minute", 0, 59);

            System.out.println("\nYou were born on: " + year + "-" + month + "-" + day + " at " + hours + ":" + minutes);
        }
    }
}
