import java.util.*;
public class Problem08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a name in pounds: ");
        double pounds = in.nextDouble();
        double kilograms = pounds * 0.454;

        System.out.printf("%.2f pounds is %.3f kilograms\n", pounds, kilograms);

    }
}
