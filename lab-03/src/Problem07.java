import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day ");
        int D = input.nextInt();

           if (D > -1 && D < 1) {
            System.out.println("Today is: Sunday");
        } else if(D > 0 && D < 2) {
            System.out.println("Today is: Monday");
        } else if (D > 1 && D < 3) {
            System.out.println("Today is: Tuesday");
        }  else if (D > 2 && D < 4) {
            System.out.println("Today is: Wednesday");
        } else if (D > 3 && D < 5) {
            System.out.println("Today is: Thursday");
        }  else if (D > 4 && D < 6) {
            System.out.println("Today is: Friday");
        }  else if (D > 5 && D < 7) {
            System.out.println("Today is: Saturday");



        }
    }
}
