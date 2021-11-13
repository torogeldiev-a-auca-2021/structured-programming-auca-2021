import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        double one = 4.00;
        double two = 4.50;
        double three = 5.00;
        double four = 2.00;
        double five = 1.50;

        if ( x == 1 ) {
            double pay = one * y;
            System.out.printf("Total: R$ %.2f\n", pay);
        }else if (x==2) {
            double pay = two * y;
            System.out.printf("Total: R$ %.2f\n", pay);
        }else if (x==3) {
            double pay = three * y;
            System.out.printf("Total: R$ %.2f\n", pay);
        }else if (x==4) {
            double pay = four * y;
            System.out.printf("Total: R$ %.2f\n", pay);
        }else if (x==5){
            double pay = five * y;
            System.out.printf("Total: R$ %.2f\n", pay);
        }

    }
}
