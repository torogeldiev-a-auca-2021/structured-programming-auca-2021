import java.util.Scanner;

public class URI1131 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iWin = 0;
        int gWin = 0;
        int draw = 0;
        int matches = 0;

        while (true) {
            int Inter = input.nextInt();
            int Gremio = input.nextInt();
            if (Inter > Gremio)
            {
                iWin++;
            } else if (Gremio > Inter)
            {
                gWin++;
            } else draw++;

            matches ++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            if (input.nextInt() == 2) break;
        }
        System.out.println(matches + " grenais");
        System.out.println("Inter:" + iWin);
        System.out.println("Gremio:" + gWin);
        System.out.println("Empates:" + draw);

        if (iWin > gWin)
        {
            System.out.println("Inter venceu mais");
        } else if (gWin > iWin)
        {
            System.out.println("Gremio venceu mais");
        } else System.out.println("Não houve vencedor");
    }
}