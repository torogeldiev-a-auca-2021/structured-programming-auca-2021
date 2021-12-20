import java.util.Scanner;

public class URI1136 {//1117

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = 10;
        double  y = 10;
        double media = 0;
        for (int i = 1; i < x; i++) {
            x = input.nextDouble();
            for (int j = 1; j < y; j++) {
                y = input.nextDouble();
                if (x < 0 && x > 10 || y < 0 && y > 10) {
                    System.out.println("nota invalida");

                }
            }
            media = x / y;
            System.out.printf("media = %.2f", media);

        }
    }
}