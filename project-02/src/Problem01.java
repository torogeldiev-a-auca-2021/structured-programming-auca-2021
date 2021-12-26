import processing.core.*;

public class Problem01 extends PApplet {
    int[][]game15 = new int[4][4];

    public void settings() {
        fullScreen();
    }

    public void setup() {
        initgame15(game15);
    }

    public void draw() {
        background(0,0,0);
        pushMatrix();
        translate(width / 2f , height / 2f);
        for(int i = 0 ; i < game15.length; i++){
            for(int j = 0; j  < game15.length;j++){
                fill(0,0,255);
                rect(-250,-250,125,125);

            }
        }
        popMatrix();
        background(0, 0, 0);
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }
    public static void initgame15(int[][] game15) {
        int counter = 0;
        for (int i = 0; i < game15.length; i++) {
            for (int j = 0; j < game15[i].length; j++, counter++) {
                game15[i][j] = counter;
            }
        }
    }

}
