import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("complexity level?");
        int a = input.nextInt();
        String msg;
        switch (a) {
            case 0:
                msg = "a total newbie.";
                break;
            case 1:
                msg = "a beginner.";
                break;
            case 2:
            case 3:
                msg = "an experienced gamer";
                break;
            case 4:
            case 5:
                msg = "a pro gamer.";
                break;
            default:
                msg = "invalid";
                break;
        }
            System.out.printf("You are %s",msg);

        }
    }
