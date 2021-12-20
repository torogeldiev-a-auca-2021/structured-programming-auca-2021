import java.util.Scanner;

public class URI1113 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        while (x != y) {
            if (x > y) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
            x = input.nextInt();
            y = input.nextInt();
        }
    }
}