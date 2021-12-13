import java.util.Scanner;

public class URI1133 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int A = Math.min(a, b);
        int B = Math.max(a, b);
        for (int i = A + 1; i < B; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);

            }
        }

    }
}