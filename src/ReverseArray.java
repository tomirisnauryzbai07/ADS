import java.util.Scanner;

public class ReverseArray {
    public static void printReverse(int[] arr, int n) {
        if (n == 0) return;
        System.out.print(arr[n - 1] + " ");
        printReverse(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        printReverse(arr, n);
    }
}
