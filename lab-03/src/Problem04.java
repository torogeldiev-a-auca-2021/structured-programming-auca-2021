import java.util.*;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Year? ");
        int year = input.nextInt();

        if (year % 4 !=0) {
            System.out.println("This is not a leap year.");
        }else if (year % 100 !=0) {
            System.out.println("This is  a leap year.");
        }else if (year % 400 !=0) {
            System.out.println("This is not a leap year.");
        } else {
            System.out.println("This is  a leap year.");


        }

    }
}
