import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player {

    GamePanel gp;

    /**/ //Character
    int x;
    int y;
    int height;
    int width;
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
    }


    public void draw(Graphics2D g2d){

        g2d.setColor(Color.RED);
        g2d.fillRect(x,y,width,height);
    }
}
