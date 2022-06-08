//Imrah Lodewyk
//ST10204001
//Login class test package
package poe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Imrah
 */
public class LoginTest
{
    
    public LoginTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of assertTrue method, of class Login.
     */
    @Test
    public void testAssertTrue()
    {
        System.out.println("assertTrue");
        int num = 0;
        int pass = 0;
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.assertTrue(num, pass);
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of assertFalse method, of class Login.
     */
    @Test
    public void testAssertFalse()
    {
        System.out.println("assertFalse");
        int num = 0;
        int pass = 0;
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.assertFalse(num, pass);
        assertEquals(expResult, result);
    
     
    }

    /**
     * Test of returnLoginString method, of class Login.
     */
    @Test
    public void testReturnLoginString()
    {
        System.out.println("returnLoginString");
        int selection = 0;
        int num = 0;
        int pass = 0;
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginString(selection, num, pass);
        assertEquals(expResult, result);
      
        
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser()
    {
        System.out.println("loginUser");
        String first = "";
        String last = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(first, last);
        assertEquals(expResult, result);
     
      
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser()
    {
        System.out.println("registerUser");
        int selection = 0;
        String incorrectUser = "";
        int num = 0;
        int pass = 0;
        String password = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser(selection, incorrectUser, num, pass, password);
        assertEquals(expResult, result);
       
       
    }

    /**
     * Test of checkIfSpecial method, of class Login.
     */
    @Test
    public void testCheckIfSpecial()
    {
        System.out.println("checkIfSpecial");
        String str = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkIfSpecial(str);
        assertEquals(expResult, result);
      
       
    }

    /**
     * Test of checkIfDigit method, of class Login.
     */
    @Test
    public void testCheckIfDigit()
    {
        System.out.println("checkIfDigit");
        String str = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkIfDigit(str);
        assertEquals(expResult, result);
     
       
    }

    /**
     * Test of checkIfUpper method, of class Login.
     */
    @Test
    public void testCheckIfUpper()
    {
        System.out.println("checkIfUpper");
        String str = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkIfUpper(str);
        assertEquals(expResult, result);
       
     
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity()
    {
        System.out.println("checkPasswordComplexity");
        String str = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(str);
        assertEquals(expResult, result);
        
    
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName()
    {
        System.out.println("checkUserName");
        String str = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName(str);
        assertEquals(expResult, result);
   
       
    }

    /**
     * Test of checkIfEmpty method, of class Login.
     */
    @Test
    public void testCheckIfEmpty()
    {
        System.out.println("checkIfEmpty");
        String str = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkIfEmpty(str);
        assertEquals(expResult, result);
      
       
    }
    
}
