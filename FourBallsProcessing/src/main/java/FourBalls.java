import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public int a = 0, b= 0 , c= 0, d= 0;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
   public void draw() {
        int speed = 0;

        for (int ballCount = 1; ballCount <= 4; ballCount++) {
            Ball ball = new Ball(this);
            switch(ballCount) {
                case 1: speed = a; break;
                case 2: speed = b; break;
                case 3: speed = c; break;
                case 4: speed = d; break;
            }
            ball.setProperties(speed, ballCount * HEIGHT / 5, DIAMETER);
            ball.draw();
            switch (ballCount){
                case 1: a++; break;
                case 2: b+=2; break;
                case 3: c+=3; break;
                case 4: d+=4; break;
            }
        }
    }
}
