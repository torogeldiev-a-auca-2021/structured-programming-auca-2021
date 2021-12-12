import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("User coordinate: ");
        int user = input.nextInt();

        System.out.print("Coordinate of 1st point: ");
        int x1 = input.nextInt();
        System.out.print("Coordinate of 2st point: ");
        int x2 = input.nextInt();

        int d1 = x1 - user;
        if (d1 < 0 ) {
            d1 = -d1;

            int d2 = x2 - user;
            if (d2 < 0) {
                d2 = -d2;
            }


            if (d1 < d2) {
                System.out.println("1st point is closer. The distance is " + d1);
            } else if (d1 > d2) {
                System.out.println("2nd point is closer. The distance is " + d2);
            } else {
                System.out.println("Distance is the same. it is " + d1);
            }
        }
    }
}
