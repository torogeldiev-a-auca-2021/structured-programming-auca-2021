import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        if ( a > 0 && a <= 2) {
            System.out.println("2.5");
        }else if (a > 2 && a <=4) {
            System.out.println("4.5");
        }else if (a >4 && a <= 10) {
            System.out.println("10.5");
        }else if (a > 10 && a <= 20) {
            System.out.println("10.5");
        }else if (a > 20){
            System.out.println("the package cannot be shipped");
        }
    }
}
