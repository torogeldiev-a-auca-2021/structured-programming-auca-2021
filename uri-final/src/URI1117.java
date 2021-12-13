import java.util.*;

public class URI1117 {

    public static void main(String[] args) {
        double a, b, sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; ) {
            a = input.nextDouble();
            if ((a >= 0 && a <= 10.0)) {
                sum += a;
                i++;

            } else {
                System.out.println("nota invalida");
            }
            if (i == 3) {
                b = (sum) / 2;
                System.out.printf("media = %.2f\n", b);
            }
        }
    }
}

