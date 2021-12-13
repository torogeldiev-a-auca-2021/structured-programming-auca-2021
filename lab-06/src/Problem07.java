import java.util.*;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        if (isPalindrome(num)) {
            System.out.print(num + " is a palindrome");
        } else {
            System.out.print(num + " is not a palindrome");
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int digit;

        do {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;

        } while (number != 0);

        return reverse;
    }

    public static boolean isPalindrome(int number) {

        return (number == reverse(number));

    }

}