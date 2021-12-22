import java.util.Scanner;

public class URI1165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(isPrime(a)){
                System.out.println(a + " eh primo");
            }
            else {
                System.out.println(a + " nao eh primo");
            }
        }
    }

    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
