import java.util.Scanner;

public class URI1021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int ss = N / 100;
        int st = N % 100 / 50;
        int se = N % 100 % 50 / 20;
        int sw = N % 100 % 50 % 20 / 10;
        int sx = N % 100 % 50 % 20 % 10 / 5;
        int sa = N % 100 % 50 % 20 % 10 %  5 / 2;
        int sq = N % 100 % 50 % 20 % 10 % 5 % 2;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100,00\n", ss);
        System.out.printf("%d nota(s) de R$ 50,00\n", st);
        System.out.printf("%d nota(s) de R$ 20,00\n", se);
        System.out.printf("%d nota(s) de R$ 10,00\n", sw);
        System.out.printf("%d nota(s) de R$ 5,00\n", sx);
        System.out.printf("%d nota(s) de R$ 2,00\n", sa);
        System.out.printf("%d nota(s) de R$ 1,00\n", sq);

        int ed = (N % 100 % 50 % 20 % 10 % 5 % 2) * 100;
        int er = (N % 100 % 50 % 20 % 10 % 5 % 2) * 100 / 100;
        int ew = (N % 100 % 50 % 20 % 10 % 5 % 2) * 100 / 50;
        int eq = (N % 100 % 50 % 20 % 10 % 5 % 2) * 100 % 50 / 25;
        int es = (N % 100 % 50 % 20 % 10 % 5 % 2) * 100 % 50 % 25 / 10;
        int eg = (N % 100 % 50 % 20 % 10 % 5 % 2) * 100 % 50 % 25 % 10 / 5;
        int eh = (N % 100 % 50 % 20 % 10 % 5 % 2) * 100 % 50 % 25 % 10 % 5;

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", er);
        System.out.printf("%d moeda(s) de R$ 0.50\n", ew);
        System.out.printf("%d moeda(s) de R$ 0.25\n", eq);
        System.out.printf("%d moeda(s) de R$ 0.10\n", es);
        System.out.printf("%d moeda(s) de R$ 0.05\n", eg);
        System.out.printf("%d moeda(s) de R$ 0.01\n", eh);









    }
}

