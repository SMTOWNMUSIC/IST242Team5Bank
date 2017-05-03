/*
 * Each Has A Type (Checking, Savings, Vacation
 * Balance (Amount Of Money In Each Account)
 * Ability To Do This For Any Account The User Chooses
      * Deposit
      * Withdraw 
      * Transfer
 * Will Utilize Transaction To Record Transactions
 * @author swiftycloudmusic
 */
package ist242team5bank;

public class Account 
{
    // Main Class For Account
    public static void main(String[] args) 
    {
       
    }

    // Store User Transaction
    //Transaction transaction = new Transaction();

    // Determine Account Type
    public Account(String _accountType) 
    {
        this._accountType = _accountType;
    }

    // Class Level Variables
    private int _accountID = 0;
    private String _accountType = "";
    private double _accountBalance = 0;

    // Get Account Type Method
    public String getAccountType() 
    {
         return _accountType;
    }

    // Set Account Type Method
    public void setAccountType(String _accountType) 
    {
         this._accountType = _accountType;
    }

    // Get Account Balance Method
    public double getAccountBalance() 
    {
        return _accountBalance;
    }

    // Set Account Balance Method
    public void setAccountBalance(double _accountBalance) 
    {
        this._accountBalance = _accountBalance;
    }

    // Class Level Variable
    private double _amountTransferred = 0;

    // Deposit Money
    public double deposit(double _amount) 
    {
        // If Statement
        if (_amount > 0) 
        {
            _accountBalance += _amount;
        } 
         
        // Else Statement
        else 
        {
            System.out.println("Value must be positive");
        }
        
        // Return Account Balance
        return _accountBalance;
    }

    // Withdraw Method
    public double withdrawal(double _amount) 
    {
        // Class Level Variable
        double withdrawalAmount = 0;
         
        // If Statement    
        if (_accountBalance >= _amount) 
        {
            withdrawalAmount = _amount;
            _accountBalance -= _amount;
        }
         
        // Else Statement
        else 
        {
            // Printout Account Balance
            System.out.println("ERROR: Insufficient Funds. You Can Only Withdraw $" + _accountBalance);
            withdrawalAmount = _accountBalance;
           //_accountBalance -= withdrawalAmount;
        }
         
        // Return Account Balance
        return _accountBalance;
    }

    // Transfer Method
    public void transfer(double _amountTransferred, Account targetAccount) 
    {
        // If Statement
        if (this._accountBalance >= _amountTransferred) 
        {
            this._accountBalance -= _amountTransferred;
            targetAccount._accountBalance += _amountTransferred;
         //  Below is to tell user $x amount transferred to the target account    
         //  System.out.println("$" + _amountTransferred + " Transferred to " + targetAccount);
  
        }
         
        // Else Statement
        else 
        {
            // Printout Amount Transferred
            System.out.println("Amount To Be Transferred Exceeds Balance In " + this.getAccountType());
        }
    }
}
