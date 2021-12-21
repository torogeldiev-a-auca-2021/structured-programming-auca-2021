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
        int result = input.nextInt();
        if (result < beg || end < result) {
            System.out.println(errorMsg + result);
            System.exit(1);
        }
        return result;
    }

    static int getNumberOfDays(int year, int month) {


        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int result = days[month - 1];
        if (isLeapYear(year) && month == 2) {
            ++result;
        }
        return result;
    }

    static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}