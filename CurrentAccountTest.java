import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CurrentAccountTest {

    //Class completed by Craig Murray

    @Test
    public void testSetOverdrawAmount() {
        CurrentAccount account = new CurrentAccount("craig murray", "123456", 400);
        account.setOverdrawAmount(-50);
        assertEquals(0, account.getOverdrawAmount());
        account.setOverdrawAmount(400);
        assertEquals(300, account.getOverdrawAmount());
    }

    @Test
    public void testWithdraw() {
        CurrentAccount account = new CurrentAccount("craig murray", "123456", 200);

        assertFalse(account.withdraw(400)); // Withdraw not allowed beyond overdraft
        assertTrue(account.withdraw(200)); //  Withdraw allowed with overdraft
    }
}


