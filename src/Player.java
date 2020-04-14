import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player {

    GamePanel gp;

    /**/ //Character base variables
    int x;
    int y;
    int height;
    int width;
    /**/

    /**/ //Checking if movement button is pressed
    boolean keyUp;
    boolean keyLeft;
    boolean keyRight;
    boolean keyDown;
    int direction = 1;
    /**/

    /**/ //X and Y speed of character
    double xs;
    double ys;
    int maxSpeed = 8;
    /**/

    /**/ //Setting up character hit box
    Rectangle charHitBox;
    /**/

    /**/ //Declaring the player sprite
    final BufferedImage charSprite = ImageIO.read(new File("G:\\FarmerTime\\Sprites\\player.png"));
    /**/



    /**/ //Instantiating the player through constructor
    public Player(int x, int y, GamePanel gp) throws IOException {
        /**/ //Setting all variables same as parent variable
        this.gp = gp;
        this.x = x;
        this.y = y;
        /**/


        /**/ //Setting the character width, height and hit box
        width = 50;
        height = 50;
        charHitBox = new Rectangle(x,y,width,height);
        /**/
    }
    /**/


    public void set(){
        if(keyLeft && keyRight || !keyLeft && !keyRight){
            xs *= 0.8;
        } else if (keyLeft && !keyRight){
            xs--;
            direction = 0;
        } else if (!keyLeft && keyRight){
            xs++;
            direction = 1;
        }

        if(keyUp && keyDown || !keyUp && !keyDown){
            ys *= 0.8;
        } else if (keyUp && !keyDown){
            ys--;
        } else if (!keyUp && keyDown){
            ys++;
        }

        if(xs > 0 && xs < .75){
            xs = 0;
        }
        if(xs < 0 && xs > -.75){
            xs = 0;
        }

        if(xs > maxSpeed) {
            xs = maxSpeed;
        }
        if(xs < -maxSpeed) {
            xs = -maxSpeed;
        }

        if(ys > maxSpeed) {
            ys = maxSpeed;
        }
        if(ys < -maxSpeed) {
            ys = -maxSpeed;
        }

        if(x >= 1216){
            charHitBox.x -= xs;
            charHitBox.x -= Math.signum(xs);
            xs = 0;
            x = charHitBox.x;
        } else if(x <= -1){
            charHitBox.x -= xs;
            charHitBox.x -= Math.signum(xs);
            xs = 0;
            x = charHitBox.x;
        }

        if(y >= 634){
            charHitBox.y -= ys;
            charHitBox.y -= Math.signum(ys);
            ys = 0;
            y = charHitBox.y;
        } else if(y <= -1){
            charHitBox.y -= ys;
            charHitBox.y -= Math.signum(ys);
            ys = 0;
            y = charHitBox.y;
        }

        charHitBox.x += xs;
        charHitBox.y += ys;

        x += xs;
        y += ys;

        charHitBox.x = x;
        charHitBox.y = y;
    }


    public void draw(Graphics2D g2d){
        if(direction == 0){
            g2d.setColor(Color.RED);
            g2d.drawImage(charSprite, x + width, y, -width, height, null);
            g2d.drawRect(x,y,width,height);
        } else {
            g2d.setColor(Color.RED);
            g2d.drawImage(charSprite, x, y, width, height, null);
            g2d.drawRect(x, y, width, height);
        }
    }
}
