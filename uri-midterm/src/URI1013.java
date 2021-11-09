import java.util.Scanner;

public class URI1013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int great = (a + b + Math.abs(a - b)) / 2;
        int great2 = (great + c + Math.abs(great - c)) / 2;

        System.out.println(great2 + " eh o maior");




    }

}
