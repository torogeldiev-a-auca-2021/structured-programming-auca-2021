import java.util.Scanner;

public class URI1012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double triangle = (a * c) / 2;
        double circle  = (3.14159 * c * c);
        double trapezium = ((a + b) / 2 ) * c;
        double square = b * b;
        double rectangle = a * b;

        System.out.printf("TRIANGULO: %.3f\n", triangle);
        System.out.printf("CIRCULO: %.3f\n", circle);
        System.out.printf("TRAPEZIO: %.3f\n", trapezium);
        System.out.printf("QUADRADO: %.3f\n", square);
        System.out.printf("RETANGULO: %.3f\n",rectangle);

    }
}
