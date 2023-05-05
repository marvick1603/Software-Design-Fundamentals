/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veggies;

/**
 * Instructor code for Week 9.
 * Should be built during class but this can be used for a reference.
 * @author dancye, 2018
 */
public abstract class Vegetable {

    private String name;
    private String colour;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    
    public abstract boolean isTasty();
   
}
