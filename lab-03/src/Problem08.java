import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int x = Math.min(a , b);
        x = Math.min(x , c);
        int v = Math.max(a , b);
        v = Math.max(v , c);
        int def = (a + b + c ) - x - v;
        System.out.println(x);
        System.out.println(def);
        System.out.println(v);




    }
}
