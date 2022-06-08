//Imrah Lodewyk
//ST10204001
//Date: 12/05/2022
//PROG5121 Part 2 
package poe;

import javax.swing.JOptionPane;

public class Worker
{

    public int totalNumTasks;
    public String taskName = "";
    public String taskFirstName = "";
    public String taskSurname = "";
    public String taskId = "";
    public String taskStatus;
    public String taskDes = "";
    public String devDetails = "";
    public String status = "";
    public int taskDu;
    public int taskNum;

    public int printLoginMenu3()
    {
        int think = 0;
        while (!(think == 1 || think == 2 || think == 3))
        {
            taskStatus = JOptionPane.showInputDialog(null,
                    "Please a your task's status: \n"
                    + "\t1. To Do\n"
                    + "\t2. Done\n"
                    + "\t3. Doing\n",
                    "Task Status\n",
                    JOptionPane.QUESTION_MESSAGE);

            think = Integer.parseInt(taskStatus);

            if (!(think == 1 || think == 2 || think == 3))
            {
                JOptionPane.showMessageDialog(null,
                        "Invalid input",
                        "Error Detected",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        return think;
    }

    public int printLoginMenu2()
    {
        boolean valid = false;
        String userInput;
        int menu = 0;

        while (!valid)
        {
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");

            //Prompts user to input whether they want to add tasks, report or quit.
            userInput = JOptionPane.showInputDialog(null,
                    "Please choose a selection: \n"
                    + "\t1. Add Tasks\n"
                    + "\t2. Report\n"
                    + "\t3. Quit\n",
                    "Login or Register\n",
                    JOptionPane.QUESTION_MESSAGE);

            if ((userInput == null) || userInput.isEmpty())
            {
                menu = 3;
            } else
            {
                menu = Integer.parseInt(userInput);
            }

            if ((menu < 1) || (menu > 3))
            {
                JOptionPane.showMessageDialog(null,
                        "Invalid input",
                        "Error Detected",
                        JOptionPane.ERROR_MESSAGE);
            } else
            {
                valid = true;
            }
        }
        return menu;
    }

    public int printLoginMenu()
    {
        int selection = 0;
        boolean valid = false;
        String userInput;

        while (!valid)
        {
            //Prompts user to input whether they want to register, login or quit.
            userInput = JOptionPane.showInputDialog(null,
                    "Please choose a selection: \n"
                    + "\t1. Register user\n"
                    + "\t2. Login User\n"
                    + "\t3. Quit\n",
                    "Login or Register\n",
                    JOptionPane.QUESTION_MESSAGE);

            if ((userInput == null) || userInput.isEmpty())
            {
                selection = 3;
            } else
            {
                selection = Integer.parseInt(userInput);
            }

            if ((selection < 1) || (selection > 3))
            {
                JOptionPane.showMessageDialog(null,
                        "Invalid input",
                        "Error Detected",
                        JOptionPane.ERROR_MESSAGE);
            } else
            {
                valid = true;
            }
        }
        return selection;
    }

    public void mainThread()
    {
        int num = 0;
        int pass = 0;
        int selection;
        String username = " ";
        String password = " ";
        String incorrectUser = " ";
        String name = " ";
        String surname = " ";

        Login login = new Login();
        Task task = new Task();
        selection = printLoginMenu();

        name = JOptionPane.showInputDialog(null, "Please enter your name: "); // Prompts user to input their name.
        surname = JOptionPane.showInputDialog(null, "Please enter your surname: ");   // Prompts user to input their surname. 

        if (selection == 1) //Nested if statement for registering the user.
        {
            username = JOptionPane.showInputDialog(null, "Please enter username: "); // Prompts user to input their username.

            if (login.checkUserName(username) == true)
            //If the inputted username is formated correctly then the following messages stating that the username was captured, the loginwas successful will display. A verification message stating true will also display.
            {
                num = 1;
                JOptionPane.showMessageDialog(null, login.registerUser(selection, incorrectUser, num, pass, password));
                JOptionPane.showMessageDialog(null, login.returnLoginString(selection, num, pass));
                JOptionPane.showMessageDialog(null, login.assertTrue(num, pass));
            } else
            {
                while (login.checkUserName(username) == false)
//If the inputted username is formated incorrectly then the following messages stating that the username was not captured, the login was unsuccessful will display. A verification message stating false will also display.
//The while loop will prompt the user to input their username again until it is correctly formated.              
                {
                    num = 2;
                    JOptionPane.showMessageDialog(null, (login.registerUser(selection, incorrectUser, num, pass, password)));
                    JOptionPane.showMessageDialog(null, login.returnLoginString(selection, num, pass));
                    JOptionPane.showMessageDialog(null, login.assertFalse(num, pass));
                    username = JOptionPane.showInputDialog(null, "Please enter username: ");
                }
            }
            password = JOptionPane.showInputDialog(null, "Please enter password: ");

            if (login.checkPasswordComplexity(password) == true)
//If the inputted password is formated correctly then the following messages stating that the password was captured, the login was successful will display. A verification message stating true will also display.
            {
                pass = 1;
                JOptionPane.showMessageDialog(null, (login.registerUser(selection, incorrectUser, num, pass, password)));
                JOptionPane.showMessageDialog(null, login.returnLoginString(selection, num, pass));
                JOptionPane.showMessageDialog(null, login.assertTrue(num, pass));
            } else
            {
                while (login.checkPasswordComplexity(password) == false)
//If the inputted password is formated incorrectly then the following messages stating that the username was not captured, the login was unsuccessful will display. A verification message stating false will also display.
// The while loop will prompt the user to input their password again until it is correctly formated.              
                {
                    pass = 2;
                    JOptionPane.showMessageDialog(null, (login.registerUser(selection, incorrectUser, num, pass, password)));
                    JOptionPane.showMessageDialog(null, login.returnLoginString(selection, num, pass));
                    JOptionPane.showMessageDialog(null, login.assertFalse(num, pass));
                    password = JOptionPane.showInputDialog(null, "Please enter password: ");
                }
            }
        }

        if (selection == 2) //Nested if statement for logging the user in.          
        {
            username = JOptionPane.showInputDialog(null, "Please enter username: ");

            if (login.checkUserName(username) == true)
            {
//If the inputted username is formated correctly then the following messages stating that the username is correct and the login was successful will display. A verification message stating true will also display.
                num = 1;
                JOptionPane.showMessageDialog(null, login.registerUser(selection, incorrectUser, num, pass, password));
                JOptionPane.showMessageDialog(null, login.returnLoginString(selection, num, pass));
                JOptionPane.showMessageDialog(null, login.assertTrue(num, pass));
            } else
            {
                while (login.checkUserName(username) == false)
//If the inputted username is formated incorrectly then the following messages stating that the username is incorrect and the login was unsuccessful will display. A verification message stating false will also display.            
//The while loop will prompt the user to input their username again until it is correct.              
                {
                    num = 2;
                    JOptionPane.showMessageDialog(null, (login.registerUser(selection, incorrectUser, num, pass, password)));
                    JOptionPane.showMessageDialog(null, login.returnLoginString(selection, num, pass));
                    JOptionPane.showMessageDialog(null, login.assertFalse(num, pass));
                    username = JOptionPane.showInputDialog(null, "Please enter username: ");
                }
            }

            password = JOptionPane.showInputDialog(null, "Please enter password: ");

            if (login.checkPasswordComplexity(password) == true)
            {
//If the inputted password is formated correctly then the following messages stating that the password is correct and the login was successful will display. A verification message stating true will also display.                
                pass = 1;
                JOptionPane.showMessageDialog(null, (login.registerUser(selection, incorrectUser, num, pass, password)));
                JOptionPane.showMessageDialog(null, login.returnLoginString(selection, num, pass));
                JOptionPane.showMessageDialog(null, login.assertTrue(num, pass));
            } else
            {
                while (login.checkPasswordComplexity(password) == false)
//If the inputted password is formated incorrectly then the following messages stating that the username is incorrect and the login was unsuccessful will display. A verification message stating false will also display.
//The while loop will prompt the user to input their password again until it is correct.           
                {
                    pass = 2;
                    JOptionPane.showMessageDialog(null, (login.registerUser(selection, incorrectUser, num, pass, password)));
                    JOptionPane.showMessageDialog(null, login.returnLoginString(selection, num, pass));
                    JOptionPane.showMessageDialog(null, login.assertFalse(num, pass));
                    password = JOptionPane.showInputDialog(null, "Please enter password: ");
                }
            }

            if (username.equals(username) && password.equals(password))
//If the login details equal the user's then the code will display a welcome message with their name and surname.
            {
                JOptionPane.showMessageDialog(null, "Welcome " + name + " " + surname + " it is great to see you.");
            }

//-----------------------------------------------------------------------------Part 2-----------------------------------------------------------------------------------------------------------------------------------------
            int select;
            int potato;
            int menu = 0;
            int think = 0;
            boolean valid = false;
            menu = printLoginMenu2();

            while(menu != 3)
            {
            int[] array = new int[taskDu];
            if (menu == 1)
            {
                this.totalNumTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter number of tasks: "));

                if (task.checkNumberOfTasks(totalNumTasks) == true)
                {
                    select = 1;
                    JOptionPane.showMessageDialog(null, task.numberOfTasks(name, selection, select));
                } 
                else
                    while (task.checkNumberOfTasks(totalNumTasks) == false)
                    {
                        select = 2;
                        JOptionPane.showMessageDialog(null, task.numberOfTasks(name, selection, select));
                        totalNumTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter number of tasks: "));
                    }
                for (int i = 1; i <= totalNumTasks; i++)
                {   
                    taskNum = (i -1);
                    
                    JOptionPane.showMessageDialog(null, "Your task number is: " + taskNum);
                    this.taskName = JOptionPane.showInputDialog(null, "Please enter your task's name: ");
                    
                    this.taskDes = JOptionPane.showInputDialog(null, "Please enter your task's description: ");
                        if (task.checkTaskDescription(taskDes) == true)
                        {
                            potato = 1;
                            JOptionPane.showMessageDialog(null, task.TaskDescription(surname, selection, potato));
                        } 
                        else while (task.checkTaskDescription(taskDes) == false)
                        {
                            potato = 2;
                            JOptionPane.showMessageDialog(null, task.TaskDescription(surname, selection, potato));
                            this.taskDes = JOptionPane.showInputDialog(null, "Please enter your task's description: ");
                        }
                        
                    this.taskFirstName = JOptionPane.showInputDialog(null, "Please enter the task developer's name: ");
                    this.taskSurname = JOptionPane.showInputDialog(null, "Please enter your task developer surname: ");
                    this.taskId = task.createTaskID(taskId, taskName, taskNum, taskFirstName);

                    this.taskDu = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your estimated duration of the task in hours: "));
                    
                    think = printLoginMenu3();
                    
                        String newStatus = "";

                            if (think == 1)
                            {
                                newStatus = "To Do";
                            }

                            if (think == 2)
                            {
                                newStatus = "Done";
                            }

                            if (think == 3)
                            {
                                newStatus = "Doing"; 
                            }
                            
                    JOptionPane.showMessageDialog(null, task.createTaskID(taskId, taskName, taskNum, taskFirstName));
                    JOptionPane.showMessageDialog(null, task.printTaskDetails(devDetails, newStatus, taskFirstName, taskSurname, taskNum, taskName, taskDes, taskId, taskDu));
                }
                JOptionPane.showMessageDialog(null, "The total number of hours of all the tasks: " + task.returnTotalHoures(totalNumTasks, array, taskDu)+ "hrs");
            }
            
            if (menu == 2)
            {
                JOptionPane.showMessageDialog(null, "Coming Soon", "Still in development", JOptionPane.INFORMATION_MESSAGE);
                valid = false;
            }
            menu = printLoginMenu2();
            }
        }
    }
}  
//___________________________________________________________________________________________:)_______________________________________________________________________________________________________________________________
