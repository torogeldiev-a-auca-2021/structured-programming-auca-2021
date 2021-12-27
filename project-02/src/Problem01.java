import processing.core.*;

public class Problem01 extends PApplet {
    float rectPosX;
    float rectPosY;
    float rectS;
    int[][] game15 = new int[4][4];

    public void settings() {
        fullScreen();
    }

    public void setup() {
        textSize(90);
        rectS = 125;
        rectPosX = width / 2f - 2 * rectS;
        rectPosY = height / 2f - 2 * rectS;
        initGame15(game15);
    }

    public void draw() {
        background(0, 0, 0);
        textAlign(CENTER, CENTER);
        fill(255,255,0);
        text("Game15", width / 2f  , 100);
        text("Start/Restart: Enter", width / 2f , 800);
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

                if (game15[i][j] == 16) {
                    noFill();
                    text(game15[i][j], rectPosX + j * rectS + rectS / 2f, rectPosY + i * rectS + rectS / 2);
                } else if (game15[i][j] < 16) {
                    fill(255, 255, 0);
                    text(game15[i][j], rectPosX + j * rectS + rectS / 2f, rectPosY + i * rectS + rectS / 2);
                    noFill();
                }
            }
        }


        if (keyPressed && key == ENTER) {
            shuffle(game15);
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

    public void shuffle(int[][] game15) {
        for (int i = game15.length - 1; i > 0; i--) {
            for (int j = game15.length - 1; j > 0; j--) {
                int m = (int) random(i + 1);
                int n = (int) random(j + 1);

                int temp = game15[i][j];
                game15[i][j] = game15[m][n];
                game15[m][n] = temp;
            }
        }
    }
}
