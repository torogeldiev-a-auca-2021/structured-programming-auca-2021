import java.util.Scanner;

public class URI1079 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int a, b, c;
            double average;
            int k = input.nextInt();
            for (int i = 1; i <= k; i++) {
                double a1 = input.nextDouble();
                double b2 = input.nextDouble();
                double c2 = input.nextDouble();
                average= (a1 * 2 + b2 * 3 +c2 * 5) / 10;
                System.out.printf("%.1f\n", average);
            }
        }
    }

