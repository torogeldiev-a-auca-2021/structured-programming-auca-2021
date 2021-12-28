import processing.core.*;

import javax.swing.*;

public class Problem05 extends PApplet {
    float radius;
    float textPosX;
    float textPosY;
    float rectX;
    float rectY;
    float size;
    String Color;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        textAlign(CENTER);
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
            for (int j = 0; j < radius; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 1) {
                        fill(0);
                        Color = "black";
                    } else {
                        fill(255, 255, 255);
                        Color = "white";
                    }
                } else {
                    if (j % 2 == 1) {
                        fill(255, 255, 255);
                        Color = "white";
                    } else {
                        fill(0);
                        Color = "black";
                    }
                }
                noStroke();
                rect(rectX + i * 800 / radius, rectY + j * 800 / radius, 800 / radius, 800 / radius);
                if (mouseX >= rectX + i * 800 / radius && mouseX < rectX + i * 800 / radius + 800 / radius
                        && mouseY >= rectY + j * 800 / radius && mouseY < rectY + j * 800 / radius + 800 / radius) {
                    fill(255, 255, 0);
                    text("Row: " + (j + 1) + " Column: " + (i + 1) + " Color: " + Color, width / 2f, 25);
                    if (Color.equals("black")) {
                        fill(0);
                    } else {
                        fill(255);
                    }
                    strokeWeight(3);
                    stroke(255, 0, 0);
                    rect(rectX + i * 800 / radius + 2, rectY + j * 800 / radius + 2, 800 / radius - 10, 800 / radius- 10);
                }
            }
        }

    }


    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}



