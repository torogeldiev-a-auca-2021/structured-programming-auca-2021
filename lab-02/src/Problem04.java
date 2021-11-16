import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length in inches? ");
        double a = input.nextDouble();

        double mul = a  * 2.54;

        System.out.printf("%.0f in. = %.2f cm ", a, mul);


    }
}
