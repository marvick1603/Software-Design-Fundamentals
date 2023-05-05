/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veget;

import java.util.ArrayList;

/**
 *
 * @author sivagamasrinivasan
 */
public class Veget {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Vegg> Fry = new ArrayList();
       Vegg v1 = new Onion("onoin","purple");
       Vegg v2 = new Potato("Pota","yell");
       Fry.add(v1);
       Fry.add(v2);
       boolean tasteGood=true;
       for ( Vegg v: Fry)
       {
           if(v.isTasty( ) == false)
           {
               tasteGood = false;
           break;
           
       }
       }
       if(tasteGood)
       {
    System.out.println("taste good "+ tasteGood);
    }
       else
       {
               System.out.println("taste good "+ tasteGood);

       }
 Organic v5 = new Potato("p","y");
 v5.grow();
}
}
