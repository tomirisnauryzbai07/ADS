import java.util.Scanner;

public class AverageElement {
    public static double findSum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + findSum(arr, n - 1);
    }

    public static double findAverage(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return findSum(arr, n) / n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println(findAverage(arr, n));
    }
}
