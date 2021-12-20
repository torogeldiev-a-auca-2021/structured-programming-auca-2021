import java.util.Scanner;

public class URI1135 {//1116

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double x, y;
        double div;

        for (int i = 0; i < n; i++) {
            x = input.nextDouble();
            y = input.nextDouble();
            div = x / y;
            System.out.printf("%.1f", div);
            if (y == 0) {
                System.out.println(" divisao impossivel");


            }


        }


    }
}



