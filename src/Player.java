import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player {

    public static double screenMultiplier = 1;
    public static int screenSizeX;
    public static int screenSizeY;
    boolean screenChange;
    boolean screenChangeReady = true;
    GamePanel gp;

    String dayString;
    int day;

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
    boolean keyEsc;
    int direction = 1;
    boolean menu = false;
    boolean nextDayReady = true;
    /**/

    Font ttfBase = Font.createFont(Font.TRUETYPE_FONT, new File("G:\\FarmerTime\\Sprites\\FFFFORWA.TTF"));
    Font ttfReal = ttfBase.deriveFont(Font.PLAIN, 32);

    /**/ //X and Y speed of character
    double xs;
    double ys;
    int maxSpeed = 8;
    /**/

    KeyEvent e;

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

    /**/ //Declaring the emptyButton sprite
    final BufferedImage emptySprite = ImageIO.read(new File("G:\\FarmerTime\\Sprites\\empty.png"));
    /**/



    /**/ //Instantiating the player through constructor
    public Player(int x, int y, GamePanel gp) throws IOException, FontFormatException {
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

        ttfReal = ttfBase.deriveFont(Font.PLAIN, (int) (22 * screenMultiplier));

        dayString = "Days: " + day;

        buttonClicks();

        screenSizeX = (int) (1280 * screenMultiplier);
        screenSizeY = (int) (720 * screenMultiplier);

        if(screenChange) {
            if(!screenChangeReady) {
                if (screenMultiplier == 1) {
                    screenMultiplier = 1.5;
                    screenChange = false;
                } else if (screenMultiplier == 1.5) {
                    screenMultiplier = 2;
                    screenChange = false;
                } else if (screenMultiplier == 2) {
                    screenMultiplier = 2.5;
                    screenChange = false;
                } else if (screenMultiplier == 2.5) {
                    screenMultiplier = 3;
                    screenChange = false;
                }
            }
        }

        System.out.println(screenChangeReady);

        if(charHitBox.intersects(House.houseHitBox)){
            menu = true;
        } else if (!(charHitBox.intersects(House.houseHitBox))){
            menu = false;
            nextDayReady = true;
            screenChangeReady = true;
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


        if(y >= (634 * screenMultiplier)){
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

        if (x >= (1216 * screenMultiplier)) {
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

        if(direction == 1) {
            charHitBox.x = x;
        } else if (direction == 0){
            charHitBox.x = (int) (x +(width * screenMultiplier));
        }
        charHitBox.y = y;

    }

    void buttonClicks(){
        gp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(menu) {
                    if (e.getX() >= (int) (50 * screenMultiplier) && e.getX() <= (int) (150 * screenMultiplier) && e.getY() >= (int) (50 * screenMultiplier) && e.getY() <= (int) (100 * screenMultiplier)) {
                        if(nextDayReady) {
                            day = day + 1;
                            nextDayReady = false;
                        }
                    }
                    if (e.getX() >= (int) (50 * screenMultiplier) && e.getX() <= (int) (150 * screenMultiplier) && e.getY() >= (int) (120 * screenMultiplier) && e.getY() <= (int) (170 * screenMultiplier)) {
                        System.out.println("Seeds pressed");
                    }

                    if (e.getX() >= (int) (50 * screenMultiplier) && e.getX() <= (int) (150 * screenMultiplier) && e.getY() >= (int) (190 * screenMultiplier) && e.getY() <= (int) (240 * screenMultiplier)) {
                        if(screenChangeReady = true) {
                            screenChange = true;
                            screenChangeReady = false;
                        }
                    }
                }
            }
        });
    }


    public void draw(Graphics2D g2d){
        g2d.setFont(ttfReal);
        g2d.drawString(dayString, (int) (530 * screenMultiplier), (int) (55 * screenMultiplier));
        if(direction == 0){
            g2d.setColor(Color.RED);
            g2d.drawImage(charSprite, (int) (x + (width * screenMultiplier)), (int)(y * screenMultiplier), (int) (-width * screenMultiplier), (int) (height * screenMultiplier), null);
            g2d.drawRect(charHitBox.x, (int)(y * screenMultiplier), (int) (-width * screenMultiplier), (int) (height * screenMultiplier));
        } else {
            g2d.setColor(Color.RED);
            g2d.drawImage(charSprite, x, (int) (y*screenMultiplier), (int) (width*screenMultiplier), (int) (height*screenMultiplier), null);
            g2d.drawRect(charHitBox.x, (int)(y*screenMultiplier), (int) (width*screenMultiplier), (int) (height*screenMultiplier));
        }
        if(menu){
            g2d.setColor(Color.BLACK);
            g2d.drawImage(sleepSprite, (int) (50 * screenMultiplier), (int) (50 * screenMultiplier), (int) (100 * screenMultiplier), (int) (50 * screenMultiplier), null);
            g2d.drawImage(seedsSprite, (int) (50 * screenMultiplier), (int) (120 * screenMultiplier), (int) (100 * screenMultiplier), (int) (50 * screenMultiplier), null);
            g2d.drawImage(emptySprite, (int) (50 * screenMultiplier), (int) (190 * screenMultiplier), (int) (100 * screenMultiplier), (int) (50 * screenMultiplier), null);

            g2d.drawString("" + screenSizeY + "p", (int) (64 * screenMultiplier), (int) (229 * screenMultiplier));
        }
    }
}
