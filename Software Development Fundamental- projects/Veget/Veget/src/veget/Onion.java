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
public class Onion extends Vegg
{
    public Onion(String n, String c)
    {
        super(n,c);
    }
   @Override
   public boolean isTasty()
   {
       return true;
   }
}
