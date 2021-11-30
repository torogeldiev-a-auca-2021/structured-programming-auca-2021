import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s = 0;
        int n = 0;
        while (n < 20){
            n++;
            s +=n;
            if(s >= 100)
                break;
            }
        System.out.println("The number is " + n);
        System.out.println("The sum is " + s);
        int ss = 0;
        int nn = 0;

        while (nn < 20) {
            nn++;
            if (nn == 10 || nn == 11)
                continue;
            ss += nn;
        }
        System.out.println("The sum is " + ss);
        }
    }

