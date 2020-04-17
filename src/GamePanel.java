import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class GamePanel extends javax.swing.JPanel implements ActionListener {

    Player player;

    SpawnBlock sp;

    House house;

    /**/ //Declaring Timer object as gameTimer
    Timer gameTimer;
    /**/

    /**/ //GamePanel constructor
    public GamePanel() throws IOException, FontFormatException {


        player = new Player(975,100,this);
        sp = new SpawnBlock(975,100,this);
        house = new House(975, 200,this);

        gameTimer = new Timer();
        gameTimer.schedule(new TimerTask() {

            @Override
            public void run() {
                //sp.set();
                house.set();
                player.set();
                repaint();
            }
        }, 0, 17);

    }
    /**/

    /**/ // Function to paint the panel window
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        sp.draw(g2d);
        player.draw(g2d);
        house.draw(g2d);
    }
    /**/

    /**/ //Action event handler
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar() == 'w' || e.getKeyChar() == 'W'){
            player.keyUp = true;
        }
        if(e.getKeyChar() == 'a' || e.getKeyChar() == 'A'){
            player.keyLeft = true;
        }
        if(e.getKeyChar() == 'd' || e.getKeyChar() == 'D'){
            player.keyRight = true;
        }
        if(e.getKeyChar() == 's' || e.getKeyChar() == 'S'){
            player.keyDown = true;
        }
        if(e.getKeyCode() == 27){
            player.keyEsc = true;
        }
    }

    public void keyReleased(KeyEvent e) {
        if(e.getKeyChar() == 'w' || e.getKeyChar() == 'W'){
            player.keyUp = false;
        }
        if(e.getKeyChar() == 'a' || e.getKeyChar() == 'A'){
            player.keyLeft = false;
        }
        if(e.getKeyChar() == 'd' || e.getKeyChar() == 'D'){
            player.keyRight = false;
        }
        if(e.getKeyChar() == 's' || e.getKeyChar() == 'S'){
            player.keyDown = false;
        }
        if(e.getKeyCode() == 27){
            player.keyEsc = false;
        }
    }
    /**/
}
