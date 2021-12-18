import java.util.Scanner;

public class URI1094 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double total = 0;
        double perC = input.nextDouble();
        double perR = input.nextDouble();
        double perS = input.nextDouble();
        int  coelhos = 0,ratos = 0,sapos = 0;
        for (int i = 1; i <= n; i++) {
            int animals = input.nextInt();
            total += animals;
            String name = input.next();

            if (name.equals("C")) {
                coelhos += animals;
            } if(name.equals("R")) {
                ratos += animals;
            } if  (name.equals("S")){
                        sapos += animals;

            }
            perC =(double)  coelhos  * 100 / total;
            perR =(double) ratos * 100 / total;
            perS =(double) sapos * 100 / total;
            System.out.println("Total: "+ total);
            System.out.println("Total de coelhos: " + coelhos);
            System.out.println("Total de ratos: " + ratos);
            System.out.println("Total de sapos: " + sapos);
            System.out.printf("Percentual de coelhos: %.2f" , perC);
            System.out.printf("Percentual de ratos: %.2f" , perR);
            System.out.printf("Percentual de sapos: %.2f", perS);

        }


        }
    }
