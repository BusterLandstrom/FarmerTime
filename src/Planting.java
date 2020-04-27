import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Planting {

    public static int ready = 0;

    static public ArrayList<Integer> plantingDayArray = new ArrayList<>();


    BufferedImage[] basicSeedDirt = {
            ImageIO.read(new File("Sprites\\plants\\basic.png")),
            ImageIO.read(new File("Sprites\\plants\\basic1.png")),
            ImageIO.read(new File("Sprites\\plants\\basic2.png")),
            ImageIO.read(new File("Sprites\\plants\\basic3.png")),
            ImageIO.read(new File("Sprites\\plants\\basic4.png")),

    };

    int size = 50;

    static int plantTime = -1;

    static ArrayList<Integer> xArray = new ArrayList<>();
    static ArrayList<Integer> yArray = new ArrayList<>();

    public Planting() throws IOException {

        xArray.add(0);
        yArray.add(0);

    }

    void set(){

        if(ready == 1) {
            for (int i = 0; i <= plantingDayArray.size() - 1; i++) {
                if(plantingDayArray.get(i) < 4) {
                    Integer b = plantingDayArray.get(i);
                    plantingDayArray.set(i, b + 1);
                }

                if(i == plantingDayArray.size() - 1){
                    ready = 0;
                }
            }
        }

    }

    void draw(Graphics2D g2d){
        if (plantTime >= 0) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(0)], xArray.get(1), yArray.get(1), size, size, null);
        } if(plantTime >= 1) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(1)], xArray.get(2), yArray.get(2), size, size, null);
        } if(plantTime >= 2) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(2)], xArray.get(3), yArray.get(3), size, size, null);
        } if(plantTime >= 3) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(3)], xArray.get(4), yArray.get(4), size, size, null);
        } if(plantTime >= 4) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(4)], xArray.get(5), yArray.get(5), size, size, null);
        } if(plantTime >= 5) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(5)], xArray.get(6), yArray.get(6), size, size, null);
        } if(plantTime >= 6) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(6)], xArray.get(7), yArray.get(7), size, size, null);
        } if(plantTime >= 7) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(7)], xArray.get(8), yArray.get(8), size, size, null);
        } if(plantTime >= 8) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(8)], xArray.get(9), yArray.get(9), size, size, null);
        } if(plantTime >= 9) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(9)], xArray.get(10), yArray.get(10), size, size, null);
        } if(plantTime >= 10) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(10)], xArray.get(11), yArray.get(11), size, size, null);
        } if(plantTime >= 11) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(11)], xArray.get(12), yArray.get(12), size, size, null);
        } if(plantTime >= 12) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(12)], xArray.get(13), yArray.get(13), size, size, null);
        } if(plantTime >= 13) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(13)], xArray.get(14), yArray.get(14), size, size, null);
        } if(plantTime >= 14) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(14)], xArray.get(15), yArray.get(15), size, size, null);
        } if(plantTime >= 15) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(15)], xArray.get(16), yArray.get(16), size, size, null);
        } if(plantTime >= 16) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(16)], xArray.get(17), yArray.get(17), size, size, null);
        } if(plantTime >= 17) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(17)], xArray.get(18), yArray.get(18), size, size, null);
        } if(plantTime >= 18) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(18)], xArray.get(19), yArray.get(19), size, size, null);
        } if(plantTime >= 19) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(19)], xArray.get(20), yArray.get(20), size, size, null);
        } if(plantTime >= 20) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(20)], xArray.get(21), yArray.get(21), size, size, null);
        } if(plantTime >= 21) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(21)], xArray.get(22), yArray.get(22), size, size, null);
        } if(plantTime >= 22) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(22)], xArray.get(23), yArray.get(23), size, size, null);
        } if(plantTime >= 23) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(23)], xArray.get(24), yArray.get(24), size, size, null);
        } if(plantTime >= 24) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(24)], xArray.get(25), yArray.get(25), size, size, null);
        } if(plantTime >= 25) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(25)], xArray.get(26), yArray.get(26), size, size, null);
        } if(plantTime >= 26) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(26)], xArray.get(27), yArray.get(27), size, size, null);
        } if(plantTime >= 27) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(27)], xArray.get(28), yArray.get(28), size, size, null);
        } if(plantTime >= 28) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(28)], xArray.get(29), yArray.get(29), size, size, null);
        } if(plantTime >= 29) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(29)], xArray.get(30), yArray.get(30), size, size, null);
        } if(plantTime >= 30) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(30)], xArray.get(31), yArray.get(31), size, size, null);
        } if(plantTime >= 31) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(31)], xArray.get(32), yArray.get(32), size, size, null);
        } if(plantTime >= 32) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(32)], xArray.get(33), yArray.get(33), size, size, null);
        } if(plantTime >= 33) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(33)], xArray.get(34), yArray.get(34), size, size, null);
        } if(plantTime >= 34) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(34)], xArray.get(35), yArray.get(35), size, size, null);
        } if(plantTime >= 35) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(35)], xArray.get(36), yArray.get(36), size, size, null);
        } if(plantTime >= 36) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(36)], xArray.get(37), yArray.get(37), size, size, null);
        } if(plantTime >= 37) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(37)], xArray.get(38), yArray.get(38), size, size, null);
        } if(plantTime >= 38) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(38)], xArray.get(39), yArray.get(39), size, size, null);
        } if(plantTime >= 39) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(39)], xArray.get(40), yArray.get(40), size, size, null);
        }  if(plantTime >= 40) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(40)], xArray.get(41), yArray.get(41), size, size, null);
        } if(plantTime >= 41) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(41)], xArray.get(42), yArray.get(42), size, size, null);
        } if(plantTime >= 42) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(42)], xArray.get(43), yArray.get(43), size, size, null);
        } if(plantTime >= 43) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(43)], xArray.get(44), yArray.get(44), size, size, null);
        } if(plantTime >= 44) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(44)], xArray.get(45), yArray.get(45), size, size, null);
        } if(plantTime >= 45) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(45)], xArray.get(46), yArray.get(46), size, size, null);
        } if(plantTime >= 46) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(46)], xArray.get(47), yArray.get(47), size, size, null);
        } if(plantTime >= 47) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(47)], xArray.get(48), yArray.get(48), size, size, null);
        } if(plantTime >= 48) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(48)], xArray.get(49), yArray.get(49), size, size, null);
        } if(plantTime >= 49) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(49)], xArray.get(50), yArray.get(50), size, size, null);
        } if(plantTime >= 50) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(50)], xArray.get(51), yArray.get(51), size, size, null);
        } if(plantTime >= 51) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(51)], xArray.get(52), yArray.get(52), size, size, null);
        } if(plantTime >= 52) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(52)], xArray.get(53), yArray.get(53), size, size, null);
        } if(plantTime >= 53) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(53)], xArray.get(54), yArray.get(54), size, size, null);
        } if(plantTime >= 54) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(54)], xArray.get(55), yArray.get(55), size, size, null);
        } if(plantTime >= 55) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(55)], xArray.get(56), yArray.get(56), size, size, null);
        } if(plantTime >= 56) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(56)], xArray.get(57), yArray.get(57), size, size, null);
        } if(plantTime >= 57) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(57)], xArray.get(58), yArray.get(58), size, size, null);
        } if(plantTime >= 58) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(58)], xArray.get(59), yArray.get(59), size, size, null);
        } if(plantTime >= 59) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(59)], xArray.get(60), yArray.get(60), size, size, null);
        } if(plantTime >= 60) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(60)], xArray.get(61), yArray.get(61), size, size, null);
        } if(plantTime >= 61) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(61)], xArray.get(62), yArray.get(62), size, size, null);
        } if(plantTime >= 62) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(62)], xArray.get(63), yArray.get(63), size, size, null);
        } if(plantTime >= 63) {
            g2d.drawImage(basicSeedDirt[plantingDayArray.get(63)], xArray.get(64), yArray.get(64), size, size, null);
        }
    }
}
