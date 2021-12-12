import processing.core.*;

public class Problem03 extends PApplet {
    public static float Rect1PosX;
    public static float Rect1PosY;
    public static float Rect1Width;
    public static float Rect1Height;
    public static float Rect2PosX;
    public static float Rect2PosY;
    public static float Rect2Width;
    public static float Rect2Height;
    public static float Rect3PosX;
    public static float Rect3PosY;
    public static float Rect3Width;
    public static float Rect3Height;
    public static float colorB;
    public static float colorR;



    public void settings() {
        fullScreen();
        rect(180 , 40, 100,40);
        colorB = 255;
        colorR = 255;



    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);
        rect(180 , 40, 100,40);
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}