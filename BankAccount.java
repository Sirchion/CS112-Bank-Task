// Christopher Campbell

public abstract class BankAccount {

    public static float lowRate;
    public static float highRate;
    private float balance;
    private String accountName;
    private String accountNumber;

// Constructor

    public BankAccount(String accountName, String accountNumber) {
        setAccountName(accountName);
        setAccountNumber(accountNumber);
// Added this initialization for balance, lowrate and high rate can be removed it needed as it never mentioned to add or not
        setBalance(0);
        setLowRate(0);
        setHighRate(0);
    }


//    Getters for variables
    public static float getLowRate() {
        return lowRate;
    }

    public static float getHighRate() {
        return highRate;
    }

    public float getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

//    Setters for Variables
    public static void setLowRate(float value) {

        if(value < 0) {
            lowRate = 0;
        }
        else lowRate = Math.min(value, highRate);

    }

    public static void setHighRate(float value) {

        if(value > 10) {
            highRate = 10;
        }
        else highRate = Math.max(value, lowRate);
    }

    public void setBalance(float balance){
        this.balance = balance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


//  Methods for Class

    abstract protected void printDetails();

    protected void deductBalance(float value) {
        balance = balance - value;
    }

    public boolean withDraw(float value) {

        if(value > balance) {
            return false;
        }
        else {
            deductBalance(value);
            return true;
        }
    }

}
