import java.util.Scanner;

public class URI1134 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int alco = 0;
        int gaso = 0;
        int diso = 0;
        while (a != 4) {

            a = input.nextInt();
            if (a == 1)
                alco++;
            else if (a == 2)
                gaso++;
            else if (a == 3)
                diso++;
        }
        System.out.printf("MUITO OBRIGADO\n" +
                "Alcool: %d\n" +
                "Gasolina: %d\n" +
                "Diesel: %d\n", alco, gaso, diso);
    }
}