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
        float rectTopLeftY1 = height / 4f - RECT_HEIGHT / 2f;
        float rectTopLeftX2 = width / 2f - RECT_WIDTH / 2f;
        float rectTopLeftY2 = height / 3f - RECT_HEIGHT / 4f;
        float rectTopLeftX3 = width / 2f - RECT_WIDTH / 2f;
        float rectTopLeftY3 = height / 2f - RECT_HEIGHT / 1.3f;



        fill (0, 0 , 255);
        rect(rectTopLeftX1 , rectTopLeftY1, RECT_WIDTH, RECT_HEIGHT);
        rect(rectTopLeftX2 , rectTopLeftY2, RECT_WIDTH, RECT_HEIGHT);
        rect(rectTopLeftX3 , rectTopLeftY3, RECT_WIDTH, RECT_HEIGHT);



        fill (0,0,100);
        ellipse(mouseX, mouseY, 100 , 100);
        fill (255, 255, 0);
        text("mouseX: " + mouseX, width / 2f , height / 2f);
        text("mouseY: " + mouseX, width / 2f , height / 2f + height / 30f);

        if (rectTopLeftX1 <= mouseX && mouseX <= rectTopLeftX1 + RECT_WIDTH && rectTopLeftY1 <= mouseY && mouseY <= rectTopLeftY1 + RECT_HEIGHT){
            fill(255, 255, 255);
            text("Year: 1995. PYPL Index: 2", width / 2f , height - height / 10f);
        }

    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}