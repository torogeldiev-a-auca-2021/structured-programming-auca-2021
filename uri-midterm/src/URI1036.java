import java.util.Scanner;

public class URI1036 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double R1;

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if ( b * b - 4 * a * c <0) {
            System.out.println("Impossivel calcular");
        }if ( a == 0) {
            System.out.println("Impossivel calcular");
        }else if (-b + Math.sqrt (b * b - 4 * a * c) / 2 * a );
        System.out.println("R1 = %.5f\n R2 = %.5f", R1 );

    }



}
}