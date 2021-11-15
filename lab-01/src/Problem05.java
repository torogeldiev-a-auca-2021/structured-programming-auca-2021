import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1st double? ");
        double a = input.nextDouble();
        System.out.print("2nd double? ");
        double b = input.nextDouble();

        double sum = a + b;
        double sub = a - b;
        double mult = a * b;
        double div = a / b;
        double per = a % b;

        System.out.println("a +  b = " + sum);
        System.out.println("a -  b = " + sub);
        System.out.println("a *  b = " + mult);
        System.out.println("a /  b = " + div);
        System.out.println("a %  b = " + per);


    }
}
