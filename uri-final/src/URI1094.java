import java.util.*;
public class URI1094 {
    public static void main(String[] args) {
        double b , sumS = 0, sumR = 0, sumC = 0, sumAll = 0;
        double perC,perS,perR;
        Scanner input =new Scanner(System.in);
        int a =input.nextInt();
        for(int i = 1 ; i <= a ; i++){
            b = input.nextDouble();
            String s = input.next();
            if(s.equals("S")){
                sumS += b;
            }
            if(s.equals("R")){
                sumR += b;
            }
            if(s.equals("C")){
                sumC += b;
            }

        }
        sumAll+=sumC+sumR+sumS;
        perC=(sumC * 100) / sumAll;
        perS=(sumS * 100) / sumAll;
        perR=(sumR * 100) / sumAll;
        System.out.printf("Total: %.0f cobaias\n", sumAll);
        System.out.printf("Total de coelhos: %.0f\n", sumC);
        System.out.printf("Total de ratos: %.0f\n",sumR );
        System.out.printf("Total de sapos: %.0f\n" ,sumS);
        System.out.printf("Percentual de coelhos: %.2f ", perC );
        System.out.print("%\n");
        System.out.printf("Percentual de ratos: %.2f ", perR );
        System.out.print("%\n");
        System.out.printf("Percentual de sapos: %.2f ", perS);
        System.out.print("%\n");
    }

}