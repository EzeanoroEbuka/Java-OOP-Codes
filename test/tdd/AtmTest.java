package tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AtmTest {

    @Test
    public void checkAccountbalance_test() {
        Atm kimAtmAccount = new Atm();
        assertEquals(0, kimAtmAccount.checkBalance("pin"));
    }
    @Test
    public void checkThatAccountCanBeDepositedIntoToAccount() {
        Atm kimAtmAccount = new Atm();
        kimAtmAccount.deposit(2000);
        assertEquals(2000, kimAtmAccount.checkBalance("pin"));
    }

    @Test
    public void checkThatAccountBalanceIsIncreasedAtDoubleDeposit() {

        Atm kimAccount = new Atm();
        kimAccount.deposit(2000);
        kimAccount.deposit(3000);
        assertEquals(5000, kimAccount.checkBalance("pin"));
    }

    @Test
    public void checkThatBalanceCanBeWithdrawn_at3kBalance() {

        Atm kimAccount = new Atm();
        kimAccount.deposit(3000);
        kimAccount.withDraw(1000);
        assertEquals(2000, kimAccount.checkBalance("pin"));
    }
    @Test
    public void checkThatAccountWithdrawsAmountThatInNotMoreThanBalance() {

        Atm kimAccount = new Atm();
        kimAccount.deposit(3000);
        kimAccount.withDraw(5000);
        assertEquals(3000, kimAccount.checkBalance("pin"));
    }
    @Test
    public void checkThatAmountBelowZeroCannotBeWithdrawnFromAccount() {

        Atm kimAccount = new Atm();
        kimAccount.deposit(3000);
        kimAccount.withDraw(-1000);
        assertEquals(3000, kimAccount.checkBalance("pin"));
    }
    @Test
    public void checkThatDepositOfNegativeAmountIntoAccountIsNotPossible() {
        Atm olaAccount = new Atm();
        olaAccount.deposit(3000);
        olaAccount.deposit(-2000);
        assertEquals(3000, olaAccount.checkBalance("pin"));
    }
    @Test
    public void checkThatTransferFromOneAccountToAnotherIsPossible() {

        Atm olaAccount = new Atm();
        Atm kimAccount = new Atm();
        olaAccount.deposit(2000);
        kimAccount.transfer(1000,"pin2");
        assertEquals(1000, kimAccount.checkBalance("pin2"));
        assertEquals(1000,olaAccount.checkBalance("pin"));
    }
}
