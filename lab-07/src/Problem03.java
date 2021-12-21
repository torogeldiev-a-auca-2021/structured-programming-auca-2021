import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int x = sc.nextInt();
        int[] n = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter element " + i + ": ");
            n[i] = sc.nextInt();
        }
        printArray(n);
        reverseArray(n);
        printArray(n);

    }

    private static void reverseArray(int[] v) {
        for (int left = 0, right = v.length - 1; left < right; ++left, --right) {
            int t = v[left]; // t = a
            v[left] = v[right]; // a = b
            v[right] = t; // b = t
        }
    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            System.out.print(  a[i] + " ");
        }

        System.out.print("Before reversing: ");

    }
}
