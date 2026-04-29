import java.util.Scanner;

public class Task4ShippingCapacity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        int days = scanner.nextInt();

        System.out.println(minCapacity(weights, days));
    }

    public static int minCapacity(int[] weights, int days) {
        int left = 0, right = 0;

        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }

        while (left < right) {
            int mid = (left + right) / 2;

            if (canShip(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static boolean canShip(int[] weights, int days, int capacity) {
        int current = 0;
        int usedDays = 1;

        for (int w : weights) {
            if (current + w > capacity) {
                usedDays++;
                current = 0;
            }
            current += w;
        }

        return usedDays <= days;
    }
}
