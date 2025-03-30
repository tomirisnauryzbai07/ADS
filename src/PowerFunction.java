import java.util.Scanner;

public class PowerFunction {
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(power(a, n));
    }
}
