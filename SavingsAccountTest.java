/**
 * Test Class Written by Jayna Esentia
 */

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingsAccountTest {
    @Test
    public void testSetRateLow() {
        SavingsAccount account = new SavingsAccount("Jayna", "123", 2);

        account.setRate(-2);
        assertEquals(BankAccount.lowRate, account.getRate());
    }

    @Test
    public void testSetRateHigh() {
        SavingsAccount account = new SavingsAccount("Jayna", "123", 2);

        account.setRate(20);
        assertEquals((BankAccount.highRate), account.getRate());
    }

    @Test
    public void testaddInterest(){
        SavingsAccount account = new SavingsAccount("Jayna", "123", 2);
        account.setBalance(300);
        assertEquals(306, account.addinterest());

        account.setBalance(-300);
        assertEquals(-18, account.addinterest());
    }


}
