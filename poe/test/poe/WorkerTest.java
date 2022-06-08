//Imrah Lodewyk
//ST10204001
//Worker class test package
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
public class WorkerTest
{
    
    public WorkerTest()
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
     * Test of printLoginMenu method, of class Worker.
     */
    @Test
    public void testPrintLoginMenu()
    {
        System.out.println("printLoginMenu");
        Worker instance = new Worker();
        int expResult = 0;
        if(expResult == 1 || expResult == 2 ||expResult == 3)
        {
            int result = instance.printLoginMenu();
            assertEquals(expResult, result);
        }

        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mainThread method, of class Worker.
     */
    @Test
    public void testMainThread()
    {
        System.out.println("mainThread");
        Worker instance = new Worker();
        instance.mainThread();
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
