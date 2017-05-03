/*
 * Date & Time
 * Account(s)
 * Amount
 * Deposit/Withdrawal/Transfer
 * Record Source And Target Account
 * Record And Store Transaction In Transaction Object
 * Report Transactions
 * @author swiftycloudmusic
 */
package ist242team5bank;

// Import Methods
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Transaction 
{
    //Date Field
    private String _date;
    
    // Call Date Field Method
    public String Date() 
    {
        // Create New Date
        Date date = new Date();

        // Format Date Method
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        // Set Date Method
        _date = (dateFormat.format(date));

        // Return Date Method
        return (_date);
    }

    // Main Class For Transaction
    public static void main(String[] args) 
    {
        
    }

    // Report Deposit Or Withdrawal Transactions
    public String Report() 
    {
        return "\nTransaction History\nDate and Time: " + date + "\nAccount: " 
        + _accountType + "\nTransaction type: " + _transactionType + "\nAmount: " + _amount;
    }
    
    // Report Transfer Information
    public String ReportTransfer() 
    {
        return "\nTransfer History\nDate and Time: " + date + "\nSource account: "
                + _accountType + "\nTarget account: " + _targetAccount
                + "\nTransaction type: " + _transactionType
                + "\nAmount: " + _amount;
    }

    // Class Level Variables
    private String _transactionType = "";
    private String _accountType = "";
    private String _targetAccount = "";
    private double _amount = 0;
    private double _accountBalance = 0;
    Date date = new Date();

    // Instantiating A Deposit/Withdraw Transaction
    public Transaction(String _accountType, String _transactionType, double _amount) 
    {
        // Values For Transaction Object
        this.date = date;
        this._accountType = _accountType;
        this._accountBalance = _accountBalance;
        this._transactionType = _transactionType;
        this._amount = _amount;
    }

    // Instantiate Transfer 
    public Transaction(String _accountType, String _targetAccount, String _transactionType, double _amount) {
        //Assigning values revelant to Transaction object
        this.date = date;
        this._accountType = _accountType;
        this._targetAccount = _targetAccount;
        this._accountBalance = _accountBalance;
        this._transactionType = _transactionType;
        this._amount = _amount;
    }
}
