import processing.core.PApplet;

public class Ball extends PApplet {
    private int speed;
    private int position;
    private int diameter;
    FourBalls sketch;

    public Ball(FourBalls sketch){
        this.sketch = sketch;
    }
    public void setProperties(int speed, int position, int diameter) {
        this.speed = speed;
        this.position = position;
        this.diameter = diameter;
    }

    public void draw()
    {
        sketch.ellipse(speed, position, diameter, diameter);
    }
}
