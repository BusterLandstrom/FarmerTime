import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FarmSquares{

    int x = 370;
    int y = 170;
    int size = 50;

    int startXVal = 370;
    int startYVal = 170;
    int rlSize = 400;
    int aSize = 50;

    int setTime = 8;

    int modifier = 0;
    boolean canDo = true;

    ArrayList<Integer> xVal = new ArrayList<>();
    ArrayList<Integer> yVal = new ArrayList<>();

    public static ArrayList<Rectangle> squareHitBoxArray = new ArrayList<>();

    final BufferedImage squareSprites = ImageIO.read(new File("Sprites\\plantTile.png"));

    /**/ //Declaring the Island sprite
    final BufferedImage islandSprite = ImageIO.read(new File("Sprites\\islandImg.png"));
    /**/

    public FarmSquares() throws IOException {



    }

    void set() {

        size = (int) (aSize * Player.screenMultiplier);

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
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(0) * Player.screenMultiplier), (int) (yVal.get(0) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(1) * Player.screenMultiplier), (int) (yVal.get(0) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(2) * Player.screenMultiplier), (int) (yVal.get(0) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(3) * Player.screenMultiplier), (int) (yVal.get(0) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(4) * Player.screenMultiplier), (int) (yVal.get(0) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(5) * Player.screenMultiplier), (int) (yVal.get(0) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(6) * Player.screenMultiplier), (int) (yVal.get(0) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(7) * Player.screenMultiplier), (int) (yVal.get(0) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(0) * Player.screenMultiplier), (int) (yVal.get(1) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(1) * Player.screenMultiplier), (int) (yVal.get(1) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(2) * Player.screenMultiplier), (int) (yVal.get(1) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(3) * Player.screenMultiplier), (int) (yVal.get(1) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(4) * Player.screenMultiplier), (int) (yVal.get(1) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(5) * Player.screenMultiplier), (int) (yVal.get(1) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(6) * Player.screenMultiplier), (int) (yVal.get(1) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(7) * Player.screenMultiplier), (int) (yVal.get(1) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(0) * Player.screenMultiplier), (int) (yVal.get(2) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(1) * Player.screenMultiplier), (int) (yVal.get(2) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(2) * Player.screenMultiplier), (int) (yVal.get(2) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(3) * Player.screenMultiplier), (int) (yVal.get(2) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(4) * Player.screenMultiplier), (int) (yVal.get(2) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(5) * Player.screenMultiplier), (int) (yVal.get(2) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(6) * Player.screenMultiplier), (int) (yVal.get(2) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(7) * Player.screenMultiplier), (int) (yVal.get(2) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(0) * Player.screenMultiplier), (int) (yVal.get(3) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(1) * Player.screenMultiplier), (int) (yVal.get(3) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(2) * Player.screenMultiplier), (int) (yVal.get(3) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(3) * Player.screenMultiplier), (int) (yVal.get(3) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(4) * Player.screenMultiplier), (int) (yVal.get(3) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(5) * Player.screenMultiplier), (int) (yVal.get(3) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(6) * Player.screenMultiplier), (int) (yVal.get(3) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(7) * Player.screenMultiplier), (int) (yVal.get(3) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(0) * Player.screenMultiplier), (int) (yVal.get(4) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(1) * Player.screenMultiplier), (int) (yVal.get(4) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(2) * Player.screenMultiplier), (int) (yVal.get(4) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(3) * Player.screenMultiplier), (int) (yVal.get(4) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(4) * Player.screenMultiplier), (int) (yVal.get(4) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(5) * Player.screenMultiplier), (int) (yVal.get(4) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(6) * Player.screenMultiplier), (int) (yVal.get(4) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(7) * Player.screenMultiplier), (int) (yVal.get(4) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(0) * Player.screenMultiplier), (int) (yVal.get(5) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(1) * Player.screenMultiplier), (int) (yVal.get(5) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(2) * Player.screenMultiplier), (int) (yVal.get(5) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(3) * Player.screenMultiplier), (int) (yVal.get(5) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(4) * Player.screenMultiplier), (int) (yVal.get(5) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(5) * Player.screenMultiplier), (int) (yVal.get(5) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(6) * Player.screenMultiplier), (int) (yVal.get(5) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(7) * Player.screenMultiplier), (int) (yVal.get(5) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(0) * Player.screenMultiplier), (int) (yVal.get(6) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(1) * Player.screenMultiplier), (int) (yVal.get(6) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(2) * Player.screenMultiplier), (int) (yVal.get(6) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(3) * Player.screenMultiplier), (int) (yVal.get(6) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(4) * Player.screenMultiplier), (int) (yVal.get(6) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(5) * Player.screenMultiplier), (int) (yVal.get(6) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(6) * Player.screenMultiplier), (int) (yVal.get(6) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(7) * Player.screenMultiplier), (int) (yVal.get(6) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(0) * Player.screenMultiplier), (int) (yVal.get(7) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(1) * Player.screenMultiplier), (int) (yVal.get(7) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(2) * Player.screenMultiplier), (int) (yVal.get(7) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(3) * Player.screenMultiplier), (int) (yVal.get(7) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(4) * Player.screenMultiplier), (int) (yVal.get(7) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(5) * Player.screenMultiplier), (int) (yVal.get(7) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(6) * Player.screenMultiplier), (int) (yVal.get(7) * Player.screenMultiplier), size, size));
                squareHitBoxArray.add(new Rectangle((int) (xVal.get(7) * Player.screenMultiplier), (int) (yVal.get(7) * Player.screenMultiplier), size, size));
                canDo = false;
            }
        }
    }

    void draw(Graphics2D g2d){
        g2d.drawImage(islandSprite,0, 0, (int) (1280 * Player.screenMultiplier), (int) (720 * Player.screenMultiplier), null);
        g2d.drawImage(squareSprites, (int) (x * Player.screenMultiplier), (int) (y * Player.screenMultiplier), (int) (rlSize * Player.screenMultiplier), (int) (rlSize * Player.screenMultiplier),null);

    }

}
