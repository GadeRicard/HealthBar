import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * Author: Gade Ricard
 * Teacher: Mr. Hardman
 * Assignment #3, HealthBar
 * Date Last Modified: April 10th
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void prepare()
    {
        Button button = new Button();
        addObject(button,115,335);
        HealthBar healthbar = new HealthBar();
        addObject(healthbar,255,138);
        healthbar.setLocation(296,81);
        button.setLocation(136,212);
    }
}
