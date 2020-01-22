import objectdraw.*;
import java.awt.Color;
import java.awt.Rectangle;
/**
 * Class for a Bomb object.
 * Bombs fall at an angle from the position they are created at
 * 
 * @author mcorcor
 * @version 11.17.2019
 */
public class Bomb extends ActiveObject
{
    Color bColor = new Color(255, 102, 102);
    FilledOval bomb;
    
    /**
     * Constructor for Bomb
     * 
     * @param bombX X-coordinate of the Bomb's original location
     * @param bombY Y-coordinate of the Bomb's original location
     * @param canvas DrawingCanvas the bomb is drawn on
     */
    public Bomb(double bombX, double bombY, DrawingCanvas canvas)
    {
        bomb = new FilledOval(bombX, bombY, 15, 15, canvas);
        bomb.setColor(bColor);
        start();
    }
    
    /**
     * Have the Bomb begin its actions
     */
    public void run(){
        act();
    }
    
    /**
     * Make the Bomb move every 100 milliseconds
     */
    public void act(){
        while (true) {
            move();
            pause(100);
        }
    }
    
    /**
     * Make the Bomb move downwards and diagonally
     */
    public void move(){
        bomb.move(-3, 4);
    }
    
    /**
     * Get the Bomb's x-coordinate
     * @return bombX X-coordinate of the Bomb's location
     */
    public double getX(){
        double bombX;
        bombX = bomb.getX();
        return bombX;
    }
      
    /**
     * Get the Bomb's y-coordinate
     * @return bombY Y-coordinate of the Bomb's location
     */
    public double getY(){
        double bombY;
        bombY = bomb.getY();
        return bombY;
    }
}
