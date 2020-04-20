import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Planting {

    final BufferedImage dirtSprite= ImageIO.read(new File("Sprites\\dirt.png"));

    int farmX = 0;
    int farmY = 0;
    int size = 50;

    static int plantTime = -1;

    static ArrayList<Integer> xArray = new ArrayList<>();
    static ArrayList<Integer> yArray = new ArrayList<>();

    public Planting() throws IOException {

        xArray.add(0);
        yArray.add(0);

    }

    void set(){

    }

    void draw(Graphics2D g2d){
        if (plantTime >= 0) {
            g2d.drawImage(dirtSprite, xArray.get(1), yArray.get(1), size, size, null);
        } if(plantTime >= 1) {
            g2d.drawImage(dirtSprite, xArray.get(2), yArray.get(2), size, size, null);
        } if(plantTime >= 2) {
            g2d.drawImage(dirtSprite, xArray.get(3), yArray.get(3), size, size, null);
        } if(plantTime >= 3) {
            g2d.drawImage(dirtSprite, xArray.get(4), yArray.get(4), size, size, null);
        } if(plantTime >= 4) {
            g2d.drawImage(dirtSprite, xArray.get(5), yArray.get(5), size, size, null);
        } if(plantTime >= 5) {
            g2d.drawImage(dirtSprite, xArray.get(6), yArray.get(6), size, size, null);
        } if(plantTime >= 6) {
            g2d.drawImage(dirtSprite, xArray.get(7), yArray.get(7), size, size, null);
        } if(plantTime >= 7) {
            g2d.drawImage(dirtSprite, xArray.get(8), yArray.get(8), size, size, null);
        } if(plantTime >= 8) {
            g2d.drawImage(dirtSprite, xArray.get(9), yArray.get(9), size, size, null);
        } if(plantTime >= 9) {
            g2d.drawImage(dirtSprite, xArray.get(10), yArray.get(10), size, size, null);
        } if(plantTime >= 10) {
            g2d.drawImage(dirtSprite, xArray.get(11), yArray.get(11), size, size, null);
        } if(plantTime >= 11) {
            g2d.drawImage(dirtSprite, xArray.get(12), yArray.get(12), size, size, null);
        } if(plantTime >= 12) {
            g2d.drawImage(dirtSprite, xArray.get(13), yArray.get(13), size, size, null);
        } if(plantTime >= 13) {
            g2d.drawImage(dirtSprite, xArray.get(14), yArray.get(14), size, size, null);
        } if(plantTime >= 14) {
            g2d.drawImage(dirtSprite, xArray.get(15), yArray.get(15), size, size, null);
        } if(plantTime >= 15) {
            g2d.drawImage(dirtSprite, xArray.get(16), yArray.get(16), size, size, null);
        } if(plantTime >= 16) {
            g2d.drawImage(dirtSprite, xArray.get(17), yArray.get(17), size, size, null);
        } if(plantTime >= 17) {
            g2d.drawImage(dirtSprite, xArray.get(18), yArray.get(18), size, size, null);
        } if(plantTime >= 18) {
            g2d.drawImage(dirtSprite, xArray.get(19), yArray.get(19), size, size, null);
        } if(plantTime >= 19) {
            g2d.drawImage(dirtSprite, xArray.get(20), yArray.get(20), size, size, null);
        } if(plantTime >= 20) {
            g2d.drawImage(dirtSprite, xArray.get(21), yArray.get(21), size, size, null);
        } if(plantTime >= 21) {
            g2d.drawImage(dirtSprite, xArray.get(22), yArray.get(22), size, size, null);
        } if(plantTime >= 22) {
            g2d.drawImage(dirtSprite, xArray.get(23), yArray.get(23), size, size, null);
        } if(plantTime >= 23) {
            g2d.drawImage(dirtSprite, xArray.get(24), yArray.get(24), size, size, null);
        } if(plantTime >= 24) {
            g2d.drawImage(dirtSprite, xArray.get(25), yArray.get(25), size, size, null);
        } if(plantTime >= 25) {
            g2d.drawImage(dirtSprite, xArray.get(26), yArray.get(26), size, size, null);
        } if(plantTime >= 26) {
            g2d.drawImage(dirtSprite, xArray.get(27), yArray.get(27), size, size, null);
        } if(plantTime >= 27) {
            g2d.drawImage(dirtSprite, xArray.get(28), yArray.get(28), size, size, null);
        } if(plantTime >= 28) {
            g2d.drawImage(dirtSprite, xArray.get(29), yArray.get(29), size, size, null);
        } if(plantTime >= 29) {
            g2d.drawImage(dirtSprite, xArray.get(30), yArray.get(30), size, size, null);
        } if(plantTime >= 30) {
            g2d.drawImage(dirtSprite, xArray.get(31), yArray.get(31), size, size, null);
        } if(plantTime >= 31) {
            g2d.drawImage(dirtSprite, xArray.get(32), yArray.get(32), size, size, null);
        } if(plantTime >= 32) {
            g2d.drawImage(dirtSprite, xArray.get(33), yArray.get(33), size, size, null);
        } if(plantTime >= 33) {
            g2d.drawImage(dirtSprite, xArray.get(34), yArray.get(34), size, size, null);
        } if(plantTime >= 34) {
            g2d.drawImage(dirtSprite, xArray.get(35), yArray.get(35), size, size, null);
        } if(plantTime >= 35) {
            g2d.drawImage(dirtSprite, xArray.get(36), yArray.get(36), size, size, null);
        } if(plantTime >= 36) {
            g2d.drawImage(dirtSprite, xArray.get(37), yArray.get(37), size, size, null);
        } if(plantTime >= 37) {
            g2d.drawImage(dirtSprite, xArray.get(38), yArray.get(38), size, size, null);
        } if(plantTime >= 38) {
            g2d.drawImage(dirtSprite, xArray.get(39), yArray.get(39), size, size, null);
        } if(plantTime >= 39) {
            g2d.drawImage(dirtSprite, xArray.get(40), yArray.get(40), size, size, null);
        }  if(plantTime >= 40) {
            g2d.drawImage(dirtSprite, xArray.get(41), yArray.get(41), size, size, null);
        } if(plantTime >= 41) {
            g2d.drawImage(dirtSprite, xArray.get(42), yArray.get(42), size, size, null);
        } if(plantTime >= 42) {
            g2d.drawImage(dirtSprite, xArray.get(43), yArray.get(43), size, size, null);
        } if(plantTime >= 43) {
            g2d.drawImage(dirtSprite, xArray.get(44), yArray.get(44), size, size, null);
        } if(plantTime >= 44) {
            g2d.drawImage(dirtSprite, xArray.get(45), yArray.get(45), size, size, null);
        } if(plantTime >= 45) {
            g2d.drawImage(dirtSprite, xArray.get(46), yArray.get(46), size, size, null);
        } if(plantTime >= 46) {
            g2d.drawImage(dirtSprite, xArray.get(47), yArray.get(47), size, size, null);
        } if(plantTime >= 47) {
            g2d.drawImage(dirtSprite, xArray.get(48), yArray.get(48), size, size, null);
        } if(plantTime >= 48) {
            g2d.drawImage(dirtSprite, xArray.get(49), yArray.get(49), size, size, null);
        } if(plantTime >= 49) {
            g2d.drawImage(dirtSprite, xArray.get(50), yArray.get(50), size, size, null);
        } if(plantTime >= 50) {
            g2d.drawImage(dirtSprite, xArray.get(51), yArray.get(51), size, size, null);
        } if(plantTime >= 51) {
            g2d.drawImage(dirtSprite, xArray.get(52), yArray.get(52), size, size, null);
        } if(plantTime >= 52) {
            g2d.drawImage(dirtSprite, xArray.get(53), yArray.get(53), size, size, null);
        } if(plantTime >= 53) {
            g2d.drawImage(dirtSprite, xArray.get(54), yArray.get(54), size, size, null);
        } if(plantTime >= 54) {
            g2d.drawImage(dirtSprite, xArray.get(55), yArray.get(55), size, size, null);
        } if(plantTime >= 55) {
            g2d.drawImage(dirtSprite, xArray.get(56), yArray.get(56), size, size, null);
        } if(plantTime >= 56) {
            g2d.drawImage(dirtSprite, xArray.get(57), yArray.get(57), size, size, null);
        } if(plantTime >= 57) {
            g2d.drawImage(dirtSprite, xArray.get(58), yArray.get(58), size, size, null);
        } if(plantTime >= 58) {
            g2d.drawImage(dirtSprite, xArray.get(59), yArray.get(59), size, size, null);
        } if(plantTime >= 59) {
            g2d.drawImage(dirtSprite, xArray.get(60), yArray.get(60), size, size, null);
        } if(plantTime >= 60) {
            g2d.drawImage(dirtSprite, xArray.get(61), yArray.get(61), size, size, null);
        } if(plantTime >= 61) {
            g2d.drawImage(dirtSprite, xArray.get(62), yArray.get(62), size, size, null);
        } if(plantTime >= 62) {
            g2d.drawImage(dirtSprite, xArray.get(63), yArray.get(63), size, size, null);
        } if(plantTime >= 63) {
            g2d.drawImage(dirtSprite, xArray.get(64), yArray.get(64), size, size, null);
        }
    }
}
