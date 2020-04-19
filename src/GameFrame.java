import java.awt.Color;
import java.awt.FontFormatException;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class GameFrame extends javax.swing.JFrame {

    public static Color bgc;

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
                       gp.setLocation(Player.screenX,Player.screenX);
                   }
        }, 0, 17);
        gp.setLocation(0,0);
        gp.setVisible(true);
        gp.setSize(this.getSize());
        this.add(gp);
        addKeyListener(new KeyPress(gp));
    }
    /**/
}
