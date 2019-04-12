import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    {
        setRotation(Greenfoot.getRandomNumber(90));
    }
    public void act() 
    {
       move(5);
       if(getY()<=5 || getY() >=getWorld().getHeight () -5)
       turn(180);
       Actor turt = getOneObjectAtOffset(0, 0, turt.class);
       if(turt!= null){
           removeTouching(turt.class);
           Greenfoot.stop();
           getWorld().addObject(new kalah(),300,200);
    }    
}
}