/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veget;

/**
 *
 * @author sivagamasrinivasan
 */
public abstract class Vegg 
        
{
    private String name;
    private String color;
    public Vegg(String n, String c)
    {
        this.name=n;
        this.color=c;
    }
public abstract boolean isTasty();    

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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
}
