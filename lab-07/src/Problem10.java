import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class Problem10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Month: ");
            int m = readNumber("Month: ", "incoorect number of monht", 1, 12);
            System.out.println("Year: ");
            int y = readNumber("Year: ", "incoorect number of monht", 1, 100000);

            int d = getNumber(m, y);
            System.out.println("Days: " + d);
        }

    }

    public static int readNumber(String msg, String incorrect, int beg, int end) {
        if (!sc.hasNextInt())
            System.exit(1);
        int p = sc.nextInt();
        if (p < beg && p > end) {
            System.out.println(incorrect + p);
        }
        return p;
    }

    public static int getNumber(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days_in_month = days[month - 1];
        if (isleapYear(year) && month == 2) {
            days_in_month++;
        }
        return  days_in_month;

    }
    public static boolean isleapYear(int year){
        return year % 400  == 0 || year % 4 == 0 && year % 100 != 0;

    }
}