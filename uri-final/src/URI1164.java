import java.util.Scanner;

public class URI1164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(isPerfert(a)){
                System.out.println(a + " eh perfeito");
            }
            else {
                System.out.println(a + " nao eh perfeito");
            }
        }
    }

    public static boolean isPerfert(int a) {
        int sum  = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        if (a == sum) {
            return true;
        } else return false;
    }
}
