import java.util.Scanner;

public class URI1061 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stt , ttt, hh, cc, aa, bb;
        stt = input.next();
        int start = input.nextInt();
        int start2 = input.nextInt();;
        ttt = input.next();
        int start3 = input.nextInt();
        hh = input.next();
        int start4 = input.nextInt();
        cc = input.next();
        int end = input.nextInt();
        int end2 = input.nextInt();
        aa = input.next();
        int end3 = input.nextInt();
        bb = input.next();
        int end4 = input.nextInt();

        int d = end - start;
        int h = end2 - start2;
        int m = end3 - start3;
        int s = end4 - start4;
        if (s < 0) {
            s += 60;
            m--;
        if( m < 0){
            m += 60;
            h--;
            if(h < 0){
                h += 24;
                d -= 1;

                System.out.println(d +"dia(s)");
                System.out.println(h +"hora(s)");
                System.out.println(m +"minuto(s)");
                System.out.println(s + "segundo(s)");
            }
        }

        }

    }
}
