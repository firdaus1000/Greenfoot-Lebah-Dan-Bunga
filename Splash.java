import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Splash  extends Actor
{
    private Bee myShip;

    public Splash(Bee myShip)
    {
        this.myShip = myShip;
    }

    public void act() 
    {
        int ypos = getY();
        if (ypos > 0) {
            ypos = ypos - 5;
            setLocation(getX(), ypos);
            Actor rock = getOneIntersectingObject(Rock.class);
            if (rock != null) {
                // We've hit an asteroid!
                hitAnRock();
                getWorld().removeObject(rock);
                getWorld().removeObject(this);
            }
        }
        else {
            // I reached the top of the screen
            getWorld().removeObject(this);
        }
    }
    private void hitAnRock()
    {
        // What goes here????
        // We want to call the "bumpCount" method from the Counter class -
        // but how??!!
    }
}
