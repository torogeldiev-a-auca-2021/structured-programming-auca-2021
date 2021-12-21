import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("              Multiplication table");
        System.out.print("   ");

            System.out.println("\n-----------------------------------------");

            for (int i = 1; i <= 9; i++) {
                System.out.print(i + " | ");
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%4d", i * j);

                }
                System.out.println();

            }
        }
    }
