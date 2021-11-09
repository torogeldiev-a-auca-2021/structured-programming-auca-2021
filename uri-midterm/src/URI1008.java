import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int h = input.nextInt();
        double ph = input.nextDouble();
        
        double salary = h * ph;
        
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
        
    }
    
}
