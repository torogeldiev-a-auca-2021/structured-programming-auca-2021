import processing.core.*;
import javax.swing.*;

public class Problem05 extends PApplet {
    float radius;
    float textPosX;
    float textPosY;
    float rectX;
    float rectY;
    float size;
    int row = 0;
    int column = 0;
    String Color;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        size = 750 / radius;
        textSize(30);
        textPosX = width / 2f - width / 9f;
        textPosY = height / 2f - height / 2.1f;
        rectX = width / 2f - width / 3.8f;
        rectY = height / 2f - height / 2.2f;
        try {
            String strRadius = JOptionPane.showInputDialog("Enter the board's size [4,12]: ");
            radius = Float.parseFloat(strRadius);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "incorrect input: ");
            System.exit(1);
        }

        if (radius < 4 || radius > 12) {
            JOptionPane.showMessageDialog(null, "incorrect number: ");
            System.exit(1);


        }
    }

    public void draw() {
        background(0, 0, 0);
        fill(0, 0, 0);
        stroke(192, 192, 192);
        rect(rectX, rectY, 800, 800);
        fill(0, 0, 0);
        for (int i = 0; i < radius; i++) {
            if (i % 2 == 0) {
                for (int l = 0; l < radius; l++) {
                    if (l % 2 == 0) {
                        fill(255, 255, 255);
                    } else {

                        fill(1, 50, 32);

                    }
                    float a = rectX + i * 800 / radius;
                    float b = rectX + l * 800 / radius;
                    if (mouseX > rectX && mouseX < a &&  mouseY > rectY && mouseX < b) {
                        fill(255,255,0);
                        text("Row: " + row + "Column: " + column + "Color: "  ,textPosX, textPosY);
                        stroke(2);

                    }
                    rect(rectX + i * 800 / radius, rectY + l * 800 / radius, 800 / radius, 800 / radius);
                }
            } else {
                for (int l = 0; l < radius; l++) {
                    if (l % 2 == 0) {
                        fill(1, 50, 32);

                    } else {
                        fill(255, 255, 255);
                    }
                    rect(rectX + i * 800 / radius, rectY + l * 800 / radius, 800 / radius, 800 / radius);
                    ellipse(mouseX,mouseY,100,100);

                }
            }
        }



    }


    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}



