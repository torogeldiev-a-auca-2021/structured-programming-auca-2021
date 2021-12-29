import processing.core.*;

import java.util.*;

public class Problem04 extends PApplet {
    float circleX1;
    float circleY1;
    float circleR;
    float circleX2;
    float circleY2;
    float textPosX;
    float textPosY;
    float textPosX1;
    float textPosY1;
    float rectX;
    float rectY;
    float leftBorder;
    float RightBorder;
    float UpBorder;
    float DownBorder;
    int score;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        textSize(30);
        score = 0;
        circleR = height / 20f;
        rectX = width / 2f - width / 3.5f;
        rectY = height / 2f - height / 2.5f;
        textPosX = width / 2f - width / 5f;
        textPosY = height / 20f;
        textPosX1 = width / 2f;
        textPosY1 = height / 2f + height / 2.5f;
        circleX1 = rectX + circleR / 2f; //snake
        circleY1 = rectY + circleR / 2f;
        circleX2 = rectX + circleR / 2f + (int) random(20) * circleR;// meal
        circleY2 = rectY + circleR / 2f + (int) random(15) * circleR;

        leftBorder = rectX;
        RightBorder = rectX + 20 * circleR;
        UpBorder = rectY;
        DownBorder = rectY + 15 * circleR;
    }

    public void draw() {

        fill(0, 0, 0);
        //rect(rectX, rectY, 20 * circleR, 15 * circleR);
        for (int i = 0; i < 20; i++) {
            stroke(0, 0, 250);
            strokeWeight(1);
            fill(0, 0, 0);
            rect(rectX + i * circleR, rectY, circleR, circleR);
            for (int j = 0; j < 15; j++) {
                rect(rectX + i * circleR, rectY + j * circleR, circleR, circleR);
            }
        }

        strokeWeight(1);

        fill(255, 255, 0);
        circle(circleX2, circleY2, circleR);

        fill(0, 255, 0);
        textSize(30);
        text("Game: Collect Yellow circles Using Arrow Bottons", textPosX, textPosY);
        text("Score: " + score, textPosX1, textPosY1);

        if (key == CODED) {
            switch (keyCode) {
                case UP:
                    if (circleY1 + circleR / 2f > rectY + circleR * 2) {
                        circleY1 -= circleR;
                    }
                    break;
                case DOWN:
                    if (circleY1 + circleR / 2f < rectY + 15 * circleR) {
                        circleY1 += circleR;
                    }
                    break;
                case LEFT:
                    if (circleX1 + circleR / 2f > rectX + circleR) {
                        circleX1 -= circleR;
                    }
                    break;
                case RIGHT:
                    if (circleX1 + circleR / 2f < rectX + 20 * circleR) {
                        circleX1 += circleR;
                    }
                    break;
            }
        }
        if(circleX1 >= circleX2 - circleR / 2 && circleX1 <= circleX2 + circleR / 2
                && circleY1 >= circleY2 - circleR / 2 && circleY1 <= circleY2 + circleR / 2 ){
            score++;
            fill(255, 255, 0);
            circleX2 = rectX + circleR / 2f + (int) random(20) * circleR;// meal
            circleY2 = rectY + circleR / 2f + (int) random(15) * circleR;

        }
        fill(0, 0, 0, 40);
        rect(0, 0, width, height);
        fill(255, 0, 0);
        circle(circleX1, circleY1, circleR);

    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }
}