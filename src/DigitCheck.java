import java.util.Scanner;

public class DigitCheck {
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.next();
        scanner.close();

        System.out.println(s + " is " + (isAllDigits(s, 0) ? "all digits" : "not all digits"));
    }
}

