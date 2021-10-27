import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1st number? ");
        int a = input.nextInt();
        System.out.print("2nd number? ");
        int b = input.nextInt();
        System.out.print("3rd number? ");
        int c = input.nextInt();


        if (a > b) {
            if (a > c) {
                System.out.println("The value " + a + " is the greatest one.");
            }
        }

        if (b > a) {
            if (b > c) {
                System.out.println("The value " + b + " is the greatest one.");
            }
        }

        if (c > a) {
            if (c > b) {
                System.out.println("The value " + c + " is the greatest one.");
            }
        }
    }
}