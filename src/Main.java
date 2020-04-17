import java.awt.*;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import static java.awt.Toolkit.getDefaultToolkit;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Main {

    /**/ //Main function to initiate all other functions and set base values
    public static void main(String[] args) throws IOException, FontFormatException {
        GameFrame gf = new GameFrame();

        /**/ //Declaring Timer object as gameTimer
        Timer gameTimer;
        /**/

        gameTimer = new Timer();
        gameTimer.schedule(new TimerTask() {

            @Override
            public void run() {
                gf.setSize(Player.screenSizeX, Player.screenSizeY);
            }
        }, 0, 17);

        gf.setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\FarmerTime\\Sprites\\icon-export.png"));
        Dimension screenSize = getDefaultToolkit().getScreenSize();
        gf.setLocation((screenSize.width/6 - gf.getSize().width/6), (screenSize.height/6 - gf.getSize().height/6));

        gf.setResizable(false);
        gf.setVisible(true);
        gf.setTitle("FarmerTime");

        gf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
    /**/
}
