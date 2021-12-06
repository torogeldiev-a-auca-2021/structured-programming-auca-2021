
import java.util.Scanner;

public class URI1114 {

    public static void main(String[] args) {
        int password;
        Scanner input = new Scanner(System.in);
        while((password = input.nextInt()) != 2002){
            System.out.println("Senha Invalida");
        }
        System.out.println("Acesso Permitido");
    }
}
