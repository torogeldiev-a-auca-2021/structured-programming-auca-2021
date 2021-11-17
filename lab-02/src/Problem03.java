import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("A four-digit integer? ");
        int n = inp.nextInt();
        int s = 0;

        s += n % 10;
        n /= 10;

        s += n % 10;
        n /= 10;

        s += n % 10;
        n /= 10;

        s += n % 10;
        System.out.println("The sum of all digits is " + s);
    }
}