/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veggies;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class to show iterable interface
 * Create a meal and prints whether it is tasty
 * @author dancye, 2018
 */
public class StirFry implements Iterable {

    static ArrayList<Vegetable> veggies = new ArrayList<Vegetable>();
    @Override
    public Iterator iterator() {
        return veggies.iterator();
    }
    
    public static void main(String[] args)
    {
        veggies.add(new RedPepper());
        veggies.add(new Onion());
        veggies.add(new Onion());
        
        for(Vegetable v: veggies)
        {
            //fill in with some determination using isTasty
        }
    }
    
}
