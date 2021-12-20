
import java.util.Scanner;

public class URI1135 {//1132

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();



        int sum = 0;

        for(int i = Math.min(x, y); i <= Math.max(x, y); i++)
        {
            if(i % 13 != 0)
                sum += i;
        }
        System.out.println(sum);
    }
}
