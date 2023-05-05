/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courses;

import java.util.ArrayList;

/**
 *
 * @author srinivsi 
 */
public class Courses {

    public String collegeName= "Sheridan";
    private ArrayList<String> semester = new ArrayList();
    
    public void listOfCourse(String coursename) 
        {
	semester.add(coursename);
        }

	
	public void certificate(String Name) 
        {
	collegeName=Name;
        }
       
}

    

