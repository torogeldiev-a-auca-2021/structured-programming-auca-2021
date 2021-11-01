import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int el = input.nextInt();

        int sum = today + el;

        if (today == 0) {
            sum = el;
        } else if (today > 0 && today < 7) {
            sum = today + el;
        }

        if (sum > 6) {
            sum = sum % 7;
        }

        if (today == 0) {
            System.out.print("Today is Sunday");
        } if (sum == 0) {
            System.out.print(" and the future day is Sunday" );
        } if (today == 1) {
            System.out.print("Today is Monday");
        } if (sum == 1) {
            System.out.print(" and the future day is Monday");
        } if (today == 2) {
            System.out.print("Today is Tuesday");
        } if (sum == 2) {
            System.out.print(" and the future day is Tuesday");
        } if (today == 3) {
            System.out.print("Today is Wednesday");
        } if (sum == 3) {
            System.out.print(" and the future day is Wednesday");
        } if (today == 4) {
            System.out.print("Today is Thursday");
        } if (sum == 4) {
            System.out.print(" and the future day is Thursday");
        } if (today == 5) {
            System.out.print("Today is Friday");
        } if (sum == 5) {
            System.out.print(" and the future day is Friday");
        } if (today == 6) {
            System.out.print("Today is Saturday");
        } if (sum == 6) {
            System.out.print(" and the future day is Saturday");
        }
    }
}