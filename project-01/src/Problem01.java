import processing.core.*;

public class Problem01 extends PApplet {
    public static float textPosX;
    public static float textPosY;
    public static float textSize;
    public static float sizeChange;
    public static float PosXChange;
    public static float PosYChange;
    public static float colorR;
    public static float colorG;
    public static float colorB;
    public static float temp;
    public static final float MIN_SIZE = 45;

    public void settings() {
        fullScreen();

    }

    public void setup() {
        textPosX = width / 2f;
        textPosY = height / 2f;
        textSize = MIN_SIZE;
        sizeChange = 2f;
        PosXChange = 7.5f;
        PosYChange = 3.0f;
        colorR = 27;
        colorG = 67;
        colorB = 127;
    }

    public void draw() {
        background(0,0,0);
        textSize(textSize);
        fill(colorR, colorG, colorB);
        textAlign(CENTER);
        text("Hello, processing!", textPosX, textPosY);
        textSize += sizeChange;
//        textPosX += PosXChange;
//        textPosY += PosYChange;
        if (textSize >= 150f || textSize <= MIN_SIZE) {
            sizeChange *= -1;
            PosXChange *= -1;
            PosYChange *= -1;

            //Swapping
            if (textSize <= MIN_SIZE){
                temp = colorR;
                colorR = colorG;
                colorG= temp;


                temp = colorR;
                colorR = colorB;
                colorB = temp;

            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}
