import processing.core.*;

public class Problem08 extends PApplet {
    float alpha;

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);
        pushMatrix();
        translate(width / 2f , height / 2f);
        rotate(alpha);
        strokeWeight(3);
        stroke(255, 0 , 0);
        line(-50, 0, 50 , 0);
        line(0 , 50 , 0 , -50);
        alpha += 0.05f;
        fill(255, 0 ,0);
        popMatrix();
    }

    public static void main(String[] args) {
        PApplet.main("Problem08");
    }


}
