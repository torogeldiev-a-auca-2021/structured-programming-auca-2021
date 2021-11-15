import java.util.Scanner;

public class URI1048 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();

        if (a >= 0 && a <= 400) {
            double salary = a * 1.15;
            double earned = salary - a;
            int percantage = 15;
            System.out.printf("Novo salario: %.2f\n", salary);
            System.out.printf("Reajuste ganho: %.2f\n",earned);
            System.out.println("Em percentual: 15%%\n");
        } else if (a >= 400.01 && a <= 800) {
            double salary = a * 1.12;
            double earned = salary - a;
            int percantage = 12;
            System.out.printf("Novo salario: %.2f\n", salary);
            System.out.printf("Reajuste ganho: %.2f\n", earned);
            System.out.println("Em percentual: 12%%\n");
        } else if (a >= 800.01 && a <= 1200) {
            double salary = a * 1.10;
            double earned = salary - a;
            int percantage = 10;
            System.out.printf("Novo salario: %.2f\n", salary);
            System.out.printf("Reajuste ganho: %.2f\n",earned);
            System.out.println("Em percentual: 10%%\n");
        } else if (a >= 1200.01 && a <= 2000) {
            double salary = a * 1.07;
            double earned = salary - a;
            int percantage = 7;
            System.out.printf("Novo salario: %.2f\n", salary);
            System.out.printf("Reajuste ganho: %.2f\n", earned);
            System.out.println("Em percentual: 7%%\n");
        } else if (a >= 2000.01) {
            double salary = a * 1.04;
            double earned = salary - a;
            int percantage = 4;
            System.out.printf("Novo salario: %.2f\n", salary);
            System.out.printf("Reajuste ganho: %.2f\n", earned);
            System.out.println("Em percentual: 4%%\n");


        }
    }
}
