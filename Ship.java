import objectdraw.*;
import java.awt.Color;

/**
 * Class for a ship object
 * 
 * @author Matthew Corcoran
 * @version 11.17.2019
 */
public class Ship extends ActiveObject
{
    FilledRect boat, gun;
    Color gray = new Color(153, 153, 153);
    
    /**
     * Constructor for Ship, which consists of a gray boat with a gun on the top
     * @param boatX X-coordinate of the boat
     * @param boatY Y-coordinate of the boat
     * @param canvas The DrawingCanvas this is all put on
     */
    public Ship(double boatX, double boatY, DrawingCanvas canvas)
    {
       boat = new FilledRect(boatX, boatY, 75, 25, canvas);
       boat.setColor(gray);
       gun = new FilledRect(boatX + 31, boatY - 10, 15, 10, canvas);
       gun.setColor(gray);
       start();
    }
    
    /**
     * Move the boat to the specified coordinates, move the gun as well so it maintains the perception that
     * the gun is attached to the boat
     * @param x X-coordinate the boat is to be moved to 
     * @param y Y-coordinate the boat is to be moved to 
     */
    public void move(double x, double y){
        boat.moveTo(x, y);
        gun.moveTo(x + 31, y - 10);
    }
    
    /**
     * Get the x-coordinate of the boat
     * @return boatX The x-coordinate of the boat's position
     */
    public double getX(){
        double boatX;
        boatX = boat.getX();
        return boatX;
    }
    
    /**
     * Get the y-coordinate of the boat
     * @return boatY The y-coordinate of the boat's position
     */
    public double getY(){
        double boatY;
        boatY = boat.getY();
        return boatY;
    }

}

