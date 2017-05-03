/*
 * User Ability To Enter Info
    - Firstname, Lastname
 * Ability To Return String Representation Of The User 
 * Store An ID Number (Random Number)
 * Store Reference To 3 Account Instances (Checking, Savings, Vacation)
 *
 * @author swiftycloudmusic
 */
package ist242team5bank;

 //Store Reference To 3 Account Instances
// Instantiate Checking Class
Account _checking = new Account("Checking");

// Instatiate Savings Class
Account _savings = new Account("Savings");

// Instatiate Vacation Class
Account _vacation = new Account("Vacation");

// Scanner
Scanner keyboard = new Scanner(System.in);

// Class Level Variables
private String _firstName = "";
private String _lastName = "";
private String _fullName = "";
private int _userID = 0;

// Prompt User For Fullname 
public String getFullName() 
{        
    // Reads String User Input From Keyboard
    System.out.print("Enter Your Firstname: ");
    _firstName = Helper.inputNonBlankString();
        
    System.out.print("Enter last name: ");
    _lastName = Helper.inputNonBlankString();
        
    _fullName = _firstName + " " + _lastName;
        
    // Return String Representation Of The User
    return _fullName;
    }

    // Set Method For User's Fullname
    public void setFullName(String _fullName) 
    {
        this._fullName = _fullName;
    }

    // Get Method For User's ID
    public int getUserID() 
    {
        return _userID;
    }

    // Set Method For User's ID Number
    public void setUserID(int _userID) 
    {
        // Return Method For User ID 
        this._userID = _userID;
    }

    // Return All User Info
    Random random = new Random();

    public String getUser() 
    {
        _userID = random.nextInt(1000000) + 1;
        return ("Welcome, " + getFullName() + "! [" + _userID + ("]"));    
    }

    // Get Account Checking Method
    Account getChecking() 
    {
        return _checking;
    }

    // Get Account Savings Method
    Account getSavings() 
    {
        return _savings;
    }

    // Get Account Vacation Method
    Account getVacation() 
    {
        return _vacation;
    }

    // Main Class For User 
    public static void main(String[] args) 
    {
       // Create New User 
       User user = new User();
    
       // Transaction transactions = new Transaction();
       ArrayList<Transaction> transactionHistory = new ArrayList<>();
        
       // Printout User 
       System.out.println(user.getUser());
        
       // Printout User ID
       System.out.println(user.getUserID());
    }
