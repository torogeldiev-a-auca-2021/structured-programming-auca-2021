import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();

        double formula = a * (b - b / 3 + b / 5 - b / 7 + b / 9 - b / 11);
        double sum = a * (b - b / 3 + b / 5 - b / 7 + b / 9 - b / 11 + b / 13);

        System.out.printf("%.1f ",formula);
        System.out.printf("%.1f",sum);

    }
}
