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
public class Potato extends Vegg implements Organic
{
public Potato(String n, String c)
    {
        super(n,c);
    }
    @Override
    public boolean isTasty() 
    {
        return false;
    }
   public void grow()
   {
       System.out.println("pesdticides used "+ PESTICIDES_USED);
   }
}
