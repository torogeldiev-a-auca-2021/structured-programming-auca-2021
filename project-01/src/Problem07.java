import processing.core.*;

import javax.swing.*;

public class Problem07 extends PApplet {
    float stars;
    float rays;
    float alpha, beta, angle;
    float distance;
    float radius;
    float maxRadius = 50;
    float minRadius = 25;
    float radiusDiff = 0.5f;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        try {
            String strRadius = JOptionPane.showInputDialog("number of stars [8 , 12]: ");
            stars = Float.parseFloat(strRadius);
            String strSize = JOptionPane.showInputDialog("number of rays [8 , 10, 12]");
            rays = Float.parseFloat(strSize);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "incorrect number");
            System.exit(1);
        }
        if (stars < 8 || stars > 12) {
            JOptionPane.showMessageDialog(null, "incorrect number");
            System.exit(1);
        }

        if (rays == 9 || rays == 11 || rays > 12 || rays < 8) {
            JOptionPane.showMessageDialog(null, "incorrect number: ");
            System.exit(1);
        }
        distance = 8;
        radius = 50;
    }


    public void draw() {
        background(0, 0, 0);
        float anglestep = TWO_PI / stars;
        float curAngle = 0;
        if (radius >= maxRadius) {
            radiusDiff *= -1;
        } else if (radius <= minRadius) {
            radiusDiff *= -1;
        }
        for (int i = 0; i < stars; i++) {
            pushMatrix();
            translate(width / 2f, height / 2f);
            float starX = cos(curAngle) * 8 * radius;
            float starY = sin(curAngle) * 8 * radius;
            stroke(0, 0, 255);
            rotate(alpha);
            drawStar(starX, starY, rays, 20, 40, 0);
            curAngle += anglestep;
            alpha += 0.005f;
            popMatrix();
        }
        pushMatrix();
        stroke(255, 0, 0);
        strokeWeight(3);
        translate(width / 2f, height / 2f);
        drawStar(0, 0, rays, 80, 160, angle);
        angle -= 0.05f;
        popMatrix();
        radius+=radiusDiff;
    }

    public static void main(String[] args) {
        PApplet.main("Problem07");
    }

    public void drawStar(float x, float y, float rays, float radius1, float radius2, float angle) {
        float angleStep = TWO_PI / rays;
        float prevEndX = x + cos(angle - angleStep) * radius1;
        float prevEndY = y + sin(angle - angleStep) * radius1;

        for (int i = 0; i < rays; i++) {
            float radius = i % 2 == 0 ? radius2 : radius1;
            float endX = x + cos(angle) * radius;
            float endY = y + sin(angle) * radius;

            line(x, y, endX, endY);
            line(prevEndX, prevEndY, endX, endY);
            angle += angleStep;
            prevEndX = endX;
            prevEndY = endY;

        }

    }
}