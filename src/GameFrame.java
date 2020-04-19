import java.awt.*;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class GameFrame extends javax.swing.JFrame {

    public static Color bgc;

    Dimension sc;


    /**/ //GameFrame constructor
    public GameFrame() throws IOException, FontFormatException {

        GamePanel gp = new GamePanel();

        /**/ //Declaring Timer object as gameTimer
        Timer gameTimer;
        /**/


        gameTimer = new Timer();
        gameTimer.schedule(new TimerTask() {
                   @Override
                   public void run() {
                       gp.setBackground(bgc);
                       gp.setLocation(Player.screenX,Player.screenY);
                       gp.setSize((int) (1280 * Player.screenMultiplier), (int) (720 * Player.screenMultiplier));
                   }
        }, 0, 17);
        gp.setVisible(true);
        this.add(gp);
        addKeyListener(new KeyPress(gp));
    }
    /**/
}
