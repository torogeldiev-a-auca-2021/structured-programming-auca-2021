import java.util.Scanner;

public class URI1046 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if (a > b) {
            System.out.println("O JOGO DUROU " + (24 - a + b) + " HORA(S)");
        } else if (a < b) {
            System.out.println("O JOGO DUROU " + (b - a) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}