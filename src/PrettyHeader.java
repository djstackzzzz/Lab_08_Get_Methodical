import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = SafeInput.getNonZeroLenString(in, "Enter the message for the header");
        SafeInput.prettyHeader(message);
    }
}
