import java.util.*;

public class Problem02 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int year = readNumber("Year: ", "Incorrect number of year", 1, 100000);
            int month = readNumber("Month: ", "Incorrect number of month", 1, 12);
            int days = getNumberOfDays(year, month);
            System.out.println("Number of days: " + days);
        }
    }

    static int readNumber(String msg, String errorMsg, int beg, int end) {
        System.out.print(msg);
        if (!input.hasNextInt()) {
            System.exit(0);
        }
        int input = Problem02.input.nextInt();
        if (input < beg || end < input) {
            System.out.println(errorMsg + input);
            System.exit(1);
        }
        return input;
    }

    static int getNumberOfDays(int year, int month) {


        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days_in_month = days[month - 1];
        if (isLeapYear(year) && month == 2) {
            ++days_in_month;
        }
        return days_in_month;
    }

    static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}