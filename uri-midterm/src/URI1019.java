import java.util.*;

public class URI1019 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sec = N % 60;
        int min = (N - sec) / 60 % 60;
        int h = (N - sec - min * 60) / 3600;
        System.out.printf("%d:%d:%d\n", h, min, sec);
    }
}