import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{

    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        banana banana = new banana();
        addObject(banana,85,382);
        banana banana2 = new banana();
        addObject(banana2,345,377);
        banana banana3 = new banana();
        addObject(banana3,269,20);
        banana banana4 = new banana();
        addObject(banana4,570,27);
        ball ball = new ball();
        addObject(ball,447,26);
        ball ball2 = new ball();
        addObject(ball2,186,363);
        score score = new score();
        addObject(score,194,16);
        turt turt = new turt();
        addObject(turt,32,191);
    }
}
