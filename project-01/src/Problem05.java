import processing.core.*;
import java.util.*;
import javax.swing.*;

public class Problem05 extends PApplet {
    float radius;
    float textPosX;
    float textPosY;
    float rectX;
    float rectY;



    public void settings() {
        fullScreen();
    }

    public void setup() {
        textSize(30);
        textPosX = width / 2f - width / 9f;
        textPosY = height / 2f - height / 2.2f;
        rectX =  width / 2f - width / 4f;
        rectY = height / 2f - height / 2.5f;
        try {
            String strRadius = JOptionPane.showInputDialog("Enter the board's size [4,12]: ");
            radius = Float.parseFloat(strRadius);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"incorrect input: " );
            System.exit(1);
        }

         if(radius < 4 || radius > 12){
             JOptionPane.showMessageDialog(null,"incorrect number: ");
             System.exit(1);

             //for(int i  = 0 ; i < radius; i++) {

             //}
         }
    }

    public void draw() {
        background(0, 0, 0);
        fill(255,255,0);
        text("Row: ; Column:  ; Color: ;",textPosX, textPosY);

        stroke(192,192,192);
        rect(rectX, rectY,800,800);
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}