import java.util.Scanner;

public class URI1079 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double average;
        double a1 , b1 , c1;
        for (int i = 1; i <= n; i++) {
                 a1 = input.nextDouble();
                 b1 = input.nextDouble();
                 c1 = input.nextDouble();
                average = (a1 * 2 + b1 * 3 + c1 * 5) / 10;
                System.out.printf("%.1f\n" , average);

            }
        }
    }
