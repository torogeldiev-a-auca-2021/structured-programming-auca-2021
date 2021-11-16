import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String message_comp = null;
        String message = null;
        int a1 = (int) (Math.random() * 3);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int a = input.nextInt();
        switch (a1) {
            case 0:
                message_comp = "scissor";
                break;
            case 1:
                message_comp = "rock";
                break;
            case 2:
                message_comp = "paper";
                break;
        }
        switch (a) {
            case 0:
                message = "scissor";
                break;
            case 1:
                message = "rock";
                break;
            case 2:
                message = "paper";
                break;
        }
        if (a1 == a ) {
            System.out.printf("The computer is %s. You are %s too. It is a draw ",message_comp,message);
        }else if (a1 < a) {
            System.out.printf("The computer is %s. You are %s. You won ", message_comp, message);
        }else if (a1 == 0 && a == 2 ){
            System.out.printf("The computer is %s. You are %s. You lose ", message_comp, message);
        }else if (a1 == 2 && a == 0) {
            System.out.printf("The computer is %s. You are %s. You won ", message_comp, message);
        }else
            System.out.printf("The computer is %s. You are %s. The computer lose ", message_comp, message);
        }
    }
