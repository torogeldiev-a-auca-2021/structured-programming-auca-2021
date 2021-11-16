import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;
    if ( discriminant > 0) {
        double r1 = (-b + Math.pow(discriminant , 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(discriminant , 0.5)) / (2 * a);
        System.out.printf("The equation has two roots %.5f and %.5f",r1,r2);
    }else if ( discriminant == 0) {
        double r3 = -b / 2 * a;
        System.out.printf("The equation has one root %.0f",r3);
    }else if (discriminant < 0){
        System.out.println("The equation has no real roots");
    }


    }
}
