import java.util.Arrays;
import java.util.Scanner;

public class Task2KthSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        Arrays.sort(arr);
        System.out.println(arr[k - 1]);
    }
}
