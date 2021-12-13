import java.util.*;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        displayPattern(n);
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {

            for (int o = 1; o <= (n - i); o++) {

                int numberOfDigit = 0;
                int r = n - (o - 1);
                while (r != 0) {
                    numberOfDigit++;
                    r /= 10;
                }
                for (int k = -1; k < numberOfDigit; k++) {
                    System.out.print(" ");
                }
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}