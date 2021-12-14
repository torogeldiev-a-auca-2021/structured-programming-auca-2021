import processing.core.*;

public class Problem03 extends PApplet {
    final static float RECT_WIDTH = 600;
    final static float RECT_HEIGHT = 100;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        textSize(40);
        textAlign(CENTER);
        frameRate(30);
    }

    public void draw() {
        background(0, 0, 0);
        float rectTopLeftX1 = width / 2f - RECT_WIDTH / 2f;
        float rectTopLeftY1 = height / 4f - RECT_HEIGHT / 1.9f;
        float rectTopLeftX2 = width / 2f - RECT_WIDTH / 2f;
        float rectTopLeftY2 = height / 3f - RECT_HEIGHT / 3.9f;
        float rectTopLeftX3 = width / 2f - RECT_WIDTH / 2f;
        float rectTopLeftY3 = height / 2f - RECT_HEIGHT / 1.4f;


        fill(0, 0, 255);
        rect(rectTopLeftX1, rectTopLeftY1, RECT_WIDTH, RECT_HEIGHT);
        rect(rectTopLeftX2, rectTopLeftY2, RECT_WIDTH, RECT_HEIGHT);
        rect(rectTopLeftX3, rectTopLeftY3, RECT_WIDTH, RECT_HEIGHT);


        fill(255, 255, 255);
        text("Java Programming Language", width / 2f, height / 3.7f);
        fill(255, 255, 255);
        text("Kotlin Programming Language", width / 2f, height / 2.7f);
        fill(255, 255, 255);
        text("Scala Programming Language", width / 2f, height / 2.05f);




        fill(0, 0, 100);
        fill(255, 255, 0);


        if (rectTopLeftX1 <= mouseX && mouseX <= rectTopLeftX1 + RECT_WIDTH && rectTopLeftY1 <= mouseY && mouseY <= rectTopLeftY1 + RECT_HEIGHT) {
            fill(255, 255, 0);
            text("Year: 1995. PYPL Index:2", width / 2f, height - height / 10f);
            fill(255,0,0);
            text("Java Programming Language", width / 2f, height / 3.7f);

        } else if (rectTopLeftX2 <= mouseX && mouseX <= rectTopLeftX2 + RECT_WIDTH && rectTopLeftY1 <= mouseY && mouseY <= rectTopLeftY2 + RECT_HEIGHT) {
            fill(255, 255, 0);
            text("Year: 2011. PYPL Index:11", width / 2f, height - height / 10f);
            fill(255,0,0);
            text("Kotlin Programming Language", width / 2f, height / 2.7f);
        } else if (rectTopLeftX3 <= mouseX && mouseX <= rectTopLeftX3 + RECT_WIDTH && rectTopLeftY3 <= mouseY && mouseY <= rectTopLeftY3 + RECT_HEIGHT) {
            fill(255, 255, 0);
            text("Year: 2004. PYPL Index:20", width / 2f, height - height / 10f);
            fill(255,0,0);
            text("Scala Programming Language", width / 2f, height / 2.05f);




        }

    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}