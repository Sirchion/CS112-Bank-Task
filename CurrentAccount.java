public class CurrentAccount extends BankAccount {
    private int overdrawAmount;


    //Class completed by Craig Murray
    public CurrentAccount(String accountName, String accountID, int overdrawAmount) {
        super(accountName, accountID);
        setOverdrawAmount(overdrawAmount);
    }

    public int getOverdrawAmount() {
        return overdrawAmount;
    }

    public void setOverdrawAmount(int overdrawAmount) {
        if (overdrawAmount < 0)
            this.overdrawAmount = 0;
        else if (overdrawAmount > 300)
            this.overdrawAmount = 300;
        else
            this.overdrawAmount = overdrawAmount;
    }

    @Override
    public boolean withdraw(float amount) {
        if (getBalance() - amount >= -overdrawAmount) {
            deductBalance(amount);
            return true;
        }else{
            return false;
        }

    }

    public void printDetails() {
        System.out.println("Account Name: " + getAccountName());
        //System.out.println("Account id: " + getAccountID());
        System.out.println("Balance: " + getBalance());
        System.out.println("Account type: Current");
        System.out.println("Overdraw: " + overdrawAmount);
    }
}

