import java.awt.*;

public class Farm {

    int squareWidth;
    int squareHeight;
    int squareX;
    int squareY;

    int x;
    int y;
    int width;
    int height;

    static Rectangle farmHitBox;

    public Farm(){


        squareWidth = 50;
        squareHeight = 50;

        x = 100;
        y = 100;
        width = 400;
        height = 400;
        farmHitBox = new Rectangle(x, y, width, height);

    }

    void set(){

    }

    void draw(Graphics2D g2d){
        g2d.drawRect(x, y, width, height);
    }
}
