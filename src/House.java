import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class House {

    int x;
    int y;
    int width;
    int height;

    /**/ //GamePanel object cast as gp
    GamePanel gp;
    /**/

    public static Rectangle houseHitBox;

    /**/ //Declaring the house sprite
    final BufferedImage houseSprite = ImageIO.read(new File("Sprites\\house.png"));
    /**/

    public House (int x, int y, GamePanel gp) throws IOException{
        /**/ //Setting all variables same as parent variable
        this.gp = gp;
        this.x = x;
        this.y = y;
        /**/

        width = 200;
        height = 400;
        houseHitBox = new Rectangle((int) (x * Player.screenMultiplier),(int) (y * Player.screenMultiplier),(int) (width * Player.screenMultiplier),(int) (height * Player.screenMultiplier));
    }

    public void set(){
        houseHitBox.x = (int) (x * Player.screenMultiplier);
        houseHitBox.y = (int) (y * Player.screenMultiplier);
        houseHitBox.width = (int) (width * Player.screenMultiplier);
        houseHitBox.height = (int) (height * Player.screenMultiplier);
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(houseSprite, (int) (x * Player.screenMultiplier), (int) (y * Player.screenMultiplier), (int) (width * Player.screenMultiplier), (int) (height * Player.screenMultiplier),null);
    }
}
