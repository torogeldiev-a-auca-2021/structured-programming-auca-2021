import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double fixed_salary = input.nextDouble();
        double money_total = input.nextDouble();

        double total = fixed_salary + (money_total * 15 / 100);
        System.out.printf("TOTAL = R$ %.2f\n", total);

    }
}