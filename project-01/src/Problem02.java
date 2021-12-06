
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



    public void settings() {
        fullScreen();
    }

    public void setup() {
        float centerX = width / 2f;
        float centerY = height / 2f;
        circleRPosX = centerX;
        circleRPosY = centerY;
        circleGPosX = centerX + 10;
        circleGPosY = centerY;
        circleBPosX = centerX + 20;
        circleBPosY = centerY;



    }

    public void draw() {
        background(0, 0, 0);
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}