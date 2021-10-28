import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        double y = input.nextDouble();
        double spent = 12;

        double liters = y / spent * x;

        System.out.printf("%.3f\n", liters);




    }
}
