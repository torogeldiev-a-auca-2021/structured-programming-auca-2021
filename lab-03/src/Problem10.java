import java.util.*;

public class Problem10 {
    public static double RADIUS = 10.0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point  with two coordinates");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double sum = x * x + y * y;
        if(sum < RADIUS * RADIUS) {
            System.out.printf("The point(%.1f , %.1f ) is in the circle", x, y);

        }else if (sum == RADIUS * RADIUS) {
            System.out.printf("The point(%.1f , %.1f) is on the circle", x, y);
        }else{
            System.out.printf("The point(%.1f , %.1f) is not in the circle", x, y);
        }

    }

}
