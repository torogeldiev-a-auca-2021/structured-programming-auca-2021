import java.util.Scanner;

public class URI1080 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int high = 0, pos = 0;
        int a;
        for (int i = 1; i <= 100; i++) {
            a = input.nextInt();
            if (high < a) {
                high = a;
                pos = i;

            }



        }
        System.out.println(high + "\n" + pos);
    }
}
