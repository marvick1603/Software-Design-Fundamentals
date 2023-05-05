/*This class take input from user 
what is the course is required.
Then this class should call the 
method to create requested course. 
CourseAdmin can order the number of courses
they want to add to students
 */
package courses;

import java.util.Scanner;

/**
 * August
 * @author srinivsi
  */



/*

DRY Principle:
The SoftwareDesign and Database classes have very
similar code for adding a course name to the list 
of courses. This violates the DRY principle.

Create a Course interface with a listOfCourse()
method to avoid repeating code in the SoftwareDesign 
and Database classes.


*/
public class SelectCourses {
   public static CoursesLocation Brampton = CoursesLocation.getLocation();//we only ever want one 
   // location that offers this course
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to select the course");
        System.out.println("What kind of course do you want?");
        System.out.println("Please enter exactly Database or SoftwareDesign");
        
        /*write code to take input 
         what course is required 
        then create that course*/
        
        System.out.println("how many students would you like to add the course?");
        int studentsno = sc.nextInt();
        Brampton.numofstudents=studentsno;
        // Add the created course to the number of students 
        
            System.out.println("Great job, here is course is added for " + studentsno + " students");
            
        
        //else
        
            System.out.println("Enter a valid Course type");
        
        
    } 
}
