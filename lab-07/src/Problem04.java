import java.util.*;

public class Problem04 {
    static  final int NUM_OF_SHUFFLE_MOVES = 500;

    static Random rnd = new Random();
    static int[][] gameboard = new int[4][4];
    static int emptyRow;
    static int emptyCol;

    public static void main(String[] args) {
        initBoard();
        shuffleBoard();
        //printBoard();
    }

    private static void shuffleBoard() {
        int nMove = 0;
        while (nMove < NUM_OF_SHUFFLE_MOVES) {
            int dir = rnd.nextInt(4);
            int dr = 0;
            int dc = 0;
            switch (dir) {
                case 0:
                    dr = -1;
                    break;
                case 1:
                    dc = 1;
                    break;
                case 2:
                    dr = 1;
                    break;
                case 3:
                    dc = -1;
                    break;
            }
            if (0 <= emptyRow + dr &&  emptyRow + dr < 4 && 0 <= emptyCol + dc && emptyCol + dc < 4) {
                gameboard[emptyRow][emptyCol] = gameboard[emptyRow + dr][emptyCol + dc];
                emptyRow += dr;
                emptyCol += dc;
                gameboard[emptyRow][emptyCol] = 16;
                ++  nMove;
            }
        }
    }

    private static void initBoard() {
        int curNumber = 1;
        for (int row = 0; row < 4; ++row) {
            for (int col = 0; col < 4; ++col) {
                gameboard[row][col] = curNumber;
                ++curNumber;
            }
        }
        emptyRow = 3;
        emptyCol = 3;
    }
}

