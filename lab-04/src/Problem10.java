import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 13);
        String msg;
        int y = (int) (Math.random() * 4);
        String message;
        switch (x) {
            case 1:
                msg = "Ace";
                break;
            case 2:
                msg = "2";
                break;
            case 3:
                msg = "3";
                break;
            case 4:
                msg = "4";
                break;
            case 5:
                msg = "5";
                break;
            case 6:
                msg = "6";
                break;
            case 7:
                msg = "7";
                break;
            case 8:
                msg = "8";
                break;
            case 9:
                msg = "9";
                break;
            case 10:
                msg = "10";
                break;
            case 11:
                msg = "Jack";
                break;
            case 12:
                msg = "Queen";
                break;
            case 0 :
                msg = "King";
                break;
            default: msg = "invalid";break;
        }

            switch (y) {
                case 1:
                    message = "Clubs";
                    break;
                case 2:
                    message = "Diamonds";
                    break;
                case 3:
                    message = "Hearts";
                    break;
                case 0:
                    message = "Spades";
                    break;
                default: message = "invalid";break;
            }
        System.out.printf("The card you picked is %s of %s",msg,message);

            }
        }


