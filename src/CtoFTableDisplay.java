public class CtoFTableDisplay {
    /**
     * Converts Celsius to Fahrenheit.
     * @param celsius Temperature in Celsius.
     * @return Equivalent temperature in Fahrenheit.
     */
    public static double CtoF(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        System.out.println("Celsius to Fahrenheit Conversion Table");
        System.out.println("--------------------------------------");
        System.out.printf("%-10s %-10s%n", "Celsius", "Fahrenheit");

        for (int c = -100; c <= 100; c++) {
            System.out.printf("%-10d %-10.2f%n", c, CtoF(c));
        }
    }
}
