import java.util.Scanner;

public class URI1132 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int A = Math.min(a, b);
        int B = Math.max(a, b);
        for (int i = A; i <= B; i++) {
            if (i % 13 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
