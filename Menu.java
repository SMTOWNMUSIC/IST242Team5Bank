/*
 * Draws Menu
 * User Makes Choice 
 * Returns Choice To Caller
 * Part Of Your Design Is To Determine Menu Choices
 *
 * @author swiftycloudmusic
 */
package ist242team5bank;

// Import Java Utility
import java.util.Scanner

public class Menu 
{
    // Main Class For Menu
    public static void main(String[] args) 
    {
        // Create A New Menu
        Menu menu = new Menu();
        
        // Call Choose Action Method
        System.out.println(menu.chooseAction());

         // Call Choose Account Method
        System.out.println(menu.chooseAccount());
    }
    
    // Scanner
    Scanner keyboard = new Scanner(System.in);

    // Class Level Variables
    String lineEntered = "";
    int actionChoice;
    int accountChoice;
    
    // Choose Action Method
    public int chooseAction() 
    {
        boolean validChoice = false;

        // User's Menu Options
        System.out.println("Choices: ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer");
        System.out.println("4. Report");
        System.out.println("5. Exit");
        
        // Do-While Loop
        do {
            
            // Printout Choice Number 
            System.out.print("Enter Choice Number: ");

            // Read From Keyboard
            lineEntered = keyboard.nextLine();
            
            // Try-Catch Block
            try 
            {
                actionChoice = Integer.parseInt(lineEntered);
                validChoice = true;
                
            } 
            catch (Exception e) 
            {
                String message;
                message = "ERROR: Invalid Input " + e;
                System.out.println(message);
            }
            
        }
        // While Statement
        while (!validChoice);
        
        // Return Method
        return actionChoice;
    }

    // Call Choose Account Method
    public int chooseAccount() 
    {
        // User Account Options
        System.out.println("Choose account: ");
        System.out.println("1. Checking");
        System.out.println("2. Savings");
        System.out.println("3. Vacation");

        boolean validChoice = false;
        
        // Do-While Loop
        do 
        {
            // Printout Choice Number
            System.out.print("Enter Choice Number: ");
            
            // Read From Keyboard
            lineEntered = keyboard.nextLine();

            // Try-Catch Block
            try 
            {
                accountChoice = Integer.parseInt(lineEntered);
                validChoice = true;
                
            } 
            catch (Exception e) 
            {
                String message;
                message = "ERROR: Invalid Input " + e;
                System.out.println(message);
            }  
        }
        
        // While Statement
        while (!validChoice);

        // Return Statement
        return accountChoice;
    }
}
