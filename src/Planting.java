import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Planting {

    final BufferedImage dirtSprite= ImageIO.read(new File("Sprites\\dirt.png"));

    int x = 0;
    int y = 0;
    int width = 50;
    int height = 50;

    int dx;
    int dy;

    public Planting() throws IOException {

    }

    void set(){
        if(Player.charHitBox.intersects(Farm.farmHitBox)){
            if(Player.keyE){
                if(Player.canPlant){
                    if(Player.seedTimeout < 0) {
                        x = Player.x;
                        y = Player.y;
                    }
                }
            }
        }
    }

    void draw(Graphics2D g2d){
        g2d.drawImage(dirtSprite, x, y, width, height, null);
    }
}
