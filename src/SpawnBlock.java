import java.awt.*;
import java.io.IOException;

public class SpawnBlock {

    GamePanel gp;

    int x;
    int y;
    int width;
    int height;

    public SpawnBlock(int x, int y, GamePanel gp) throws IOException {
        this.gp = gp;
        this.x = x;
        this.y = y;

        width = 50;
        height = 50;
    }

    public void draw(Graphics2D g2d){
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(x,y,width,height);
    }
}
