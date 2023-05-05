/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package checkstring;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author patel
 */
public class CheckStringTest {
    
    public CheckStringTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CheckString.
     */
    /*/
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CheckString.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of checkchar method, of class CheckString.
     */
    @Test
    public void testCheckchargood() {
        System.out.println("checkchar good test");
        String s = "abcd123";
        boolean expResult = true;
        boolean result = CheckString.checkchar(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testCheckcharbad() {
        System.out.println("checkchar bad test");
        String s = "xyz";
        boolean expResult = false;
        boolean result = CheckString.checkchar(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testCheckcharboundary() {
        System.out.println("checkchar boundary test");
        String s = "pqrst1";
        boolean expResult = true;
        boolean result = CheckString.checkchar(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
