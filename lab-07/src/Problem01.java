import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n [] = new int[13];
        int num = sc.nextInt();

        for (int i = 0; i < num; i++){
            int die1 = 1 + (int)(Math.random() * 6);
            int die2 = 1 + (int)(Math.random() * 6);
            int sum = die1 + die2;
            n[sum]++;
        }
        for (int i = 2; i < 13;i++){
             System.out.printf("%d: %d\n", i, n[i]);
        }
    }
}
