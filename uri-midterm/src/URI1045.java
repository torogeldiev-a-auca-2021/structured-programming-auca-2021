import java.util.Scanner;

public class URI1045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a1 = input.nextDouble();
        double b1 = input.nextDouble();
        double c1 = input.nextDouble();
        double a = Math.max(Math.max(a1, b1), c1);
        double c = Math.min(Math.min(c1, b1), a1);
        double b = a1 + b1 + c1 - a - c;

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (a * a > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (a * a < b * b + c * c) {
                System.out.println("TRIANGULO ACUTANGULO");

            }
            if ((a == b && b != c) || (b == c && c != a) || (c == a && c != b)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
        }
    }
}

