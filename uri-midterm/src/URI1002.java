import java.util.Scanner;

public class URI1002 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        double r = inp.nextDouble();
        double area = 3.14159 * r * r;

        System.out.printf("A=%.4f%n", area);
    }
}
