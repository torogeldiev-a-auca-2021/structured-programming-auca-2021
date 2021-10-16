import java.util.*;
public class Problem09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the minutes");
        int minutes = in.nextInt();
        int days = minutes / 60 / 24 ;
        int years = days / 365 ;
        System.out.printf("%d minutes is approximately %d years and %d days", minutes, years , days % 365);
    }
}