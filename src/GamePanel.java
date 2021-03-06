import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class GamePanel extends javax.swing.JPanel implements ActionListener {

    Player player;

    SpawnBlock sp;

    House house;

    DayNight dayNight;

    Planting planting;

    Farm farm;

    FarmSquares farmSquares;

    FPSCounter fpsCounter;

    /**/ //Declaring Timer object as gameTimer
    Timer gameTimer;
    /**/

    /**/ //GamePanel constructor
    public GamePanel() throws IOException, FontFormatException {

        player = new Player(900,100,this);
        sp = new SpawnBlock(900,100,this);
        house = new House(900, 180,this);
        dayNight = new DayNight();
        planting = new Planting();
        farm = new Farm();
        farmSquares = new FarmSquares();
        fpsCounter = new FPSCounter();

        gameTimer = new Timer();
        gameTimer.schedule(new TimerTask() {

            @Override
            public void run() {
                //sp.set();
                fpsCounter.set();
                house.set();
                player.set();
                planting.set();
                dayNight.set();
                farmSquares.set();
                repaint();
            }
        }, 0, 17);

    }
    /**/

    /**/ // Function to paint the panel window
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        farmSquares.draw(g2d);
        planting.draw(g2d);
        farm.draw(g2d);
        sp.draw(g2d);
        player.draw(g2d);
        house.draw(g2d);
        fpsCounter.draw(g2d);
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
        if(e.getKeyChar() == 'e' || e.getKeyChar() == 'E'){
            player.keyE = true;
        }
        if(e.getKeyChar() == 'b' || e.getKeyChar() == 'B'){
            player.keyB = true;
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
        if(e.getKeyChar() == 'e' || e.getKeyChar() == 'E'){
            player.keyE = false;
        }
        if(e.getKeyChar() == 'b' || e.getKeyChar() == 'B'){
            player.keyB = false;
        }
        if(e.getKeyCode() == 27){
            player.keyEsc = false;
        }
    }
    /**/
}
