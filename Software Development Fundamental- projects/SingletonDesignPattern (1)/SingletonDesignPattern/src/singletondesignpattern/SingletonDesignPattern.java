/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondesignpattern;

/**
 *
 * Singleton design pattern
 */
public class SingletonDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Singleton s1 = Singleton.getInstance();
       Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
         System.out.println(s1);
          System.out.println(s2);
            System.out.println(s3);
    }
    
}
class Singleton
{
//step2: 
private static Singleton v =null;   

//step 1: 
    private Singleton()
    {
        System.out.println("inside constructor");
    }
    //step:3 provide object to other classes
    public static Singleton getInstance()
    {
        if (v == null)
        {
            v = new Singleton();
        }
        return v;
    }
}