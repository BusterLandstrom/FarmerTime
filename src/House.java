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

    GamePanel gp;

    public static Rectangle houseHitBox;

    /**/ //Declaring the house sprite
    final BufferedImage houseSprite = ImageIO.read(new File("G:\\FarmerTime\\Sprites\\house.png"));
    /**/

    public House (int x, int y, GamePanel gp) throws IOException{
        /**/ //Setting all variables same as parent variable
        this.gp = gp;
        this.x = x;
        this.y = y;
        /**/

        width = 200;
        height = 400;
        houseHitBox = new Rectangle(x + 50 ,y + 50,width - 50,height - 50);
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(houseSprite, x, y, width, height,null);
    }
}
