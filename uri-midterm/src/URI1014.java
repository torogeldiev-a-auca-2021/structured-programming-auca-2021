import java.util.Scanner;
public class URI1014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        double y = input.nextDouble();

        double average = x / y;

        System.out.printf("%.3f km/l\n", average);




    }
}
