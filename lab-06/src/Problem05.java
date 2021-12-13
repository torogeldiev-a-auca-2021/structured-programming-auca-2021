import java.util.*;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("A = ");
            long a = input.nextLong();

            System.out.print("B = ");
            long b = input.nextLong();

            System.out.printf("GCD(%d, %d) = %d%n,", a, b, gcd(a, b));
        } catch (InputMismatchException e) {
            System.out.println("It is not a correct int value");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("GCD(0, 0) is not defined");
        }

        if (a == 0) {
            return b;
        }

        while (b != 0) {
            long rem = a % b;
            a = b;
            b = rem;
        }

        return a;
    }
}