import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0) return 1; // Базовый случай: 0! = 1
        return n * factorial(n - 1); // Рекурсивный случай
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(n + "! = " + factorial(n));
    }
}
