import processing.core.*;

public class Problem06 extends PApplet {
    float alpha , beta;
    float posX;
    float posY;
    public void settings() {
        fullScreen();

    }

    public void setup() {
        posX = 1300;
        posY = 35;
    }

    public void draw() {
        background(0, 0, 0);
        fill(0,0,255);
        rect(posX, posY, 200,50);
        rect(posX, posY+ 50, 200,50);
        rect(posX, posY + 50, 200,50);
        rect(posX, posY + 50, 200,50);

        pushMatrix();
        translate(width / 2f, height / 2f);
        fill( 255,255,0);
        circle(0, 0 , 225);

        rotate(alpha);
        fill(48,213,200);
        circle(200, 0 , 50);
        translate(300,-200);
        fill(0,0,255);
        circle(0,0,75);
        rotate(beta);
        fill(220,220,220);
        circle(-75,0,25);

        alpha += 0.05f;
        beta += 0.07f;
        popMatrix();
    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}
