// Abdur Ahsan
import java.util.ArrayList;
import java.util.HashMap;
// Class
public class Bank {
    private HashMap<String, BankAccount> idAccountMap;
    private ArrayList<String> idList;

    // Constructor
    public Bank() {
        idAccountMap = new HashMap<>();
        idList = new ArrayList<>();
    }
    // Adding account function
    public void addAccount(String id, BankAccount account) {
        idAccountMap.put(id, account);
        idList.add(id);
    }
    // Removing account function
    public boolean removeAccount(String id) {
        if (idList.remove(id) && idAccountMap.remove(id) != null) {
            return true;
        }
        return false;
    }
    // Function to print instance with matching id
    public void printAllAccounts() {
        for (String id : idList) {
            BankAccount account = idAccountMap.get(id);
            if (account != null) {
                account.printDetails();
            }
        }
    }
    // same as printAllAccounts function but prints Savings Account instance type
    public void printAllSavingsAccounts() {
        for (String id : idList) {
            BankAccount account = idAccountMap.get(id);
            if (account instanceof SavingsAccount) {
                account.printDetails();
            }
        }
    }
    // same as printAllAccounts function but prints Current Account instance types
    public void printAllCurrentAccounts() {
        for (String id : idList) {
            BankAccount account = idAccountMap.get(id);
            if (account instanceof CurrentAccount) {
                account.printDetails();
            }
        }
    }
}
