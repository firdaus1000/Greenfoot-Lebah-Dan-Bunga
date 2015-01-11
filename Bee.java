import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    private static final double WALKING_SPEED = 10.5;
    private int shotTimer = 0;
    
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
        checkKeys();
        if (shotTimer > 0)
        {
            shotTimer = shotTimer - 1;
        }
        else if (Greenfoot.isKeyDown("space")) 
        {
            getWorld().addObject(new Splash(this), getX(), getY());
            shotTimer = 200; // delay next shot
        }
    }
    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
    Flower a=(Flower)getOneIntersectingObject(Flower.class);
    Rock b=(Rock)getOneIntersectingObject(Rock.class);
      
    if(a!=null)
        {
            Greenfoot.playSound("makan.wav");
            getWorld().removeObject(a);
            return;
        }
        
        if(b!=null)
        {
            setImage("gameover.png");
            Greenfoot.playSound("lose.wav");
            getWorld().removeObject(b);
            return;
        }
    }
}
