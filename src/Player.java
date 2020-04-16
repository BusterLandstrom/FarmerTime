import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
    boolean menu = false;
    /**/

    House house;

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

    /**/ //Declaring the sleep sprite
    final BufferedImage sleepSprite = ImageIO.read(new File("G:\\FarmerTime\\Sprites\\sleep.png"));
    /**/

    /**/ //Declaring the seeds sprite
    final BufferedImage seedsSprite = ImageIO.read(new File("G:\\FarmerTime\\Sprites\\seeds.png"));
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


    public void set() {

        Move();

        if(charHitBox.intersects(house.houseHitBox)){
            menu = true;
        } else{
            menu = false;
        }
    }

    void Move(){

        if (keyLeft && keyRight || !keyLeft && !keyRight) {
            xs *= 0.8;
        } else if (keyLeft && !keyRight) {
            xs--;
            direction = 0;
        } else if (!keyLeft && keyRight) {
            xs++;
            direction = 1;
        }

        if (keyUp && keyDown || !keyUp && !keyDown) {
            ys *= 0.8;
        } else if (keyUp && !keyDown) {
            ys--;
        } else if (!keyUp && keyDown) {
            ys++;
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


        if (xs > 0 && xs < .75) {
            xs = 0;
        }
        if (xs < 0 && xs > -.75) {
            xs = 0;
        }

        if (ys > 0 && ys < .75) {
            ys = 0;
        }
        if (ys < 0 && ys > -.75) {
            ys = 0;
        }

        if (xs > maxSpeed) {
            xs = maxSpeed;
        }
        if (xs < -maxSpeed) {
            xs = -maxSpeed;
        }

        if (ys > maxSpeed) {
            ys = maxSpeed;
        }
        if (ys < -maxSpeed) {
            ys = -maxSpeed;
        }

        if (x >= 1216) {
            charHitBox.x -= xs;
            charHitBox.x -= Math.signum(xs);
            xs = 0;
            x = charHitBox.x;
        } else if (x <= -1) {
            charHitBox.x -= xs;
            charHitBox.x -= Math.signum(xs);
            xs = 0;
            x = charHitBox.x;
        }

        charHitBox.x += xs;
        charHitBox.y += ys;

        x += xs;
        y += ys;

        charHitBox.x = x;
        charHitBox.y = y;

        gp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(menu) {
                    if (e.getX() >= 50 && e.getX() <= 150 && e.getY() >= 50 && e.getY() <= 100) {
                        System.out.println("Sleep pressed");
                    }
                    if (e.getX() >= 50 && e.getX() <= 150 && e.getY() >= 120 && e.getY() <= 170) {
                        System.out.println("Seedsd pressed");
                    }
                }
            }
        });

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
        if(menu){
            g2d.drawImage(sleepSprite, 50, 50, 100, 50, null);
            g2d.drawImage(seedsSprite, 50, 120, 100, 50, null);
        }
    }
}
