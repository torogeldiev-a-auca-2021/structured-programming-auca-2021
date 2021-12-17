import java.util.Scanner;

public class URI1096 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int j = 8;
        for (i = 1; i < 10; i += 2) {
            for (int count = 0, p = 7; count < 3; count++,p--) {
                j--;
                System.out.print("I=" + i);
                System.out.println(" J=" + p);
            }

        }
    }
}



