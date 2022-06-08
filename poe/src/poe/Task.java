//Imrah Lodewyk
//ST10204001
//Date: 8/06/2022
//PROG5121 Part 2
package poe;

public class Task
{

    public String printTaskDetails(String details, String newStatus, String taskFirstName, String taskSurname, int taskNum, String taskName, String taskDes, String taskId, int taskDu)
    {
        details = "Task Status: " + newStatus
                + "\nDeveloper Details: " + taskFirstName + " " + taskSurname
                + "\nTask Number: " + taskNum
                + "\nTask Name: " + taskName
                + "\nTask Description: " + taskDes
                + "\nTask ID: " + taskId
                + "\nTask Duration: " + taskDu + "hrs";
        return details;
    }

    public int returnTotalHoures(int totalTaskDu, int[] array, int taskDu)
    {
        int temp = 0;
        for (int i = 0; i < array.length; ++i) 
       {
           totalTaskDu = temp + taskDu;  
       }
        return totalTaskDu;
    }

    public int taskNumber(int num)
    {
       int taskNum = num ;
        return taskNum;
    }

    public String createTaskID(String taskId, String taskName, int taskNum, String taskFirstName)
    {
        taskId = taskName.substring(0, 2).toUpperCase().trim() + ":" + taskNum + ":" + taskFirstName.substring(taskFirstName.length() - 3).toUpperCase().trim();
        return taskId;
    }

    public boolean checkTaskDescription(String taskDes)
    {
        boolean pea = false;
        int boo = taskDes.length();
        if (boo < 50)
        {
            pea = true;
        }
        return pea;
    }

    public String TaskDescription(String curry, int selection, int potato)
    {
        if (selection == 2)
        {
            if (potato == 1)
            {
                curry = "Task successfully captured";
            } else if (potato == 2)
            {
                curry = "Please enter a task description of less than 50 character";
            }
        }
        return curry;
    }

    public boolean checkNumberOfTasks(int totalNumTasks)
    {
        boolean bean = false;
        if (totalNumTasks < 6)
        {
            bean = true;
        }
        return bean;
    }

    public String numberOfTasks(String numt, int selection, int select)
    {
        if (selection == 2)
        {
            if (select == 1)
            {
                numt = "Number of tasks successfully captured.";
            } else if (select == 2)
            {
                numt = "Incorrect number of tasks entered. Only 5 or less tasks allowed.";
            }
        }
        return numt;
    }
}
