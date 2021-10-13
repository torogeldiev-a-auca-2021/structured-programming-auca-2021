import java.util.Scanner;

public class URI1006 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        double average = ((a * 2) + ( b * 3 ) + ( c * 5)) / 10;

        System.out.printf("MEDIA = %.1f%n", average);

    }
}
