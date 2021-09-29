import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        System.out.println("What is your name? ");

        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        System.out.println("Hello,"+ userName + "!");

    }
}
