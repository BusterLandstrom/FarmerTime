import javafx.scene.shape.Rectangle;

import java.awt.*;
import java.util.ArrayList;

public class FarmSquares{

    int x = 370;
    int y = 170;
    int size = 50;

    int startXVal = 370;
    int startYVal = 170;

    int setTime = 8;

    int modifier = 0;
    boolean canDo = true;

    ArrayList<Integer> xVal = new ArrayList<>();
    ArrayList<Integer> yVal = new ArrayList<>();

    public static ArrayList<Rectangle> squareHitBoxArray = new ArrayList<>();

    public FarmSquares(){



    }

    void set() {

        if (setTime > 0) {
            if (modifier == 0) {
                xVal.add(x);
            } else {
                startXVal = startXVal + 50;
                xVal.add(startXVal);
            }
        }

        if (setTime > 0) {
            if (modifier == 0) {
                yVal.add(y);
                modifier = 1;
            } else {
                startYVal = startYVal + 50;
                yVal.add(startYVal);
            }
        }

        if (setTime < -1) {
            setTime = -1;
        } else {
            setTime -= 1;
        }
        if (xVal.size() == 8){
            if (canDo) {
                squareHitBoxArray.add(new Rectangle(xVal.get(0), yVal.get(0), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(1), yVal.get(0), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(2), yVal.get(0), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(3), yVal.get(0), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(4), yVal.get(0), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(5), yVal.get(0), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(6), yVal.get(0), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(7), yVal.get(0), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(0), yVal.get(1), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(1), yVal.get(1), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(2), yVal.get(1), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(3), yVal.get(1), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(4), yVal.get(1), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(5), yVal.get(1), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(6), yVal.get(1), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(7), yVal.get(1), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(0), yVal.get(2), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(1), yVal.get(2), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(2), yVal.get(2), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(3), yVal.get(2), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(4), yVal.get(2), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(5), yVal.get(2), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(6), yVal.get(2), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(7), yVal.get(2), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(0), yVal.get(3), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(1), yVal.get(3), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(2), yVal.get(3), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(3), yVal.get(3), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(4), yVal.get(3), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(5), yVal.get(3), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(6), yVal.get(3), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(7), yVal.get(3), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(0), yVal.get(4), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(1), yVal.get(4), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(2), yVal.get(4), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(3), yVal.get(4), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(4), yVal.get(4), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(5), yVal.get(4), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(6), yVal.get(4), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(7), yVal.get(4), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(0), yVal.get(5), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(1), yVal.get(5), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(2), yVal.get(5), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(3), yVal.get(5), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(4), yVal.get(5), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(5), yVal.get(5), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(6), yVal.get(5), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(7), yVal.get(5), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(0), yVal.get(6), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(1), yVal.get(6), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(2), yVal.get(6), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(3), yVal.get(6), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(4), yVal.get(6), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(5), yVal.get(6), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(6), yVal.get(6), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(7), yVal.get(6), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(0), yVal.get(7), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(1), yVal.get(7), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(2), yVal.get(7), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(3), yVal.get(7), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(4), yVal.get(7), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(5), yVal.get(7), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(6), yVal.get(7), size, size));
                squareHitBoxArray.add(new Rectangle(xVal.get(7), yVal.get(7), size, size));
                canDo = false;
            }
        }

    }

    void draw(Graphics2D g2d){
        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(new Color(205,133,63));
        if(xVal.size() == 8) {
            g2d.drawRect(xVal.get(0), yVal.get(0), size, size);
            g2d.drawRect(xVal.get(1), yVal.get(0), size, size);
            g2d.drawRect(xVal.get(2), yVal.get(0), size, size);
            g2d.drawRect(xVal.get(3), yVal.get(0), size, size);
            g2d.drawRect(xVal.get(4), yVal.get(0), size, size);
            g2d.drawRect(xVal.get(5), yVal.get(0), size, size);
            g2d.drawRect(xVal.get(6), yVal.get(0), size, size);
            g2d.drawRect(xVal.get(7), yVal.get(0), size, size);
            g2d.drawRect(xVal.get(0), yVal.get(1), size, size);
            g2d.drawRect(xVal.get(1), yVal.get(1), size, size);
            g2d.drawRect(xVal.get(2), yVal.get(1), size, size);
            g2d.drawRect(xVal.get(3), yVal.get(1), size, size);
            g2d.drawRect(xVal.get(4), yVal.get(1), size, size);
            g2d.drawRect(xVal.get(5), yVal.get(1), size, size);
            g2d.drawRect(xVal.get(6), yVal.get(1), size, size);
            g2d.drawRect(xVal.get(7), yVal.get(1), size, size);
            g2d.drawRect(xVal.get(0), yVal.get(2), size, size);
            g2d.drawRect(xVal.get(1), yVal.get(2), size, size);
            g2d.drawRect(xVal.get(2), yVal.get(2), size, size);
            g2d.drawRect(xVal.get(3), yVal.get(2), size, size);
            g2d.drawRect(xVal.get(4), yVal.get(2), size, size);
            g2d.drawRect(xVal.get(5), yVal.get(2), size, size);
            g2d.drawRect(xVal.get(6), yVal.get(2), size, size);
            g2d.drawRect(xVal.get(7), yVal.get(2), size, size);
            g2d.drawRect(xVal.get(0), yVal.get(3), size, size);
            g2d.drawRect(xVal.get(1), yVal.get(3), size, size);
            g2d.drawRect(xVal.get(2), yVal.get(3), size, size);
            g2d.drawRect(xVal.get(3), yVal.get(3), size, size);
            g2d.drawRect(xVal.get(4), yVal.get(3), size, size);
            g2d.drawRect(xVal.get(5), yVal.get(3), size, size);
            g2d.drawRect(xVal.get(6), yVal.get(3), size, size);
            g2d.drawRect(xVal.get(7), yVal.get(3), size, size);
            g2d.drawRect(xVal.get(0), yVal.get(4), size, size);
            g2d.drawRect(xVal.get(1), yVal.get(4), size, size);
            g2d.drawRect(xVal.get(2), yVal.get(4), size, size);
            g2d.drawRect(xVal.get(3), yVal.get(4), size, size);
            g2d.drawRect(xVal.get(4), yVal.get(4), size, size);
            g2d.drawRect(xVal.get(5), yVal.get(4), size, size);
            g2d.drawRect(xVal.get(6), yVal.get(4), size, size);
            g2d.drawRect(xVal.get(7), yVal.get(4), size, size);
            g2d.drawRect(xVal.get(0), yVal.get(5), size, size);
            g2d.drawRect(xVal.get(1), yVal.get(5), size, size);
            g2d.drawRect(xVal.get(2), yVal.get(5), size, size);
            g2d.drawRect(xVal.get(3), yVal.get(5), size, size);
            g2d.drawRect(xVal.get(4), yVal.get(5), size, size);
            g2d.drawRect(xVal.get(5), yVal.get(5), size, size);
            g2d.drawRect(xVal.get(6), yVal.get(5), size, size);
            g2d.drawRect(xVal.get(7), yVal.get(5), size, size);
            g2d.drawRect(xVal.get(0), yVal.get(6), size, size);
            g2d.drawRect(xVal.get(1), yVal.get(6), size, size);
            g2d.drawRect(xVal.get(2), yVal.get(6), size, size);
            g2d.drawRect(xVal.get(3), yVal.get(6), size, size);
            g2d.drawRect(xVal.get(4), yVal.get(6), size, size);
            g2d.drawRect(xVal.get(5), yVal.get(6), size, size);
            g2d.drawRect(xVal.get(6), yVal.get(6), size, size);
            g2d.drawRect(xVal.get(7), yVal.get(6), size, size);
            g2d.drawRect(xVal.get(0), yVal.get(7), size, size);
            g2d.drawRect(xVal.get(1), yVal.get(7), size, size);
            g2d.drawRect(xVal.get(2), yVal.get(7), size, size);
            g2d.drawRect(xVal.get(3), yVal.get(7), size, size);
            g2d.drawRect(xVal.get(4), yVal.get(7), size, size);
            g2d.drawRect(xVal.get(5), yVal.get(7), size, size);
            g2d.drawRect(xVal.get(6), yVal.get(7), size, size);
            g2d.drawRect(xVal.get(7), yVal.get(7), size, size);
        }
    }

}
