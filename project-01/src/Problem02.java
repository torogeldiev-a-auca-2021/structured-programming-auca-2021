
import processing.core.*;

public class Problem02 extends PApplet {
    public static float circleRPosX;
    public static float circleGPosX;
    public static float circleBPosX;
    public static float circleRPosY;
    public static float circleGPosY;
    public static float circleBPosY;
    public static float colorRed;
    public static float colorGreen;
    public static float colorBlue;
    public static float circleRadius;
    public static float dX;
    public static float dY;
    public static float direction;



    public void settings() {
        fullScreen();
    }

    public void setup() {
        float centerX = width / 2f;
        float centerY = height / 2f;
        circleRadius = 80;
        circleRPosX = centerX;
        circleRPosY = centerY;
        circleGPosX = centerX + circleRadius;
        circleGPosY = centerY;
        circleBPosX = centerX + circleRadius * 2;
        circleBPosY = centerY;
        colorRed = 255;
        colorGreen = 255;
        colorBlue = 255;
        dX = 10;
        dY = 10;
        direction = -1;




    }

    public void draw() {
        background(0, 0, 0);
        fill(colorRed , 0 ,0);
        circle(circleRPosX,circleRPosY,circleRadius);
        fill(0,colorGreen,0);
        circle(circleGPosX,circleGPosY,circleRadius);
        fill( 0, 0 ,colorBlue);
        circle(circleBPosX,circleBPosY,circleRadius);

    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}