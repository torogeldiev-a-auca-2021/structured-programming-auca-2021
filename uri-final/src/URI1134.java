import java.util.Scanner;

public class URI1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alc = 0;

        int dis = 0;
        int gas = 0;
        while(true){
            int x = sc.nextInt();


            if(x == 1) alc++;
            if (x == 2) gas++;
            if(x == 3) dis ++;
            if(x == 4) break;

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alc);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + dis);

    }
}