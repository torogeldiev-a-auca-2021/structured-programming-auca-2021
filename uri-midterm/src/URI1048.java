import java.util.Scanner;

public class URI1048 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();

        if (a >= 0 && a <= 400) {
            double salary = a * 1.15;
            double earned = salary - a;
            System.out.printf("Novo salario: %.2f\n", salary);
            System.out.printf("Reajuste ganho: %.2f\n Em percentual: 15 %%",earned);
        }else if (a >= 400.01 && a <= 800) {
            double salary = a * 1.12;
            double earned = salary - a;
            System.out.printf("Novo salario: %.2f\n", salary);
            System.out.printf("Reajuste ganho: %.2f\nEm percentual: 12 %%",earned);
        }else if ( a >= 800.01 && a <= 1200) {
            double salary = a * 1.10;
            double earned = salary - a;
            System.out.printf("Novo salario: %.2f\n", salary);
            System.out.printf("Reajuste ganho: %.2f\nEm percentual: 10 %%",earned);
        }else if ( a >= 1200.01 && a <= 2000) {
            double salary = a * 1.07;
            double earned = salary - a;
            System.out.printf("Novo salario: %.2f\n", salary);
            System.out.printf("Reajuste ganho: %.2f\nEm percentual: 7 %%",earned);
        }else if (a >= 2000.01){
            double salary = a * 1.04;
            double earned = salary - a;
            System.out.printf("Novo salario: %.2f\n", salary);
            System.out.printf("Reajuste ganho: %.2f\nEm percentual: 4 %%",earned);




        }
    }
}
