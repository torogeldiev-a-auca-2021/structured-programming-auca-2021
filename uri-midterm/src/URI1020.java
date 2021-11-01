import java.util.*;

public class URI1020 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int N = input.nextInt();
int years = N / 365;
int months = N % 365 / 30;
int days = N % 365 % 30;
System.out.println(years + " ano(s)");
System.out.println(months + " mes(es)");
System.out.println(days + " dia(s)");


     }
}