import objectdraw.*;
import java.awt.Color;
import java.awt.Rectangle;
/**
 * Bullets are orange rectangles that move upwards in a straight line
 * 
 * @author Matthew Corcoran
 * @version 11.17.2019
 */
public class Bullet extends ActiveObject
{
    FilledRect bullet;
   
    /**
     * Constructor for objects of class Bullet
     */
    public Bullet(double x, double y, DrawingCanvas canvas)
    {
      bullet = new FilledRect(x, y, 15, 10, canvas);
      bullet.setColor(Color.orange);
      start();
    }
    
    /**
     * Make the Bullet move to its next position every 100 milliseconds
     */
    public void run(){
        while (true) {
            move();
            pause(100);
        }
    }
    
    /**
     * Move the Bullet upwards
     */
    public void move(){
        bullet.move(0, -15);
    }
    
    /**
     * Get the Bullet's x-coordinate
     * @return bulletX X-coordinate of the Bullet's position
     */
    public double getX(){
        double bulletX;
        bulletX = bullet.getX();
        return bulletX;
    }
    
    /**
     * Get the Bullet's y-coordinate
     * @return bulletY Y-coordinate of the Bullet's position
     */
    public double getY(){
        double bulletY;
        bulletY = bullet.getY();
        return bulletY;
    }
}
