
package poe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TaskTest
{
    
    public TaskTest()
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

    @Test
    public void testTaskNumber()
    {
        System.out.println("taskNumber");
        int num = 0;
        Task instance = new Task();
        int expResult = 0;
        int result = instance.taskNumber(num);
        assertEquals(expResult, result);

    }

 
    @Test
    public void testCreateTaskID()
    {
        System.out.println("createTaskID");
        String taskId = "";
        String taskFirstName = "";
        int taskNum = 0;
        String taskSurname = "";
        Task instance = new Task();
        String expResult = "";
        String result = instance.createTaskID(taskId, taskFirstName, taskNum, taskSurname);
        assertEquals(expResult, result);

    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription()
    {
        System.out.println("checkTaskDescription");
        String taskDes = "";
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.checkTaskDescription(taskDes);
        assertEquals(expResult, result);

    }

    /**
     * Test of TaskDescription method, of class Task.
     */
    @Test
    public void testTaskDescription()
    {
        System.out.println("TaskDescription");
        String curry = "";
        int selection = 0;
        int potato = 0;
        Task instance = new Task();
        String expResult = "";
        String result = instance.TaskDescription(curry, selection, potato);
        assertEquals(expResult, result);

    }

    /**
     * Test of checkNumberOfTasks method, of class Task.
     */
    @Test
    public void testCheckNumberOfTasks()
    {
        System.out.println("checkNumberOfTasks");
        int totalNumTasks = 0;
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.checkNumberOfTasks(totalNumTasks);
        assertEquals(expResult, result);

    }


    @Test
    public void testNumberOfTasks()
    {
        System.out.println("numberOfTasks");
        String numt = "";
        int selection = 0;
        int select = 0;
        Task instance = new Task();
        String expResult = "";
        String result = instance.numberOfTasks(numt, selection, select);
        assertEquals(expResult, result);

    }
    
}
