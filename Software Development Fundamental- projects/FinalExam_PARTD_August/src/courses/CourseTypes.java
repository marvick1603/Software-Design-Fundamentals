/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courses;

/**
 *This class should provide the requested 
 * course to SelectCourses class.
 * @author srinivsi 
 */
public class CourseTypes 
{
 public Courses createnewCourse(String type) {
        if (type.equalsIgnoreCase("database")) {
            return new Database();
        } else if (type.equalsIgnoreCase("softwaredesign")) {
            return new SoftwareDesign();
        } else {
            return null;
        }
    }
  
   
}
