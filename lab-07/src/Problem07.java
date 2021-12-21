import java.util.Scanner;

public class Problem07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxScore = 100;
        int[] score = new int[maxScore];
        int sum = 0, average = 0, n = 0;

        System.out.print("Scores: ");
        for (int i = 0; i < score.length; ++i) {

            score[i] = input.nextInt();

            if (score[i] < 0) {
                average = sum / i;
                break;
            } else {
                sum += score[i];
                n++;
            }
        }

        int equal = 0, bigger = 0, smaller = 0;
        for (int i = 0; i < n; ++i) {
            if (score[i] == average) {
                equal++;
            } else if (score[i] > average) {
                bigger++;
            } else {
                smaller++;
            }
        }

        System.out.println("Average scores: " + equal);
        System.out.println("High scores " + bigger);
        System.out.println("Low scores " + smaller);
    }

}