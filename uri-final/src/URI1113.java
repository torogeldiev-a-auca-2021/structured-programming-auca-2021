import java.util.Scanner;
public class URI1113 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        while((x = input.nextInt())!=(y = input.nextInt())){
            if(x < y ) {
                System.out.println("Crescente");
            }
            else{
                System.out.println("Decrescente");


            }
        }
    }
}
