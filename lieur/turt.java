import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turt extends Actor
{
    /**
     * Act - do whatever the turt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     
    if(Greenfoot.isKeyDown("left")){
     turn(-5);
    }    
if(Greenfoot.isKeyDown("right")){
 turn(5);
}
if(Greenfoot.isKeyDown("up")){
    move(5);
}
if (Greenfoot.isKeyDown("down")){
    move(-5);
}
Actor banana = getOneObjectAtOffset(0,0, banana.class);
if(banana !=null){
getWorld().removeObject(banana);
score.banana++;
    }
    if(score.banana == 4){
        getWorld().addObject(new menang(), 300, 200);
        Greenfoot.stop();
}
}
}
