
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
    public static float circleDiameter;
    public static float dX;
    public static float dY;
    public static float directionXRed;
    public static float directionYRed;
    public static float directionXGreen;
    public static float directionYGreen;
    public static float directionXBlue;
    public static float directionYBlue;




    public void settings() {
        fullScreen();
    }

    public void setup() {
        float centerX = width / 2f;
        float centerY = height / 2f;
        circleDiameter = 85;
        circleRPosX = centerX;
        circleRPosY = centerY;
        circleGPosX = centerX + 60;
        circleGPosY = centerY + 60;
        circleBPosX = centerX + 120;
        circleBPosY = centerY + 120;
        colorRed = 255;
        colorGreen = 255;
        colorBlue = 255;
        dX = 5;
        dY = 5;
        directionXRed = -1;
        directionYRed = -1;
        directionXGreen = -1;
        directionYGreen = -1;
        directionXBlue = -1;
        directionYBlue = -1;




    }

    public void draw() {
        background(0, 0, 0);
        fill(colorRed , 0 ,0);
        circle(circleRPosX, circleRPosY, circleDiameter);
        fill(0, colorGreen, 0);
        circle(circleGPosX, circleGPosY, circleDiameter);
        fill(0, 0, colorBlue);
        circle(circleBPosX, circleBPosY, circleDiameter);
        circleRPosX += dX * directionXRed;
        circleRPosY += dY * directionYRed;
        circleGPosX += dX * directionXGreen;
        circleGPosY += dY * directionYGreen;
        circleBPosX += dX * directionXBlue;
        circleBPosY += dY * directionYBlue;
        if(circleRPosX + circleDiameter / 4f <= 0 || circleRPosX + circleDiameter / 4f >= width){
            directionXRed *= -1;
        }
        if(circleRPosY + circleDiameter / 4f <= 0 || circleRPosY + circleDiameter / 4f >= height){
            directionYRed *= -1;
        }
        if(circleGPosX + circleDiameter / 4f <= 0 || circleGPosX + circleDiameter / 4f >= width){
            directionXGreen *= -1;
        }
        if(circleGPosY + circleDiameter / 4f <= 0 || circleGPosY + circleDiameter / 4f >= height){
            directionYGreen *= -1;
        }
        if(circleBPosX + circleDiameter / 4f <= 0 || circleBPosX + circleDiameter / 4f >= width){
            directionXBlue *= -1;
        }
        if(circleBPosY + circleDiameter / 4f <= 0 || circleBPosY + circleDiameter / 4f >= height) {
            directionYBlue *= -1;
        }

    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}