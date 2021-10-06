import java.util.Scanner;

public class URI1002 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        final double PI = 3.14159;

        double r = inp.nextDouble();
        double a = PI * r * r;

        System.out.printf("A=%.4f%n", a);
    }
}
