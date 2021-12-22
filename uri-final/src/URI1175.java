import java.util.Scanner;

public class URI1175 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] x = new int[20];
        for(int i = 0; i < x.length;i++){
            x[i] = sc.nextInt();
        }
        reverse(x);
        for(int i = 0; i < x.length;i++) {
            System.out.printf("N[%d] = %d\n", i, x[i]);
        }

    }
    public static void reverse(int []x){
        for(int left = 0, right = x.length - 1; right > left; right--, left++ ){
            int t = x[right];
            x[right] = x[left];
            x[left] = t;
        }
    }
}
