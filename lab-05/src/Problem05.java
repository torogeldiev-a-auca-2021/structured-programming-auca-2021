import processing.core.*;

public class Problem05 extends PApplet {
    static final int NUMBER_OF_CIRCLES = 16;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noStroke();
        frameRate(2);
    }

    public void draw() {
        background(0, 0, 0);

        float r = min(width, width) / 2f;
        float dr = r / NUMBER_OF_CIRCLES;
        float redComp = 0;
        float dRedComp = 10;
        for (int i = 0; i < NUMBER_OF_CIRCLES; ++i) {
            fill(redComp, 0, 0);
            circle(width / 2f, height / 2f, 2 * r);
            r -= dr;
            redComp += dRedComp;
        }

        noLoop();
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}