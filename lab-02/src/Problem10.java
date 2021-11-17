import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        int pop = 312032486;
        int sec = 365 * 24 * 60 * 60;
        double def = sec / 45.0 + sec / 7.0 - sec / 13.0;
        double one = def * a + pop;
        System.out.printf("The population in %d years is %.0f\n", a, one);





    }
}
