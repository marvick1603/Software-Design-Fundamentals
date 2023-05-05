/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courses;

/** A class that provides the location where courses are offered.
 * We only ever want one location to provide 
 * course database and Softwaredesign to ensure consistency.
 * @author Sivagama Srinivasan 
 */
public class CoursesLocation {
   public int numofstudents = 0;// how many courses to add in semester
    
private static  CoursesLocation location = null;    


    private CoursesLocation()
    {
        System.out.println("Inside constructor");
    }  

public static CoursesLocation getLocation()
{
    if(location == null)
    {
        location= new CoursesLocation();
    }
return location;
} 
}
