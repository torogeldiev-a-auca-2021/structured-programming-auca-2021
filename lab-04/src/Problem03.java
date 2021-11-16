import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("month? ");
        int a = input.nextInt();
        String msg;
        switch (a){
            case 12 : msg = "winter"; break;
            case 1 : msg = "winter"; break;
            case 2 : msg = "winter"; break;
            case 3 : msg = "spring" ; break;
            case 4 : msg = "spring" ; break;
            case 5 : msg = "spring" ; break;
            case 6 : msg = "summer"; break;
            case 7 : msg = "summer"; break;
            case 8 : msg = "summer"; break;
            case 9 : msg = "autumn"; break;
            case 10 : msg = "autumn"; break;
            case 11 : msg = "autumn"; break;
            default: msg = "invalid"; break;
        }
        System.out.println(msg);

    }
}
