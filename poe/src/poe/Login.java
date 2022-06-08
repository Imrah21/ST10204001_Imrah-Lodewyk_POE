//Imrah Lodewyk
//ST10204001
//Date: 8/06/2022
//PROG5121 Part 2
package poe;

public class Login
{
    // Declaring and encapsulating class variables    
    private final int MIN_PASSWORD = 8; // Setting the minimum length of the password to 8 characters
    private final String UNDERSCORE  = "_";
    private final int MAX_USERNAME = 5; // Setting the maximum length of the username to 5 characters
    private final String SPECIAL = " !@#$%^&*()_+-`~[]{}|\\/:;'''<>,.?";
   
    public boolean assertTrue (int num, int pass)
    { 
    boolean checked = false;
 
        if(num == 1 || pass == 1)
        {   
            checked = true;
        }

    return checked; 
    }
    
    public boolean assertFalse (int num, int pass)
    { 
    boolean checked = false;
        if(num == 2 || pass == 2)
        {
            checked = false;
        }   
    return checked; 
    }

    public String returnLoginString (int selection, int num, int pass)
     {
        String right = ""; 
        if(num == 1 || pass == 1)
        {   
             right = "Successful login";
        }
        else if(num == 2 || pass == 2)
        {
            right = "Failed login";
        }
       return right; //This method returns messaging for either a successful or failed login.
    }
 
    public boolean loginUser(String first, String last)
    {
        String name = first;
        String surname = last;
        boolean valid = false;
        
        if(name.equals("Kyle")  && surname.equals("Smith"))
        {
            valid = true;   
        }
        return valid; //This method verifies the login details entered.
    }
    
     public String registerUser(int selection, String incorrectUser, int num, int pass, String password)
    {      
        if(selection == 1) //Nested if statement checks if the username and password conditions have been met and if the user has been registered successfully.
        {
            if(num == 1)
            {
           incorrectUser = "Username successfully captured";
            }
            else if(num == 2)
            {
             incorrectUser = "Username is not correctly formatted,"
                + " \nplease ensure that your username contains an underscore and"
                + "\nis no more than 5 characters in length.";
            }  
            if(selection == 1)
            {
             if(pass == 1)
            {
              password = "Password successfully captured";
              return (password);
            }  
            else if(pass == 2)
            {
              password = "Password is not correctly formatted,\n" +
                "please ensure that the password contains\n" +
                "at least 8 characters, a capital letter, a number and\n" +
                "a special character.";
                return (password);
            }
          }    
        }
        
        if(selection == 2)//Nested if statement checks if the username and password conditions have been met and if the user has been logged in successfully.
        {
            if(num == 1)
            {
           incorrectUser = "Username successfully captured";
            }
            else if(num == 2)
            {
             incorrectUser = "Username is not correctly formatted,"
                + " \nplease ensure that your username contains an underscore and"
                + "\nis no more than 5 characters in length.";
            } 
        
        if(selection == 2)
        {
           if(pass == 1)
            {
              password = "Password successfully captured";
              return (password);
            }
            else if(pass == 2)
            {
              password = "Password is not correctly formatted,\n" +
                "please ensure that the password contains\n" +
                "at least 8 characters, a capital letter, a number and\n" +
                "a special character.";
                return (password);
            }
          }    
        }
        return (incorrectUser);
    }
 
    public boolean checkIfSpecial(String str) 
    {
        boolean valid = false;
       
        for(int counter = 0; counter < SPECIAL.length(); counter++)
        {
            String toCheck = Character.toString(SPECIAL.charAt(counter));
            if (str.contains(toCheck))
            {
               valid = true;
                break;                   
            }
        }
        
        return valid;
    }
    
    public boolean checkIfDigit(String str) 
    {
        boolean valid = false;
        
        for (int counter = 0; counter < str.length(); counter++)
        {
            if(Character.isDigit(str.charAt(counter)))
            {
                valid = true;
                break;
            }
        } 
        return valid;
    }
    public boolean checkIfUpper(String str)
    {
        boolean valid = false;
        for (int counter = 0; counter < str.length(); counter++)
        {
            if(Character.isUpperCase(str.charAt(counter)))
            {
                valid = true;
                break;
            }
        } 
        return valid;
    }
    
    public boolean checkPasswordComplexity(String str) //Method checks if the input for the password is correctly written accorrding to set condtitions  
    {
        boolean  valid = false; 
        if ((checkIfEmpty(str)) && (str.length() >= MIN_PASSWORD))
        {
            if ((checkIfUpper(str)) && (checkIfDigit(str)))
            {
                if (checkIfSpecial(str))
                {
                    valid = true;
                }
            }
        }
        return valid;
    }      
   
    public boolean checkUserName(String str) //Method checks if the input for the username is correctly written accorrding to set condtitions       
    {
        boolean valid = false; 
        if(checkIfEmpty(str))
            {
               if (str.length() <= MAX_USERNAME)
               {
                   if (str.contains(UNDERSCORE))
                   {
                       valid = true;
                   }
               }
            }
        return valid;
    }
    
    public boolean checkIfEmpty(String str)
    {
            boolean valid = false;
            
            if((str != null) && (!str.isEmpty()))
            {
                valid = true;
            }
        return valid;
    }
}
//___________________________________________________________:)____________________________________________________