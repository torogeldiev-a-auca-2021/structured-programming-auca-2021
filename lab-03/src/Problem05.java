import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of points? ");
        int p = input.nextInt();

        if (p >= 90 && p <= 100) {
            System.out.println("Grade: A");

        } else if (p >= 80 && p < 90) {
            System.out.println("Grade: B");

        } else if (p >= 70 && p < 80) {
            System.out.println("Grade: C");

        } else if (p >= 60 && p < 70) {
            System.out.println("Grade: D");

        } else if (p < 60) {
            System.out.println("Grade: F");

        } else if (p > 100) {
            System.out.println(p + " is not in the permitted range.");
        }
    }
}
