import java.util.Scanner;

public class URI1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if(n <= 0) break;

            for(int i = 1; i <= n; i++ ){
                if (i == n)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
    }
}
