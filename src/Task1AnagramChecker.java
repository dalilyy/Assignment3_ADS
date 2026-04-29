import java.util.Arrays;
import java.util.Scanner;

public class Task1AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        if (areAnagrams(first, second)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean areAnagrams(String first, String second) {
        char[] a = first.toLowerCase().toCharArray();
        char[] b = second.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}