import java.util.Scanner;

public class URI1046 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        int minus = y - x;

        if (minus < 0) {
            int duration = 24 + (y - x);
            System.out.printf("O JOGO DUROU %d HORA(S)",duration);
        }else if (minus > 0) {
            int duration = y - x;
            System.out.printf("O JOGO DUROU %d HORA(S)",duration);
        }else{
            System.out.println("O JOGO DUROU 24 HORA(S)");


        }
    }
}