import java.util.Scanner;

public class URI1116 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        for (int k = 1; k <= p; k++) {
            double resoltOfDivision;
            int x = input.nextInt();
            int y = input.nextInt();
            if (y != 0) {
                resoltOfDivision = (double) x / y;
                System.out.printf("%.1f\n", resoltOfDivision);
            } else {
                System.out.println("divisao impossivel");
            }

        }
    }
}