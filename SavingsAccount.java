/**
 * Class Written by Jayna Esentia
 */
public class SavingsAccount extends BankAccount {
    private float rate;

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        if (rate < BankAccount.lowRate) {
            this.rate = BankAccount.lowRate;
        }
        if (rate > BankAccount.highRate) {
            this.rate = BankAccount.highRate;
        }
    }

    public SavingsAccount(String accountName, String accountID, float rate){
        super(accountName, accountID);
        setRate(rate);
    }

    public float addinterest () {
        return ((getBalance() * (rate/100)) + getBalance());
    }

    @Override
    protected void printDetails() {
        System.out.println("Account Name: " + getAccountName());
        //System.out.println("Account ID: " + getAccountID());
        System.out.println("Balance: " + getBalance());
        System.out.println("Account Type: Savings");
        System.out.println("Rate: " + rate + "%");
    }
}