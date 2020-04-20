import java.io.File;
import javax.sound.sampled.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class Player {

    /**/ //Screen resize variables
    public static double screenMultiplier = 1;
    public static int screenSizeX;
    public static int screenSizeY;
    boolean screenChange;
    boolean screenChangeReady = true;
    /**/

    int farmX = 0;
    int farmY = 0;
    int size = 50;
    int plantedPlants;
    double plantTimeout = 0;

    double iceTimeout = 0;
    Rectangle spellHitBox;
    int spellX = 0;
    int spellY = 0;
    int spellSize = 20;
    double spellTimeLimit = 0;
    int sUp;
    int sDirection;
    int up;
    boolean canSpell = true;

    boolean shop = false;
    double shopTimeout = 5;

    static int screenX;
    static int screenY;

    /**/ //GamePanel object cast as gp
    GamePanel gp;
    /**/

    /**/ //Day initialization
    String dayString;
    int day;
    double dayTextTimeout = 0;
    double dayTimeout = 0;
    /**/

    String seedString;
    public static int seed;
    double seedTextTimeout = 0;
    static double seedTimeout = 0;
    int storedSeeds = 10;
    static int canPlant = 1;
    double insideTimeout = 0;
    double idleTimeout = 9;
    double walkingTimeout = 9;
    static int isPlanting = 0;

    /**/ //Character base variables
    static int x;
    static int y;
    int height;
    int width;
    /**/

    /**/ //Checking if movement button is pressed
    boolean keyUp;
    boolean keyLeft;
    boolean keyRight;
    boolean keyDown;
    boolean keyEsc;
    boolean keyE;
    boolean keyB;
    int shake;
    double shakeTimer = 0;
    int direction = 1;
    boolean menu = false;
    boolean nextDayReady = true;
    boolean walking = false;
    /**/

    Font base = Font.createFont(Font.TRUETYPE_FONT, new File("Sprites\\FFFFORWA.TTF"));
    Font real = base.deriveFont(Font.PLAIN, 22);

    /**/ //X and Y speed of character
    double xs;
    double ys;
    int maxSpeed = 8;
    /**/

    /**/ //Setting up character hit box
    static Rectangle charHitBox;
    /**/

    /**/ //Declaring the sleep sprite
    final BufferedImage sleepSprite = ImageIO.read(new File("Sprites\\sleep.png"));
    /**/

    /**/ //Declaring the seeds sprite
    final BufferedImage seedsSprite = ImageIO.read(new File("Sprites\\seeds.png"));
    /**/

    /**/ //Declaring the emptyButton sprite
    final BufferedImage emptySprite = ImageIO.read(new File("Sprites\\empty.png"));
    /**/

    /**/ //Declaring the shadow sprite
    final BufferedImage shadowSprite = ImageIO.read(new File("Sprites\\shadow.png"));
    /**/

    /**/ //Declaring the playerIdle sprite array
    final BufferedImage[] playerIdleSprite = {
            ImageIO.read(new File("Sprites\\player_idle\\player_idle1.png")),
            ImageIO.read(new File("Sprites\\player_idle\\player_idle2.png")),
            ImageIO.read(new File("Sprites\\player_idle\\player_idle3.png")),
            ImageIO.read(new File("Sprites\\player_idle\\player_idle4.png")),
            ImageIO.read(new File("Sprites\\player_idle\\player_idle5.png")),
            ImageIO.read(new File("Sprites\\player_idle\\player_idle6.png")),
            ImageIO.read(new File("Sprites\\player_idle\\player_idle7.png")),
            ImageIO.read(new File("Sprites\\player_idle\\player_idle8.png")),
            ImageIO.read(new File("Sprites\\player_idle\\player_idle9.png"))
    };
    /**/

    /**/ //Declaring the playerWalking sprite array
    final BufferedImage[] playerWalkingSprite = {
            ImageIO.read(new File("Sprites\\player_run\\player_run1.png")),
            ImageIO.read(new File("Sprites\\player_run\\player_run2.png")),
            ImageIO.read(new File("Sprites\\player_run\\player_run3.png"))
    };
    /**/

    /**/ //Declaring the playerIdle sprite array
    final BufferedImage[] iceSpriteAnim = {
            ImageIO.read( new File("Sprites\\spells\\ice\\ice1.png")),
            ImageIO.read( new File("Sprites\\spells\\ice\\ice2.png")),
            ImageIO.read( new File("Sprites\\spells\\ice\\ice3.png")),
            ImageIO.read( new File("Sprites\\spells\\ice\\ice4.png"))
    };


    /**/ //Declaring the idle player sprite
    BufferedImage idleCharSprite = playerIdleSprite[0];
    /**/

    /**/ //Declaring the walking player sprite
    BufferedImage walkingCharSprite = playerWalkingSprite[0];
    /**/

    String plantingSrc = "Sounds\\plant.wav";



    /**/ //Instantiating the player through constructor
    public Player(int x, int y, GamePanel gp) throws IOException, FontFormatException {
        /**/ //Setting all variables same as parent variable
        this.gp = gp;
        Player.x = x;
        Player.y = y;
        /**/


        /**/ //Setting the character width, height and hit box
        width = 50;
        height = 50;
        charHitBox = new Rectangle(x,y,width,height);
        spellHitBox = new Rectangle(0,0,0,0);
        /**/
    }
    /**/


    public void set() {

        if(keyB){
            if(canSpell) {
                spellTimeLimit = 10;
                iceTimeout = 15;
                spellX = (int) (x * screenMultiplier);
                spellY = (int) (y * screenMultiplier);
                if (direction == 1) {
                    sUp = 3;
                    sDirection = 1;
                } else if (direction == 0) {
                    sUp = 3;
                    sDirection = 0;
                } else if (up == 1) {
                    sUp = 1;
                    sDirection = 3;
                } else if (up == 0) {
                    sUp = 0;
                    sDirection = 3;
                }
                canSpell = false;
            }
        }


        spellHitBox.x = (int) (spellX * screenMultiplier);
        spellHitBox.y = (int) (spellY * screenMultiplier);
        spellHitBox.width = (int) (spellSize * screenMultiplier);
        spellHitBox.height = (int) (spellSize * screenMultiplier);

        for(int g = 0; g <= FarmSquares.squareHitBoxArray.size() - 1 ;g++) {
            if (spellHitBox.intersects(FarmSquares.squareHitBoxArray.get(g))) {
                System.out.println("YO!");
                spellTimeLimit = -1;
            }
            if (g == FarmSquares.squareHitBoxArray.size()) {
                g = 0;
            }
        }

        if (spellTimeLimit > 0){
            spellSize = 20;
            if(sUp == 1) {
                spellY -= 6;

            } else if(sUp == 0){
                spellY += 6;

            } else if (sDirection == 1){
                spellX += 6;

            } else if (sDirection == 0){
                spellX -= 6;

            }
        } else{
            spellSize = 0;
            spellY = 0;
            spellX = 0;
            canSpell = true;
        }

        if(shakeTimer < 0){
            shake = 0;
        } else {
            screenX = new Random().nextInt(3) - 2;
            screenY = new Random().nextInt(3) - 2;
        }

        if(shake == 0){
            screenY = 0;
            screenX = 0;
        }

        
        shakeTimer -= 0.8;

        if(DayNight.r <= 0 && DayNight.g <= 0 && DayNight.b <= 0){
            day += 1;
            DayNight.r = 204;
            DayNight.g = 255;
            DayNight.b = 255;

        }

        Move();

        if(plantedPlants <= 64) {
            if (keyE) {
                if (charHitBox.intersects(Farm.farmHitBox)) {
                    if (canPlant == 1) {
                        plantSeed();
                    } else {
                        insideTimeout = 10;
                        isPlanting = 0;
                    }
                } else {
                    isPlanting = 0;
                }
            } else {
                isPlanting = 0;
            }
        }

        if(seed <= 0){
            canPlant = 0;
        }

        real = base.deriveFont(Font.PLAIN, (int) (22 * screenMultiplier));

        dayString = "Days: " + day;
        seedString = "Seeds: " + seed;

        buttonClicks();

        screenSizeX = (int) (1280 * screenMultiplier);
        screenSizeY = (int) (720 * screenMultiplier);

        if(screenChange) {
            if(!screenChangeReady) {
                if (screenMultiplier == 1) {
                    screenMultiplier = 1.5;
                    screenChange = false;
                } else if (screenMultiplier == 1.5) {
                    screenMultiplier = 2;
                    screenChange = false;
                } else if (screenMultiplier == 2) {
                    screenMultiplier = 2.5;
                    screenChange = false;
                } else if (screenMultiplier == 2.5) {
                    screenMultiplier = 3;
                    screenChange = false;
                } else if (screenMultiplier == 3) {
                    screenMultiplier = 1;
                    screenChange = false;
                }
            }
        }

        if(charHitBox.intersects(House.houseHitBox)){
            menu = true;
            canPlant = 0;
        } else if (!(charHitBox.intersects(House.houseHitBox))){
            menu = false;
            shop = false;
            nextDayReady = true;
            canPlant = 1;
            screenChangeReady = true;
        }

        /**/ //Animation for walking and idle
        if(!walking){
            walkingTimeout = 9;
            if(idleTimeout > 8) {
                idleCharSprite = playerIdleSprite[0];
            } else if(idleTimeout > 7) {
                idleCharSprite = playerIdleSprite[1];
            } else if(idleTimeout > 6) {
                idleCharSprite = playerIdleSprite[2];
            } else if(idleTimeout > 5) {
                idleCharSprite = playerIdleSprite[3];
            } else if(idleTimeout > 4) {
                idleCharSprite = playerIdleSprite[4];
            } else if(idleTimeout > 3) {
                idleCharSprite = playerIdleSprite[5];
            } else if(idleTimeout > 2) {
                idleCharSprite = playerIdleSprite[6];
            } else if(idleTimeout > 1) {
                idleCharSprite = playerIdleSprite[7];
            } else if(idleTimeout > 0) {
                idleCharSprite = playerIdleSprite[8];
            }
        } else{
            idleTimeout = 9;
            if(walkingTimeout > 8) {
                walkingCharSprite = playerIdleSprite[0];
            } else if(walkingTimeout > 7) {
                walkingCharSprite = playerIdleSprite[1];
            } else if(walkingTimeout > 6) {
                walkingCharSprite = playerIdleSprite[2];
            } else if(walkingTimeout > 3){
                walkingTimeout = 7.8;
            }
        }
        /**/

        seedTextTimeout -= 0.8;
        seedTimeout -= 1;
        dayTextTimeout -= 0.8;
        dayTimeout -= 1;
        insideTimeout -= 1;
        if(idleTimeout > 0) {
            idleTimeout -= 0.08;
        } else {
                idleTimeout = 9;
        }
        walkingTimeout -= 0.08;
        shopTimeout -= 0.3;
        plantTimeout -= 0.3;
        iceTimeout -= 0.08;
        spellTimeLimit -= 0.02;

        if(iceTimeout <= 0){
            iceTimeout = 15;
        }

    }

    void Move(){

        if (keyLeft && keyRight || !keyLeft && !keyRight) {
            xs *= 0.8;
            if (keyUp && keyDown || !keyUp && !keyDown) {
                walking = false;
            } else {
                walking = true;
            }
        } else if (keyLeft) {
            walking = true;
            xs--;
            direction = 0;
            up = 3;
        } else if (keyRight) {
            walking = true;
            xs++;
            direction = 1;
            up = 3;
        }

        if (keyUp && keyDown || !keyUp && !keyDown) {
            ys *= 0.8;
            if (keyLeft && keyRight || !keyLeft && !keyRight) {
                walking = false;
            } else {
                walking = true;
            }
        } else if (keyUp) {
            walking = true;
            ys--;
            direction = 3;
            up = 1;
        } else if (keyDown) {
            walking = true;
            ys++;
            direction = 3;
            up = 0;
        }


        if(y >= (634 * screenMultiplier)){
            charHitBox.y -= ys;
            charHitBox.y -= Math.signum(ys);
            ys = 0;
            y = charHitBox.y;
        } else if(y <= -1){
            charHitBox.y -= ys;
            charHitBox.y -= Math.signum(ys);
            ys = 0;
            y = charHitBox.y;
        }


        if (xs > 0 && xs < .75) {
            xs = 0;
        }
        if (xs < 0 && xs > -.75) {
            xs = 0;
        }

        if (ys > 0 && ys < .75) {
            ys = 0;
        }
        if (ys < 0 && ys > -.75) {
            ys = 0;
        }

        if (xs > maxSpeed) {
            xs = maxSpeed;
        }
        if (xs < -maxSpeed) {
            xs = -maxSpeed;
        }

        if (ys > maxSpeed) {
            ys = maxSpeed;
        }
        if (ys < -maxSpeed) {
            ys = -maxSpeed;
        }

        if (x >= (1216 * screenMultiplier)) {
            charHitBox.x -= xs;
            charHitBox.x -= Math.signum(xs);
            xs = 0;
            x = charHitBox.x;
        } else if (x <= -1) {
            charHitBox.x -= xs;
            charHitBox.x -= Math.signum(xs);
            xs = 0;
            x = charHitBox.x;
        }

        charHitBox.x += xs;
        charHitBox.y += ys;

        x += xs;
        y += ys;

        charHitBox.x = (int) (x * screenMultiplier);
        charHitBox.y = (int) (y * screenMultiplier);
        charHitBox.width = (int) (width * screenMultiplier);
        charHitBox.height = (int) (height * screenMultiplier);

    }

    void plantSeed(){
        if(seedTimeout < 0) {
            if (seed > 0) {
                seed -= 1;
                isPlanting = 1;
                play(plantingSrc);
                seedTimeout = 10;
                shake();
                for(int g = 0; g <= FarmSquares.squareHitBoxArray.size() - 1 ;g++) {
                    if (plantTimeout <= 0){
                        if (charHitBox.intersects(FarmSquares.squareHitBoxArray.get(g))) {
                            farmX = FarmSquares.squareHitBoxArray.get(g).x;
                            farmY = FarmSquares.squareHitBoxArray.get(g).y;
                            size = 50;
                            Planting.xArray.add(farmX);
                            Planting.yArray.add(farmY);
                            Planting.plantTime += 1;
                            plantedPlants = 1;
                            plantTimeout = 5;
                        }
                        if (g == FarmSquares.squareHitBoxArray.size()) {
                            g = 0;
                        }
                    }
                }
            } else {
                isPlanting = 0;
                seedTextTimeout = 10;
            }
        } else {
            isPlanting = 0;
        }
    }

    public static void play(String filename)
    {
        try
        {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(filename)));
            clip.start();
            clip.drain();
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }
    }

    void buttonClicks(){
        gp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(!shop) {
                    if (menu) {
                        if (e.getX() >= (int) (50 * screenMultiplier) && e.getX() <= (int) (150 * screenMultiplier) && e.getY() >= (int) (50 * screenMultiplier) && e.getY() <= (int) (100 * screenMultiplier)) {
                            if (nextDayReady) {
                                day += 1;
                                nextDayReady = false;
                                storedSeeds += 2;
                                dayTimeout = 10;
                            } else {
                                if (dayTimeout <= 0) {
                                    dayTextTimeout = 10;
                                }
                            }
                        }
                        if (e.getX() >= (int) (50 * screenMultiplier) && e.getX() <= (int) (150 * screenMultiplier) && e.getY() >= (int) (120 * screenMultiplier) && e.getY() <= (int) (170 * screenMultiplier)) {
                            seed += storedSeeds;
                            storedSeeds -= storedSeeds;
                        }

                        if (e.getX() >= (int) (50 * screenMultiplier) && e.getX() <= (int) (150 * screenMultiplier) && e.getY() >= (int) (190 * screenMultiplier) && e.getY() <= (int) (240 * screenMultiplier)) {
                            if (screenChangeReady = true) {
                                screenChange = true;
                                screenChangeReady = false;
                            }
                        }
                        if (e.getX() >= (int) (50 * screenMultiplier) && e.getX() <= (int) (150 * screenMultiplier) && e.getY() >= (int) (260 * screenMultiplier) && e.getY() <= (int) (310 * screenMultiplier)) {
                            if (shopTimeout < 0) {
                                shop = true;
                                shopTimeout = 5;
                            }
                        }
                    }
                } else {
                    if (e.getX() >= (int) (50 * screenMultiplier) && e.getX() <= (int) (150 * screenMultiplier) && e.getY() >= (int) (260 * screenMultiplier) && e.getY() <= (int) (310 * screenMultiplier)) {
                        if (shopTimeout < 0) {
                            shop = false;
                            menu = true;
                            shopTimeout = 5;
                        }
                    }

                }
            }
        });
    }

    void shake(){
        shake = 1;
        shakeTimer = 10;
    }


    public void draw(Graphics2D g2d) {
        g2d.setFont(real);
        g2d.setColor(Color.RED);
        /**///Character hit box draw g2d.drawRect(charHitBox.x, charHitBox.y, charHitBox.width, charHitBox.height);
        if(iceTimeout >= 13) {
            g2d.drawImage(iceSpriteAnim[0],spellX, spellY, spellSize, spellSize, null);
        } else if(iceTimeout >= 8 && iceTimeout < 13){
            g2d.drawImage(iceSpriteAnim[1],spellX, spellY, spellSize, spellSize, null);

        } else if(iceTimeout >= 5 && iceTimeout < 8){
            g2d.drawImage(iceSpriteAnim[2],spellX, spellY, spellSize, spellSize, null);

        } else if(iceTimeout > 0 && iceTimeout < 5){
            g2d.drawImage(iceSpriteAnim[3],spellX, spellY, spellSize, spellSize, null);

        }
        if (direction == 0) {
            g2d.drawImage(shadowSprite,charHitBox.x, charHitBox.y, charHitBox.width, 57, null);
            if(walking) {
                g2d.drawImage(walkingCharSprite, (int) ((x + width) * screenMultiplier), charHitBox.y, (int) (-width * screenMultiplier), charHitBox.height, null);
            } else if (!walking){
                g2d.drawImage(idleCharSprite, (int) ((x + width) * screenMultiplier), charHitBox.y, (int) (-width * screenMultiplier), charHitBox.height, null);
            }
        } else {
            g2d.drawImage(shadowSprite,(int) ((x + width) * screenMultiplier), charHitBox.y, (int) (-width * screenMultiplier), 57, null);
            if(walking) {
                g2d.drawImage(walkingCharSprite, charHitBox.x, charHitBox.y, charHitBox.width, charHitBox.height, null);
            } else if (!walking) {
                g2d.drawImage(idleCharSprite, charHitBox.x, charHitBox.y, charHitBox.width, charHitBox.height, null);

            }
        }
        if (!shop) {
            if (menu) {
                g2d.setColor(Color.BLACK);
                g2d.drawImage(sleepSprite, (int) (50 * screenMultiplier), (int) (50 * screenMultiplier), (int) (100 * screenMultiplier), (int) (50 * screenMultiplier), null);
                g2d.drawImage(seedsSprite, (int) (50 * screenMultiplier), (int) (120 * screenMultiplier), (int) (100 * screenMultiplier), (int) (50 * screenMultiplier), null);
                g2d.drawImage(emptySprite, (int) (50 * screenMultiplier), (int) (190 * screenMultiplier), (int) (100 * screenMultiplier), (int) (50 * screenMultiplier), null);
                g2d.drawString("Stored seeds: " + storedSeeds, (int) (1000 * screenMultiplier), (int) (90 * screenMultiplier));
                g2d.drawString("" + screenSizeY + "p", (int) (64 * screenMultiplier), (int) (229 * screenMultiplier));
                g2d.drawImage(emptySprite, (int) (50 * screenMultiplier), (int) (260 * screenMultiplier), (int) (100 * screenMultiplier), (int) (50 * screenMultiplier), null);
                g2d.drawString("Store", (int) (61 * screenMultiplier), (int) (299 * screenMultiplier));
            }
        } else {
            g2d.setColor(Color.BLACK);
            g2d.drawString("Stored seeds: " + storedSeeds, (int) (1000 * screenMultiplier), (int) (90 * screenMultiplier));
            g2d.drawImage(emptySprite, (int) (50 * screenMultiplier), (int) (260 * screenMultiplier), (int) (100 * screenMultiplier), (int) (50 * screenMultiplier), null);
            g2d.drawString("Back", (int) (61 * screenMultiplier), (int) (299 * screenMultiplier));
        }
        if (seedTextTimeout > 0) {
            g2d.setColor(Color.RED);
            g2d.drawString("You are out of seeds", (int) (400 * screenMultiplier), (int) (340 * screenMultiplier));
        }
        if (dayTextTimeout > 0) {
            g2d.setColor(Color.RED);
            g2d.drawString("Go out and work before you sleep again", (int) (340 * screenMultiplier), (int) (340 * screenMultiplier));
        }
        if (seed > 0) {
            if (insideTimeout > 0) {
                g2d.setColor(Color.RED);
                g2d.drawString("You can't plant here", (int) (340 * screenMultiplier), (int) (340 * screenMultiplier));
            }
        }
        g2d.setColor(Color.BLACK);
        g2d.drawString(dayString, (int) (530 * screenMultiplier), (int) (55 * screenMultiplier));
        g2d.drawString(seedString, (int) (1000 * screenMultiplier), (int) (55 * screenMultiplier));
    }
}
