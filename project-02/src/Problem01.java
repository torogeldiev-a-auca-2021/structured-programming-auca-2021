import processing.core.*;

import java.util.Random;

public class Problem01 extends PApplet {
    public static float rectPosX;
    public static float rectPosY;
    public static float rectS;
    int[][] game15 = new int[4][4];
    public static int emptyX, emptyY;
    int moves;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        rectS = 125;
        rectPosX = width / 2f - 2 * rectS;
        rectPosY = height / 2f - 2 * rectS;
        initGame15(game15);
        emptyY = 3;
        emptyX = 3;
    }

    public void draw() {
        background(0, 0, 0);
        textSize(50);
        textAlign(CENTER, CENTER);
        fill(255, 255, 0);
        text("Game15", width / 2f, 50);
        text("Start/Restart: Enter", width / 2f, 800);
        textSize(50);
        text("Moves:" + moves,width / 2f + width / 3f ,height / 2f);
        textSize(90);
        for (int i = 0; i < game15.length; i++) {
            for (int j = 0; j < game15.length; j++) {
                if (game15[i][j] == 16) {
                    stroke(255, 255, 255);
                    fill(0, 0, 0);
                    rect(rectPosX + j * rectS, rectPosY + i * rectS, rectS, rectS);
                    noStroke();
                } else if (game15[i][j] < 16) {
                    fill(0, 0, 255);
                    stroke(255, 255, 255);
                    rect(rectPosX + j * rectS, rectPosY + i * rectS, rectS, rectS);
                    noStroke();
                }
                if (game15[i][j] != 16) {
                    fill(255, 255, 0);
                    text(game15[i][j], rectPosX + j * rectS + rectS / 2f, rectPosY + i * rectS + rectS / 2);
                }
            }
        }
    }

    public void keyReleased() {
        if (key == ENTER) {
            shuffle(game15);
        }
        if (key == CODED) {
            switch (keyCode) {
                case UP:
                    if (emptyY + 1 < game15.length) {
                        int t = game15[emptyY + 1][emptyX];
                        game15[emptyY + 1][emptyX] = 16;
                        game15[emptyY][emptyX] = t;
                        emptyY++;
                        moves++;
                    }
                    break;
                case DOWN:
                    if (emptyY - 1 >= 0) {
                        int t = game15[emptyY - 1][emptyX];
                        game15[emptyY - 1][emptyX] = 16;
                        game15[emptyY][emptyX] = t;
                        emptyY--;
                        moves++;
                    }
                    break;
                case RIGHT:
                    if (emptyX - 1 >= 0) {
                        int t = game15[emptyY][emptyX - 1];
                        game15[emptyY][emptyX - 1] = 16;
                        game15[emptyY][emptyX] = t;
                        emptyX--;
                        moves++;
                    }
                    break;
                case LEFT:
                    if (emptyX + 1 < game15.length) {
                        int t = game15[emptyY][emptyX + 1];
                        game15[emptyY][emptyX + 1] = 16;
                        game15[emptyY][emptyX] = t;
                        emptyX++;
                        moves++;
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

    public static void initGame15(int[][] game15) {
        int counter = 1;
        for (int i = 0; i < game15.length; i++) {
            for (int j = 0; j < game15[i].length; j++, counter++) {
                game15[i][j] = counter;
            }
        }
    }

    public static void shuffle(int[][] game15) {
        Random random = new Random();
        for (int i = game15.length - 1; i > 0; i--) {
            for (int j = game15.length - 1; j > 0; j--) {
                int m = random.nextInt(i + 1);
                int n = random.nextInt(j + 1);

                int temp = game15[i][j];
                game15[i][j] = game15[m][n];
                game15[m][n] = temp;
            }
        }
        for (int i = 0; i < game15.length; i++) {
            for (int j = 0; j < game15[i].length; j++) {
                if (game15[i][j] == 16) {
                    emptyX = j;
                    emptyY = i;
                }
            }
        }
    }
}
