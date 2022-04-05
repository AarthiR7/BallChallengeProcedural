import processing.core.PApplet;

public class BallChallenge extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 50;
    int ball1=0;
    int ball2=0;
    int ball3=0;
    int ball4=0;
    public static void main(String[] args) {
        PApplet.main("BallChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        //super.setup();
        //ellipse(WIDTH/2,HEIGHT/2,100,100);
    }

    @Override
    public void draw() {
        //super.draw();
        ellipse(ball1,Heightoftheball(1),DIAMETER,DIAMETER);
        ball1++;
        ellipse(ball2,Heightoftheball(2),DIAMETER,DIAMETER);
        ball2+=2;
        ellipse(ball3,Heightoftheball(3),DIAMETER,DIAMETER);
        ball3+=3;
        ellipse(ball4,Heightoftheball(4),DIAMETER,DIAMETER);
        ball4+=4;


        /*ellipse(x,HEIGHT/2,DIAMETER,DIAMETER);
        x++;*/
    }
    public float Heightoftheball(int n){
        float x= ((n * HEIGHT) / 5);
        return  x;
    }
}
