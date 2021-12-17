import java.util.Scanner;

public class URI1095 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j = 60;
        int i = -2;
        for (j = 60; j > -1; j -= 5) {
              i  += 3;
            System.out.print("I=" + i);
            System.out.println(" J=" + j);


        }
    }
}