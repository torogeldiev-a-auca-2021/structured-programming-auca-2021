import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if ( a < b + c && b < c + a && c < a + b) {
            int perimeter = a + b + c;
            System.out.printf("%d", perimeter);
        }else{
            System.out.println("The input is invalid");
        }
    }
}
