import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int code1 = input.nextInt();
        int num_units1 = input.nextInt();
        double price1 = input.nextDouble();

        int code2 = input.nextInt();
        int num_units2 = input.nextInt();
        double price2 = input.nextDouble();

        double payment = (num_units1 * price1) + (num_units2 * price2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", payment);
    }
}