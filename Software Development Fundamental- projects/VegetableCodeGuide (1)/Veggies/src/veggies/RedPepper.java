/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veggies;

/**
 * Sample vegetable class
 * @author dancye
 */
public class RedPepper extends Vegetable {

    public RedPepper()
    {
        setName("Red Pepper");
    }
    @Override
    public boolean isTasty() {
      return true;   
    }
    
}
