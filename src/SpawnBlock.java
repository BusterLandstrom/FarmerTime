import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SpawnBlock {

    /**/ //GamePanel object cast as gp
    GamePanel gp;
    /**/

    int x;
    int y;
    int width;
    int height;

    /**/ //Declaring the spawn sprite
    final BufferedImage spawnSprite = ImageIO.read(new File("Sprites\\start.png"));
    /**/

    public SpawnBlock(int x, int y, GamePanel gp) throws IOException {
        this.gp = gp;
        this.x = x;
        this.y = y;

        width = 50;
        height = 50;
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(spawnSprite, (int) (x * Player.screenMultiplier), (int) (y * Player.screenMultiplier), (int) (width * Player.screenMultiplier), (int) (height * Player.screenMultiplier), null);
    }
}
