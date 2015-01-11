import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kupu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor
{
    /**
     * Act - do whatever the Lebah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int kali=0;
    private static final double WALKING_SPEED = 7.0;
    
    public void turn()
    {
        turn(10);
    }
    
    public void turn(int angle)
    {
        setRotation(getRotation() + angle);
    }
    
    public void move()
    {
        move(WALKING_SPEED);
    }

    public void move(double distance)
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle) * distance);
        int y = (int) Math.round(getY() + Math.sin(angle) * distance);
        
        setLocation(x, y);
    }

    public boolean atWorldEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)
            return true;
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)
            return true;
        else
            return false;
    }
    
    public void act() 
    {
        move(4);
        randomTurn();
        turnAtEdge();
    }    
    
    public void randomTurn()
    {
        if(Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(40)-20);
        }
    }
    
    public void turnAtEdge()
    {
        if(atWorldEdge())
        {
            turn(90);
        }
    }
}
