import processing.core.*;

import javax.swing.*;

public class Problem07 extends PApplet {
    float radius;
    float size;
    float alpha , beta;


    public void settings() {
        fullScreen();
    }

    public void setup() {
//        try {
//          String strRadius = JOptionPane.showInputDialog(null, "number of stars [8 , 12]: ");
//          radius = Float.parseFloat(strRadius);
//
//        } catch (NumberFormatException e){
//            JOptionPane.showMessageDialog(null, "incorrect number");
//            System.exit(1);
//        }
//        if (radius < 8 || radius > 12){
//            JOptionPane.showMessageDialog(null,"incorrect number");
//        }
//        try{
//            String strSize = JOptionPane.showInputDialog(null, "number of rays [8 , 10, 12]");
//            Float.parseFloat(strSize);
//            System.exit(1);
//
//        }catch (NumberFormatException e){
//            JOptionPane.showMessageDialog(null, "incorrect number");
//            System.exit(1);
//        }
//        if(size != 8 || size != 10 || size != 12){
//            JOptionPane.showMessageDialog(null, "incorrect number: ");
//            System.exit(1);
//        }
    }



    public void draw() {
        background(0, 0, 0);
        pushMatrix();
        translate(width / 2f , height / 2f);
//        rotate(alpha);
//        strokeWeight(3);
//        stroke(255, 0 , 0);
//        line(-50, 0, 50 , 0);
//        line(0 , 50 , 0 , -50);
//        alpha += 0.05f;
        fill(255, 0 ,0);
        drawStar(0 , 0 , 30 , 60, 60,0);
        popMatrix();

    }

    public static void main(String[] args) {
        PApplet.main("Problem07");
    }
    public void drawStar(float x, float y, float radius1, float radius2, int size, float angle) {
        float angleStep = TWO_PI / size;
        float prevEndX = x + cos(angle - angleStep) * radius1;
        float prevEndY = y + sin(angle - angleStep) * radius1;
        for (int i = 0; i < size; i++) {
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