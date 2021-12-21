import java.util.*;

public class Problem05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students:");

        int n = input.nextInt();
        int[] a = new int[n];
        int bestScore = 0;

        System.out.print("Enter " + n + " scores:");

        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
            if (bestScore < a[i]) {
                bestScore = a[i];
            }
        }

        String grade;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= bestScore - 10) {
                grade = "A";
            } else if (a[i] >= bestScore - 20) {
                grade = "B";
            } else if (a[i] >= bestScore - 30) {
                grade = "C";
            } else if (a[i] >= bestScore - 40) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("Student " + i +" score is " + a[i] +" and grade is " + grade);
        }

    }

}
