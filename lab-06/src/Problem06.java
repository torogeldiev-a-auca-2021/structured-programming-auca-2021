import java.util.*;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Your number: ");
        long n = input.nextInt();

        System.out.println("The sum of all digits is " + sumDigits(n));

    }
    public static int sumDigits(long n) {
        int sum = 0;

        sum += n % 10;
        n /= 10;

        sum += n % 10;
        n /= 10;

        sum += n % 10;
        n /= 10;

        sum += n % 10;
        return sum;

    }
    }