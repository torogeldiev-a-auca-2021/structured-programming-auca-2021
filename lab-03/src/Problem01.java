import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("some real name? ");
        double num = input.nextDouble();

        double r = num;
        if (r < 0) {
            r = -r;
        }
        System.out.printf("|%.4f| = %.4f%n", num, r);
    }
}