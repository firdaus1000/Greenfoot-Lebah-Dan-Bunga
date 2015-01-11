import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BeeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeeWorld extends World
{

    private Counter theCounter;
    
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1);
        addObject(new Flower(), 100, 100);
        prepare();
    }
    
    public Counter getCounter()
    {
        return theCounter;
    }
    
    private void prepare()
    {
        Bee bee = new Bee();
        addObject(bee, 500,250);
        Flower flower1 = new Flower();
        addObject(flower1, 700, 390);
        Flower flower2 = new Flower();
        addObject(flower2, 204, 115);
        Flower flower3 = new Flower();
        addObject(flower3, 900, 388);
        Flower flower4 = new Flower();
        addObject(flower4, 305, 386);
        Flower flower5 = new Flower();
        addObject(flower5, 627, 040);
        Flower flower6 = new Flower();
        addObject(flower6, 804, 110);
        Rock rock1 = new Rock();
        addObject(rock1, 812, 237);
        Rock rock2 = new Rock();
        addObject(rock2, 100, 285);
        Rock rock3 = new Rock();
        addObject(rock3, 443, 64);
        Counter counter = new Counter();
        addObject(counter, 050, 010);
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(1000)< 10)
        {
            addObject(new Flower(), 500, 250);
        }
    }
}