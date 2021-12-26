import java.util.Random;
import java.util.Scanner;

public class Problem02 {
    public static int emptyX, emptyY;

    public static void main(String[] args) {//project02 logic test
        int[][] game15 = new int[4][4];
        Scanner sc = new Scanner(System.in);
        initgame15(game15);
        for (int i = 0; i < game15.length; i++) {
            for (int j = 0; j < game15[i].length; j++) {
                if (game15[i][j] == 0) {
                    emptyX = j;
                    emptyY = i;
                }
                System.out.print(game15[i][j] + " ");
            }
            System.out.println();
        }
        while (true) {
            int dir = sc.nextInt();//direction
            if (dir == 1) {//up
                if (emptyY - 1 >= 0) {
                    int t = game15[emptyY - 1][emptyX];
                    game15[emptyY - 1][emptyX] = 0;
                    game15[emptyY][emptyX] = t;
                    emptyY--;
                }
            }
            if (dir == 2) {//right
                if (emptyX + 1 < game15.length) {
                    int t = game15[emptyY][emptyX + 1];
                    game15[emptyY][emptyX + 1] = 0;
                    game15[emptyY][emptyX] = t;
                    emptyX++;
                }
            }
            if (dir == 3) {//down
                if (emptyY + 1 < game15.length) {
                    int t = game15[emptyY + 1][emptyX];
                    game15[emptyY + 1][emptyX] = 0;
                    game15[emptyY][emptyX] = t;
                    emptyY++;

                }
            }
            if (dir == 4) {//left
                if (emptyX - 1 >= 0) {
                    int t = game15[emptyY][emptyX - 1];
                    game15[emptyY][emptyX - 1] = 0;
                    game15[emptyY][emptyX] = t;
                    emptyX--;
                }
            }
            for (int i = 0; i < game15.length; i++) {
                for (int j = 0; j < game15[i].length; j++) {
                    System.out.print(game15[i][j] + " ");
                }
                System.out.println();
            }
        }


    }

    public static void initgame15(int[][] game15) {
        int counter = 0;
        for (int i = 0; i < game15.length; i++) {
            for (int j = 0; j < game15[i].length; j++, counter++) {
                game15[i][j] = counter;
            }
        }
        Random random = new Random();

        for (int i = game15.length - 1; i > 0; i--) {
            for (int j = game15[i].length - 1; j > 0; j--) {
                int m = random.nextInt(i + 1);
                int n = random.nextInt(j + 1);

                int temp = game15[i][j];
                game15[i][j] = game15[m][n];
                game15[m][n] = temp;
            }
        }
    }
}
