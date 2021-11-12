import java.util.Scanner;

public class URI1018 {
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

        System.out.println(N);
        System.out.printf("%d nota(s) de R$ 100,00\n", ss);
        System.out.printf("%d nota(s) de R$ 50,00\n", st);
        System.out.printf("%d nota(s) de R$ 20,00\n", se);
        System.out.printf("%d nota(s) de R$ 10,00\n", sw);
        System.out.printf("%d nota(s) de R$ 5,00\n", sx);
        System.out.printf("%d nota(s) de R$ 2,00\n", sa);
        System.out.printf("%d nota(s) de R$ 1,00\n", sq);



    }
}
