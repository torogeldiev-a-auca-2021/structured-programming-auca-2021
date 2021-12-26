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
        textSize(60);
        rectS = 125;
        rectPosX = width / 2f - 2 * rectS;
        rectPosY = height / 2f - 2 * rectS;
        initgame15(game15);
    }

    public void draw() {
        background(0, 0, 0);
        for (int i = 0; i < game15.length; i++) {
            for (int j = 0; j < game15.length; j++) {
                if (game15[i][j] == 16) {
                    stroke(255,255,255);
                    fill(0, 0, 0);
                    rect(rectPosX + j * rectS, rectPosY + i * rectS, rectS, rectS);
                    noStroke();
                } else if (game15[i][j] < 16) {
                    fill(0, 0, 255);
                    stroke(255, 255, 255);
                    rect(rectPosX + j * rectS, rectPosY + i * rectS, rectS, rectS);
                    noStroke();
                }
                int d =  game15.length + 1;
                fill(255,255,0);
                text(" "+ game15[i][j],rectPosX + 20 +  j * rectS ,rectPosY + 100 + i * rectS);

            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

    public static void initgame15(int[][] game15) {
        int counter = 1;
        for (int i = 0; i < game15.length; i++) {
            for (int j = 0; j < game15[i].length; j++, counter++) {
                game15[i][j] = counter;
            }
        }
    }
}
