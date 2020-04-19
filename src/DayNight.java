import java.awt.Color;

public class DayNight {


    public static double r = 204;
    public static double g = 255;
    public static double b = 255;


    public DayNight() {
    }

    void set(){

        if(r <= 0){
            r = 0;
        }
        if(g <= 0){
            g = 0;
        }
        if(b <= 0){
            b = 0;
        }

        GameFrame.bgc = new Color((int)r, (int)g, (int)b);

        r -= 0.03;
        g -= 0.03;
        b -= 0.03;

    }
}
