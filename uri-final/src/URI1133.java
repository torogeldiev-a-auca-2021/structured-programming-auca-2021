import java.util.Scanner;

public class URI1133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        int y = sc.nextInt();

        for( int i = Math.min(x,y) + 1;i < Math.max(x,y);i++ ){
            if(i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }

    }
}