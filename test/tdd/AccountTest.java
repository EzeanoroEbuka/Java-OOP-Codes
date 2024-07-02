package tdd;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AccountTest {

    private Account kimAccount = new Account("Kimberly", "1234567890", "1234");

    @BeforeEach
    public void setUp(){
       kimAccount = new Account("Kimberly", "1234567890", "1234");
    }

    @Test
    public void checkAccountBalance_test() {
        assertEquals(0.00,kimAccount.checkBalance(),0.00);
    }
    @Test
    public void checkThatAccountCanBeDepositedIntoToAccount() {
        kimAccount.deposit(2000);
        assertEquals(2000, kimAccount.checkBalance(),0.00);
    }

    @Test
    public void checkThatAccountBalanceIsIncreasedAtDoubleDeposit() {
        kimAccount.deposit(2000);
        kimAccount.deposit(3000);
        assertEquals(5000, kimAccount.checkBalance(),0.00);
    }

    @Test
    public void checkThatBalanceCanBeWithdrawn_at3kBalance() {
        kimAccount.deposit(3000);
        kimAccount.withDraw(1000);
        assertEquals(2000, kimAccount.checkBalance(),0.00);
    }
    @Test
    public void checkThatAccountWithdrawsAmountThatInNotMoreThanBalance() {
        kimAccount.deposit(3000);
        kimAccount.withDraw(5000);
        assertEquals(3000, kimAccount.checkBalance(),0.00);
    }
    @Test
    public void checkThatAmountBelowZeroCannotBeWithdrawnFromAccount() {
        kimAccount.deposit(3000);
        kimAccount.withDraw(-1000);
        assertEquals(3000, kimAccount.checkBalance(),0.00);
    }
    @Test
    public void checkThatDepositOfNegativeAmountIntoAccountIsNotPossible() {
        kimAccount.deposit(3000);
        kimAccount.deposit(-2000);
        assertEquals(3000, kimAccount.checkBalance(),0.00);
    }
    @Test
    public void checkThatPinValidateWrongPinEntryByThrowingExceptionMessage() {
        kimAccount = new Account("Kimberly", "1234567890", "3115");
        assertThrows("Wrong Pin", IllegalArgumentException.class,()-> kimAccount.validatePin("3210"));
        try{
            kimAccount.validatePin("3210");
        }
        catch(IllegalArgumentException mfon){
            assertEquals("Wrong Pin",mfon.getMessage());
        }
//        assertEquals("Wrong Pin", exception.getMessage());
    }
}
