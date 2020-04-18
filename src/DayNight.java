import java.awt.*;
import java.io.IOException;

public class DayNight {

    public static double current;


    public static double r = 204;
    public static double g = 255;
    public static double b = 255;


    public DayNight(double current) throws IOException {
        this.current = current;
    }

    void set(){
        current += 0.08;

        if(r <= 0){
            r = 0;
        }
        if(g <= 0){
            g = 0;
        }
        if(b <= 0){
            b = 0;
        }

        GameFrame.bgc = new Color((int)r, (int)g,(int) b);

        System.out.println(r);
        System.out.println(g);
        System.out.println(b);

        r -= 0.03;
        g -= 0.03;
        b -= 0.03;

    }
}
