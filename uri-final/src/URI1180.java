import java.util.Scanner;

public class URI1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 99999999;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(isMin(a, min)){
                min = a;
                idx = i;
            }
        }
        System.out.println("Menor valor: " + min);
        System.out.println("Posicao: " + idx);
    }

    public static boolean isMin(int a, int min) {
        return a < min;
    }
}
