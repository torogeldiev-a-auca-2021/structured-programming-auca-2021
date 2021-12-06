import java.util.Scanner;
public class URI1080 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int high = 0, pos = 0;
        for( int i = 1; i <= 100; i++){
            int a = input.nextInt();

            if(high > a){
                high = high;
                pos = pos;
            }else{
                high = a;
                pos = i;
            }

        }
        System.out.println(high + "\n" +pos);
    }


}
