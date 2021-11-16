import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Year? ");
        int x = input.nextInt();
        System.out.print("Month? ");
        int y = input.nextInt();
        String msg;

        switch (y) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                msg = "Number of days: 31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                msg = "Number of days: 30";
                break;
            case 2:
                if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) {
                    msg = "Number of days: 29";
                } else {
                    msg = "Number of days: 28";
                }
                break;
            default:
                msg = "invalid";
        }
            System.out.printf(msg);


                    }
                }








