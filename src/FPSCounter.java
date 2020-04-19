import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FPSCounter {

    public static long nextSecond = System.currentTimeMillis() + 1000;
    public static int framesInLastSecond = 0;
    public static int framesInCurrentSecond = 0;



    Font base = Font.createFont(Font.TRUETYPE_FONT, new File("Sprites\\FFFFORWA.TTF"));
    Font real = base.deriveFont(Font.PLAIN, 32);

    public FPSCounter() throws IOException, FontFormatException {

    }

    void  set(){

        long currentTime = System.currentTimeMillis();
        if(currentTime > nextSecond){
            nextSecond += 1000;
            framesInLastSecond = framesInCurrentSecond;
            framesInCurrentSecond = 0;

        }

        framesInCurrentSecond++;
    }

    void draw (Graphics2D g2d){
        g2d.setFont(real);
        g2d.setColor(Color.RED);
        g2d.drawString( framesInLastSecond +" FPS", 20, 60);
    }
}
