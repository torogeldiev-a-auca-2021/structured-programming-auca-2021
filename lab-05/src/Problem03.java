import java.util.*;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rnd = new Random();
        System.out.print("number of tests? ");
        int tests = input.nextInt();

        int numOfCorrectAnswers = 0;

        int i = 0;
        while (i < tests){
            int op1 = -50 + rnd.nextInt(101);
            int op2 = -50 + rnd.nextInt(101);
            System.out.printf("%d + %d = " , op1 , op2);
            int userAnswer = input.nextInt() ;
            if (op1 + op2 == userAnswer ){
                ++numOfCorrectAnswers;
            }
            ++i;
        }
        System.out.println("number of correct answers: " + numOfCorrectAnswers);
        System.out.println("number of incorrect answers: " +(tests - numOfCorrectAnswers));
    }

}
