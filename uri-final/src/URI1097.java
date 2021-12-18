import java.util.Scanner;

public class URI1097 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int j = 8;
        for (i = 1,j = 8; i < 10; i += 2, j +=2) {
            for (int count = 0; count < 3; count++) {

                j--;
                System.out.print("I=" + i);
                System.out.println(" J=" + j);
            }
        }
    }
}

