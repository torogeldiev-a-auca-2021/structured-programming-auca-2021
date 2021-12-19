import java.util.Scanner;

public class URI1101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int sum = 0;
        while (m > 0 || n > 0) {
            for (int i = Math.min(m, n); i <= Math.max(m, n); i++) {
                System.out.print(i);

                sum += i ;
            }
            m = input.nextInt();
            n = input.nextInt();
            System.out.print(" Sum=" + sum );


        }
    }
}