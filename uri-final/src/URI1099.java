import java.util.Scanner;

public class URI1099 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int x, y;
        for (int i = 0; i < n; i++) {
            x = input.nextInt();
            y = input.nextInt();
            int sum = 0;
            for(int j = Math.min(x,y)+1;j < Math.max(x,y); j++){
               if( j % 2 != 0 ){
                    sum += j;

               }
            }
            System.out.println(sum);



        }
    }
}
