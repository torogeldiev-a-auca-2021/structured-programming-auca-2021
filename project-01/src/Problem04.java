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



    public void settings() {
        fullScreen();
    }

    public void setup() {
        textSize(30);
        textPosX = width / 2f - width / 5f;
        textPosY = height / 20f;
        textPosX1 = width / 2f - width / 5f;
        textPosY1 = height / 2f + height / 1.5f;
        circleX1 = width / 2f; //snake
        circleY1 = height / 2f;
        circleR = height / 20f;
        frameRate(10);
        rectX =  width / 2f - width / 3.5f;
        rectY = height / 2f - height / 2.5f;
        circleX2 = rectX + random(19 * circleR);// meal
        circleY2 = rectY + random(14 * circleR);

        leftBorder = rectX;
        RightBorder = rectX + 20 * circleR;
        UpBorder = rectY;
        DownBorder = rectY + 15 * circleR;

    }

    public void draw() {
        fill(0,255,0);
        text("Game: Collect Yellow circles Using Arrow Bottons",textPosX,textPosY);
        fill (0,255,0);
        text("Score: ",textPosX1, textPosY1);
        fill (0,0,0,40);
        rect(0, 0, width, height);
        fill(0,0,0);
        stroke(0,0,650);
        strokeWeight(1);
        //rect(rectX, rectY, 20 * circleR, 15 * circleR);

        for (int i = 0; i < 20; i++) {
            stroke(0, 0, 250);
            strokeWeight(5);
            fill(0, 0, 0);
            rect(rectX + i * circleR, rectY, circleR, circleR);
            for (int j = 0; j < 15; j++) {
                rect(rectX + i * circleR, rectY + j * circleR, circleR, circleR);
            }
        }

        strokeWeight(1);
        fill(255, 0,0);
        circle(circleX1, circleY1,  circleR - 2); // 2 lish
        fill(255,255,0);
        circle(circleX2, circleY2, circleR - 2); // 2 lish
        if (key == CODED){
            switch (keyCode){
                case UP:
                    circleY1 -= circleR;
                    break;
                case DOWN:
                    circleY1 += circleR;
                    break;
                case LEFT:
                    circleX1 -= circleR;
                    break;
                case RIGHT:
                    circleX1 += circleR;
                    break;

            }
        }

        stroke(0, 0, 255);


//        for(int i = 0; i < width; i+=width/20)
//            for(int y = 0; y < height; y+=height/20) {
//                line(i, y, i + width, y);
//                line(i, y, i, y + height);
//            }

//        for(int i = 0; i < RightBorder && i > leftBorder; i+= circleR)
//            for(int y = 0; y < UpBorder && i > DownBorder; y+=  circleR) {
//                line(i, y, i + circleR, y);
//               line(i, y, i, y + circleR);
//            }
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}