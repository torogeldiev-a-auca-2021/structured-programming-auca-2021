import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d;
        int sum = 0;
        do {
            System.out.print("Enter an integer (the input ends if it is 0): ");
            d = input.nextInt();
            sum += d;
        }while (d !=0);
        System.out.println("The sum is " + sum);
        }
    }

