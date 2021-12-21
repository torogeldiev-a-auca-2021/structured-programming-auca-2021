import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The first 50 prime numbers are");
        int count = -1;

        for (int i = 2; i <= 229; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0 && i % 13 !=0 && (i & 17) != 0
                    || i == 2 || i == 3 || i == 5 || i == 7  || i == 11 || i == 13 ||  i == 17 ) {
                count++;
                if( count % 10 == 0){
                    System.out.println();
                }
                System.out.printf("%d " , i);

            }
        }
    }
}
