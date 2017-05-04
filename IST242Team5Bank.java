/*
 * Main Class Of Program.
 *
 * @author swiftycloudmusic
 */
package ist242team5bank;

public class IST242Team5Bank 
{
    // Main Class For Program
    public static void main(String[] args) 
    {
        // Create A New Menu
        Menu menu = new Menu();

        // ArrayList for Transaction History / Transfer History
        ArrayList<Transaction> transactionHistory = new ArrayList<>();
        ArrayList<Transaction> transferHistory = new ArrayList<>();
        
        // Create A New User
        User user = new User();

        // Printout Welcome Statement
        System.out.println("Welcome to the Bank!");
        
        // Get User Method
        System.out.println(user.getUser());

        // Do-While Loop
        do 
        {
            // Choose Action Method
            System.out.println(menu.chooseAction());
            
            // Switch Method
            switch (menu.actionChoice) 
            {
                // Case 1
                case 1:
                    System.out.println(menu.chooseAccount());
                    // If Statement
                    if (menu.accountChoice == 1) 
                    {
                        // Printout Statement
                        System.out.println("Checking Account Balance: $" + user._checking.getAccountBalance());

                        double depositAmount = Helper.inputDecimal();
                        user._checking.deposit(depositAmount);
                        
                        // Instantiate Transaction Class
                        Transaction transaction = new Transaction("Checking", "Deposit", depositAmount);
                        transactionHistory.add(transaction);

                        // Printout Account Balance
                        System.out.println("Checking Account Balance: $" + user._checking.getAccountBalance());
                    } 
                    
                    // Else If Statement
                    else if (menu.accountChoice == 2) 
                    {    
                        // Printout Account Balance
                        System.out.println("Savings Account Balance: $" + user._savings.getAccountBalance());

                        double depositAmount = Helper.inputDecimal();
                        user._savings.deposit(depositAmount);

                        // Instantiate Transaction Class
                        Transaction transaction = new Transaction("Savings", "Deposit", depositAmount);
                        transactionHistory.add(transaction);
                        
                        //Savings account balance after
                        System.out.println("Savings Account Balance: $" + user._savings.getAccountBalance());
                    } 
                    
                    // Else If Statement
                    else if (menu.accountChoice == 3) 
                    {
                        // Prinout Vacation Account Balance
                        System.out.println("Vacation Account Balance: $" + user._vacation.getAccountBalance());

                        double depositAmount = Helper.inputDecimal();
                        user._vacation.deposit(depositAmount);
                        
                        // Instantiate Vacation Transaction Class                        
                        Transaction transaction = new Transaction("Vacation", "Deposit", depositAmount);
                        transactionHistory.add(transaction);
                        
                        // Printout Vacation Account Balance
                        System.out.println("Vacation Account Balance: $" + user._vacation.getAccountBalance());
                    }
                    
                    // Break Statement 
                    break;

                // Withdraw
                // Case 2
                case 2:
                    System.out.println(menu.chooseAccount());
                    
                    // If Statement
                    if (menu.accountChoice == 1) 
                    {
                        System.out.println("Checking Account Balance: $" + user._checking.getAccountBalance());

                        double withdrawAmount = Helper.inputDecimal();
                        user._checking.withdrawal(withdrawAmount);
                        
                        // Instantiate Transaction Class    
                        Transaction transaction = new Transaction("Checking", "Withdraw", withdrawAmount);
                        transactionHistory.add(transaction);
                        
                        System.out.println("Checking Account Balance: $" + user._checking.getAccountBalance());

                    } 
                    
                    // Else If Statement
                    else if (menu.accountChoice == 2) 
                    {
                        System.out.println("Savings Account Balance: $" + user._savings.getAccountBalance());

                        double withdrawAmount = Helper.inputDecimal();
                        user._savings.withdrawal(withdrawAmount);
                        
                        // Instantiate Transaction Class
                        Transaction transaction = new Transaction("Savings", "Withdraw", withdrawAmount);
                        transactionHistory.add(transaction);
                        
                        System.out.println("Savings Account Balance: $" + user._savings.getAccountBalance());

                    } 
                    
                    // Else If Statement
                    else if (menu.accountChoice == 3) 
                    {    
                        System.out.println("Vacation Account Balance: $" + user._vacation.getAccountBalance());

                        double withdrawAmount = Helper.inputDecimal();
                        user._vacation.withdrawal(withdrawAmount);
                        
                        // Instantiate Transaction Class                       
                        Transaction transaction = new Transaction("Vacation", "Withdraw", withdrawAmount);
                        transactionHistory.add(transaction);
                        
                        System.out.println("Vacation Account Balance: $" + user._vacation.getAccountBalance());
                    }
                    
                    break;

                // Transfer
                // Case 3
                case 3:
                    System.out.println("Checking Account Balance: $" + user._checking.getAccountBalance());

                    System.out.println("Savings Account Balance: $" + user._savings.getAccountBalance());
                   
                    System.out.println("Vacation Account Balance: $" + user._vacation.getAccountBalance());
                   
                    System.out.println("From Which Account Would You Like To Transfer Money?");
                    System.out.println(menu.chooseAccount());
                    
                    // If Statement
                    if (menu.accountChoice == 1) 
                    {    
                        System.out.println("Checking Account Balance: $" + user._checking.getAccountBalance());
                      
                        System.out.println("From Which Account Would You Like To Transfer Money?");
                        System.out.println(menu.chooseAccount());
                        
                        // If Statement
                        if (menu.accountChoice == 2) 
                        {    
                            System.out.println("Savings Account Balance: $" + user._savings.getAccountBalance());
                            
                            System.out.println("How Much Money Would You Like To Transfer? ");
                            double amount = Helper.inputDecimal();
                            user._checking.transfer(amount, user._savings);
                            
                            // Instantiate Transaction Class                        
                            Transaction transfer = new Transaction("Checking", "Savings", "Transfer", amount);
                            transferHistory.add(transfer);
                            
                            System.out.println("Checking Account Balance: $" + user._checking.getAccountBalance());

                            System.out.println("Savings Account Balance: $" + user._savings.getAccountBalance());
                   
                            System.out.println("Vacation Account Balance: $" + user._vacation.getAccountBalance());                          
                        }
                        // Else If Statement
                        else if (menu.accountChoice == 3) 
                        {
                            System.out.println("Vacation Account Balance: $" + user._vacation.getAccountBalance());
                            
                            System.out.println("How Much Money Would You Like To Transfer? ");
                            double amount = Helper.inputDecimal();
                            user._checking.transfer(amount, user._vacation);
                            
                            // Instantiate Transaction Class 
                            Transaction transfer = new Transaction("Checking", "Vacation", "Transfer", amount);
                            transferHistory.add(transfer);
                            
                            System.out.println("Checking Account Balance: $" + user._checking.getAccountBalance());

                            System.out.println("Savings Account Balance: $" + user._savings.getAccountBalance());
                   
                            System.out.println("Vacation Account Balance: $" + user._vacation.getAccountBalance());                          
                        }
                        
                        // Break Statement
                        break;
                    }
                    // If Statement
                    if (menu.accountChoice == 2) 
                    {    
                        System.out.println("Savings Account Balance: $" + user._savings.getAccountBalance());

                        System.out.println("From Which Account Would You Like To Transfer Money? ");
                        System.out.println(menu.chooseAccount());
                        
                        // If Statement
                        if (menu.accountChoice == 1) 
                        {   
                            System.out.println("Checking Account Balance: $" + user._checking.getAccountBalance());                            
                            
                            System.out.println("How Much Money Would You Like To Transfer? ");
                            double amount = Helper.inputDecimal();
                            user._savings.transfer(amount, user._checking);
                            
                            // Instantiate Transaction Class                         
                            Transaction transfer = new Transaction("Savings", "Checking", "Transfer", amount);
                            transferHistory.add(transfer);
                            
                            System.out.println("Checking Account Balance: $" + user._checking.getAccountBalance());

                            System.out.println("Savings Account Balance: $" + user._savings.getAccountBalance());
                   
                            System.out.println("Vacation Account Balance: $" + user._vacation.getAccountBalance());   
                        } 
                        // Else If Statement
                        else if (menu.accountChoice == 3) 
                        {
                            System.out.println("Vacation Account Balance: $" + user._vacation.getAccountBalance());   
                            
                            System.out.println("How Much Money Would You Like To Transfer? ");
                            double amount = Helper.inputDecimal();
                            user._savings.transfer(amount, user._vacation);
                            
                            // Instantiate Transaction Class                 
                            Transaction transfer = new Transaction("Savings", "Vacation", "Transfer", amount);
                            transferHistory.add(transfer);
                            
                            System.out.println("Checking Account Balance: $" + user._checking.getAccountBalance());

                            System.out.println("Savings Account Balance: $" + user._savings.getAccountBalance());
                   
                            System.out.println("Vacation Account Balance: $" + user._vacation.getAccountBalance());                    
                        }
                        // Break Statement
                        break;
                    }
                    
                    // If Statement
                    if (menu.accountChoice == 3) 
                    {
                        System.out.println("Vacation Account Balance: $" + user._vacation.getAccountBalance());

                        System.out.println("From Which Account Would You Like To Transfer Money? ");
                        System.out.println(menu.chooseAccount());

                        // If Statement
                        if (menu.accountChoice == 1) 
                        {    
                            System.out.println("Checking account balance: $" + user._checking.getAccountBalance());
                            
                            System.out.println("How Much Money Would You Like To Transfer? ");
                            double amount = Helper.inputDecimal();
                            user._vacation.transfer(amount, user._checking);
                            
                            // Instantiate Transaction Class 
                            Transaction transfer = new Transaction("Vacation", "Checking", "Transfer", amount);
                            transferHistory.add(transfer);         
                            
                            System.out.println("Checking Account Balance: $" + user._checking.getAccountBalance());

                            System.out.println("Savings Account Balance: $" + user._savings.getAccountBalance());
                   
                            System.out.println("Vacation Account Balance: $" + user._vacation.getAccountBalance()); 
                        }
                        // Else If Statement
                        else if (menu.accountChoice == 2) 
                        {
                            System.out.println("Savings Account Balance: $" + user._savings.getAccountBalance());
                            
                            System.out.println("How Much Money Would You Like To Transfer? ");
                            double amount = Helper.inputDecimal();
                            user._vacation.transfer(amount, user._savings);
                            
                            // Instantiate Transaction Class 
                            Transaction transfer = new Transaction("Vacation", "Savings", "Transfer", amount);
                            transferHistory.add(transfer);

                            System.out.println("Checking Account Balance: $" + user._checking.getAccountBalance());

                            System.out.println("Savings Account Balance: $" + user._savings.getAccountBalance());
                   
                            System.out.println("Vacation Account Balance: $" + user._vacation.getAccountBalance());                           
                        }
                        // Break Statement
                        break;
                    }
                    // Break Statement        
                    break;

                // Case 4
                case 4:
                    // For Loop
                    // Transaction History
                    for (Transaction element : transactionHistory) 
                    {
                        System.out.println(element.Report());
                    }
                    // For Loop
                    // Transfer History
                    for (Transaction element : transferHistory) {
                        System.out.println(element.ReportTransfer());
                    }
                    
                    break;

                // Case 5
                case 5:
                    System.out.println("Goodbye!");
                    // Break Statement
                    break;
                    
                // If user selects number that is not 1-5
                default:
                    System.out.println("You have entered an invalid choice!");
                    break;
            }
            // Switch Block
            switch (menu.accountChoice) 
            {
            // Checking
            case 1:
                user.getChecking();
                break;

            // Savings
            case 2:
                user.getSavings();
                break;

            // Vacation
            case 3:
                user.getVacation();
                break;
            
            // If user selects something not 1-3
            default:
                System.out.println("You have entered an invalid choice!");
                break;
            }
        } 
        // While Loop
        while (menu.actionChoice != 5);
    }
}
